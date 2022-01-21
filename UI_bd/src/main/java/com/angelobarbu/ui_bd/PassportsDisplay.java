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
public class PassportsDisplay extends javax.swing.JFrame {

    /**
     * Creates new form PassportsDisplay
     */
    public PassportsDisplay() {
        initComponents();
    }
    
    
    /*
    functie ce creeaza lista de pasageri prin conectarea bazei de date,
    trimiterea interogarii la baza de date si introducerea a fiecarei
    valori returnate de baza de date in lista de pasageri
    */
    public ArrayList<Passengers> getPassengersList() {
        
        ArrayList<Passengers> passengersList = new ArrayList<>();
        
        try {
            String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
            String username = "sa";
            String password = "herooftheworld";
            Connection con = DriverManager.getConnection(connectionUrl, username, password);
            String airline = Home.airlineText.getText();
            String date = dateTextField.getText();
            String selectQuery = "SELECT * from Pasageri AS P INNER JOIN PasageriZboruri AS PZ ON P.PasagerID = PZ.PasagerID WHERE PZ.ZborID IN " +
                                    "(SELECT Z.ZborID FROM Zboruri as Z INNER JOIN CompaniiAeriene as CA ON Z.CompanieID = CA.CompanieID WHERE Z.Data = '" + date + "' AND CA.CompanieID IN " +
                                        "(SELECT CompanieID From CompaniiAeriene WHERE Nume = '" + airline + "'));"; 
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectQuery);
            Passengers passenger;
            while (rs.next()) {
                passenger = new Passengers(rs.getInt("PasagerID"), rs.getString("Nume"), rs.getString("Prenume"), rs.getString("NrPasaport"),
                                        rs.getString("Adresa"), rs.getString("Oras"), rs.getString("Tara"), rs.getDate("DataNasterii"));
                passengersList.add(passenger);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return passengersList;
        
    }
    
    //afiseaza datele pasapoartelor
    public void showPassports() {
        
        ArrayList<Passengers> passengersList = getPassengersList();
        DefaultTableModel model = (DefaultTableModel) displayPassports.getModel();
        Object[] row = new Object[3];
        for (int i = 0; i < passengersList.size(); i++) {
            row[0] = passengersList.get(i).getPassportNo();
            row[1] = passengersList.get(i).getLastName();
            row[2] = passengersList.get(i).getFirstName();
            model.addRow(row);
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        displayPassports = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        showPassportsButton = new javax.swing.JButton();
        backToMenuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FLAssistant");

        displayPassports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nr Pasaport", "Nume", "Prenume"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(displayPassports);

        jLabel1.setText("Introduceti data de interes");

        dateTextField.setText("(YYYY-MM-DD)");
        dateTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateTextFieldMouseClicked(evt);
            }
        });

        showPassportsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        showPassportsButton.setText("Afiseaza");
        showPassportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassportsButtonActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(showPassportsButton)
                .addGap(0, 24, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backToMenuButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPassportsButton))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backToMenuButton)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dateTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateTextFieldMouseClicked
        dateTextField.setText("");
    }//GEN-LAST:event_dateTextFieldMouseClicked

    private void showPassportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassportsButtonActionPerformed
        if (dateTextField.equals("")) { //daca NU s-a introdus o data valida
            new PassengersInsertFail().setVisible(true); //afiseaza mesaj de eroare
        } else {
            DefaultTableModel model = (DefaultTableModel) displayPassports.getModel();
            model.setRowCount(0);
            showPassports();
            //altfel goleste JTable-ul de valori anterioare si repopuleaza
        }
        dateTextField.setText("");
    }//GEN-LAST:event_showPassportsButtonActionPerformed

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
                new PassportsDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMenuButton;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JTable displayPassports;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showPassportsButton;
    // End of variables declaration//GEN-END:variables
}
