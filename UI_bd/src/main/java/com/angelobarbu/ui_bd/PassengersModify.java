/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.angelobarbu.ui_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.UIManager;

/**
 *
 * @author Angelo
 */
public class PassengersModify extends javax.swing.JFrame {

    /**
     * Creates new form AirplaneModify
     */
    public PassengersModify() {
        initComponents();
    }

    public boolean modifyPassenger() {
        
        String passportNo = IDTextField.getText();
        String lastName = nameTextField.getText();
        String firstName = firstNameTextField.getText();
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String country = countryTextField.getText();
        
        
         if (passportNo.equals("")) {
            return false;
        } else {
        
            if (!lastName.equals("")) {
                try {

                String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
                String username = "sa";
                String password = "herooftheworld";

                Connection con = DriverManager.getConnection(connectionUrl, username, password);

                String query = "UPDATE Pasageri SET Nume = '" + lastName + "' WHERE NrPasaport = '" + passportNo + "';";
                PreparedStatement pSt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                ResultSet rs = pSt.executeQuery();



                } catch(SQLException e) {
                    e.printStackTrace();
                    return false;

                }
            }
            
            
            if (!firstName.equals("")) {
                try {

                String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
                String username = "sa";
                String password = "herooftheworld";

                Connection con = DriverManager.getConnection(connectionUrl, username, password);

                String query = "UPDATE Pasageri SET Prenume = '" + firstName + "' WHERE NrPasaport = '" + passportNo + "';";
                PreparedStatement pSt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                ResultSet rs = pSt.executeQuery();



                } catch(SQLException e) {
                    e.printStackTrace();
                    return false;

                }
            }
            
            if (!address.equals("")) {
                try {

                String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
                String username = "sa";
                String password = "herooftheworld";

                Connection con = DriverManager.getConnection(connectionUrl, username, password);

                String query = "UPDATE Pasageri SET Adresa = '" + address + "' WHERE NrPasaport = '" + passportNo + "';";
                PreparedStatement pSt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                ResultSet rs = pSt.executeQuery();



                } catch(SQLException e) {
                    e.printStackTrace();
                    return false;

                }
            }
            
            
            if (!city.equals("")) {
                try {

                String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
                String username = "sa";
                String password = "herooftheworld";

                Connection con = DriverManager.getConnection(connectionUrl, username, password);

                String query = "UPDATE Pasageri SET Oras = '" + city + "' WHERE NrPasaport = '" + passportNo + "';";
                PreparedStatement pSt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                ResultSet rs = pSt.executeQuery();



                } catch(SQLException e) {
                    e.printStackTrace();
                    return false;

                }
            }
            
            if (!country.equals("")) {
                try {

                String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
                String username = "sa";
                String password = "herooftheworld";

                Connection con = DriverManager.getConnection(connectionUrl, username, password);

                String query = "UPDATE Pasageri SET Tara = '" + country + "' WHERE NrPasaport = '" + passportNo + "';";
                PreparedStatement pSt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                ResultSet rs = pSt.executeQuery();



                } catch(SQLException e) {
                    e.printStackTrace();
                    return false;

                }
            }
            
             
        }
          
         
         
        return true;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLabel = new javax.swing.JLabel();
        passportNoLabel = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        countryTextField = new javax.swing.JTextField();
        modifyPassengerButton = new javax.swing.JButton();
        backToMenuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FLAssistant");

        headerLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        headerLabel.setText("Modifica datele pasagerului");

        passportNoLabel.setText("Nr Pasaport *");

        nameLabel.setText("Nume");

        firstNameLabel.setText("Prenume");

        jLabel1.setText("Adresa");

        jLabel2.setText("Oras");

        jLabel3.setText("Tara");

        modifyPassengerButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        modifyPassengerButton.setText("Modifica");
        modifyPassengerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyPassengerButtonActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(addressTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passportNoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(firstNameTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(headerLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(modifyPassengerButton)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(countryTextField)
                                            .addComponent(cityTextField)))))
                            .addComponent(backToMenuButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passportNoLabel)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(modifyPassengerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(backToMenuButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backToMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuButtonActionPerformed
        dispose();
    }//GEN-LAST:event_backToMenuButtonActionPerformed

    private void modifyPassengerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyPassengerButtonActionPerformed
        if (modifyPassenger()) {
            new ModifySuccess().setVisible(true);
        } else {
            new ModifyError().setVisible(true);
        }
    }//GEN-LAST:event_modifyPassengerButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch(Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassengersModify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDTextField;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton backToMenuButton;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JTextField countryTextField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton modifyPassengerButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel passportNoLabel;
    // End of variables declaration//GEN-END:variables
}
