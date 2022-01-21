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
public class AirplanesCapacityDisplay extends javax.swing.JFrame {

    /**
     * Creates new form AirplanesCapacityDisplay
     */
    public AirplanesCapacityDisplay() {
        initComponents();
    }
    
    /*
    functie ce creeaza lista de avioane prin conectarea bazei de date,
    trimiterea interogarii la baza de date si introducerea a fiecarei
    valori returnate de baza de date in lista de avioane
    */
    
    public ArrayList<Airplanes> getAirplanesList() {
        
        ArrayList<Airplanes> airplanesList = new ArrayList<>();
        
        try {
            String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
            String username = "sa";
            String password = "herooftheworld";
            Connection con = DriverManager.getConnection(connectionUrl, username, password);
            String airline = Home.airlineText.getText();
            String capacity = capacityTextField.getText();
            String selectQuery = "SELECT A.AvionID, A.CompanieID, A.Producator, A.Model, A.An, A.Tip, A.Capacitate FROM Avioane as A " +
                                 "WHERE A.Capacitate >= " + capacity + " AND A.AvionID IN " +
                                    "(SELECT A.AvionID FROM Avioane as A INNER JOIN CompaniiAeriene as CA ON A.CompanieID = CA.CompanieID " +
                                        "WHERE CA.Nume = '" + airline + "');";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectQuery);
            Airplanes airplane;
            while (rs.next()) {
                airplane = new Airplanes(rs.getInt("AvionID"), rs.getInt("CompanieID"), rs.getString("Producator"), rs.getString("Model"),
                                        rs.getInt("An"), rs.getString("Tip"), rs.getInt("Capacitate"));
                airplanesList.add(airplane);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return airplanesList;
        
    }
    
    //afiseaza avioanele in JTable
    public void showAirplanes() {
        
        ArrayList<Airplanes> airplanesList = getAirplanesList();
        DefaultTableModel model = (DefaultTableModel) displayAirplanes.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < airplanesList.size(); i++) {
            row[0] = airplanesList.get(i).getManufacturer();
            row[1] = airplanesList.get(i).getModel();
            row[2] = airplanesList.get(i).getYear();
            row[3] = airplanesList.get(i).getType();
            row[4] = airplanesList.get(i).getCapacity();
            model.addRow(row);
        }
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        displayAirplanes = new javax.swing.JTable();
        backToMenuButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        capacityTextField = new javax.swing.JTextField();
        displayAirplanesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FLAssistant");

        displayAirplanes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producator", "Model", "An", "Tip", "Capacitate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(displayAirplanes);

        backToMenuButton.setText("< Inapoi la meniu");
        backToMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Avioanele cu o capacitate mai mare decat (introduceti valoarea)");

        displayAirplanesButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        displayAirplanesButton.setText("Afiseaza");
        displayAirplanesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAirplanesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backToMenuButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(capacityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(displayAirplanesButton)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(capacityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayAirplanesButton))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backToMenuButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backToMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuButtonActionPerformed
        dispose();
    }//GEN-LAST:event_backToMenuButtonActionPerformed

    private void displayAirplanesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAirplanesButtonActionPerformed
        if (capacityTextField.getText().equals("")) { //daca NU s-a introdus o valoare pentru capacitate
            new PassengersInsertFail().setVisible(true); //afiseaza mesaj de eroare
        } else {
            DefaultTableModel model = (DefaultTableModel) displayAirplanes.getModel();
            model.setRowCount(0);
            showAirplanes();
            //altfel goleste tabelul de date anterioare si repopuleaza-l
        }
        capacityTextField.setText("");
    }//GEN-LAST:event_displayAirplanesButtonActionPerformed

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
                new AirplanesCapacityDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMenuButton;
    private javax.swing.JTextField capacityTextField;
    private javax.swing.JTable displayAirplanes;
    private javax.swing.JButton displayAirplanesButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
