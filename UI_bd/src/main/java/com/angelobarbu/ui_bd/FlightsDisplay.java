/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.angelobarbu.ui_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angelo
 */
public class FlightsDisplay extends javax.swing.JFrame {

    /**
     * Creates new form FlightsDisplay
     */
    public FlightsDisplay() {
        initComponents();
        showFlights();
    }

    /*
    functie ce creeaza lista de zboruri prin conectarea bazei de date,
    trimiterea interogarii la baza de date si introducerea a fiecarei
    valori returnate de baza de date in lista de zboruri
    */
    
    public ArrayList<Flights> getFlightsList() {
        
        ArrayList<Flights> flightsList = new ArrayList<>();
        
        try {
            String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
            String username = "sa";
            String password = "herooftheworld";
            Connection con = DriverManager.getConnection(connectionUrl, username, password);
            String airline = Home.airlineText.getText();
            String selectQuery = "SELECT Z.NrZbor, Z.Tip, A.Oras, Z.Data, Z.OraPlecare, Z.OraSosire FROM Zboruri as Z INNER JOIN Aeroporturi AS A " +
                                 "ON Z.AeroportID = A.AeroportID WHERE Z.CompanieID IN " +
                                    "(SELECT Z.CompanieID FROM Zboruri AS Z INNER JOIN CompaniiAeriene as CA ON Z.CompanieID = CA.CompanieID " + 
                                        "WHERE CA.Nume = '" + airline + "');";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectQuery);
            Flights flight;
            while (rs.next()) {
                flight = new Flights(rs.getString("NrZbor"), rs.getString("Tip"), rs.getString("Oras"), rs.getDate("Data"), rs.getTime("OraPlecare"), rs.getTime("OraSosire"));
                flightsList.add(flight);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flightsList;
        
    }
    
    //functie pt afisarea zborurilor
    public void showFlights() {
        
        ArrayList<Flights> flightsList = getFlightsList();
        DefaultTableModel model = (DefaultTableModel) displayFlights.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < flightsList.size(); i++) {
            
            row[0] = flightsList.get(i).getFlightNo();
            row[1] = flightsList.get(i).getType();
            row[2] = flightsList.get(i).getDestination();
            row[3] = flightsList.get(i).getDate();
            row[4] = flightsList.get(i).getDepTime();
            row[5] = flightsList.get(i).getArrTime();
            model.addRow(row);
        }
        
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        displayFlights = new javax.swing.JTable();
        backToMenuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FLAssistant");

        displayFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nr Zbor", "Tip", "Destinatie", "Data", "Ora Plecare", "Ora Sosire"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(displayFlights);

        backToMenuButton.setText("< Inapoi la meniu");
        backToMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backToMenuButton)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backToMenuButton)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backToMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuButtonActionPerformed
        dispose();
    }//GEN-LAST:event_backToMenuButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch(Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightsDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMenuButton;
    private javax.swing.JTable displayFlights;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
