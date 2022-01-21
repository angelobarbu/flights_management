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
public class EmployeesModify extends javax.swing.JFrame {

    /**
     * Creates new form EmployeesModify
     */
    public EmployeesModify() {
        initComponents();
    }

    public boolean modifyEmployee() {
        
        String nationalID = IDTextField.getText();
        String lastName = nameTextField.getText();
        String firstName = firstNameTextField.getText();
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String country = countryTextField.getText();
        String position = positionText.getText();
        String salary = salaryText.getText();
        
        
        if (nationalID.equals("")) {
            return false;
        } else {
        
        
        
            if (!lastName.equals("")) {
                try {

                String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
                String username = "sa";
                String password = "herooftheworld";

                Connection con = DriverManager.getConnection(connectionUrl, username, password);

                String query = "UPDATE Angajati SET Nume = '" + lastName + "' WHERE CNP = '" + nationalID + "';";
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

                String query = "UPDATE Angajati SET Prenume = '" + firstName + "' WHERE CNP = '" + nationalID + "';";
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

                String query = "UPDATE Angajati SET Adresa = '" + address + "' WHERE CNP = '" + nationalID + "';";
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

                String query = "UPDATE Angajati SET Oras = '" + city + "' WHERE CNP = '" + nationalID + "';";
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

                String query = "UPDATE Angajati SET Tara = '" + country + "' WHERE CNP = '" + nationalID + "';";
                PreparedStatement pSt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                ResultSet rs = pSt.executeQuery();



                } catch(SQLException e) {
                    e.printStackTrace();
                    return false;

                }
            }

            if (!position.equals("")) {
                try {

                String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
                String username = "sa";
                String password = "herooftheworld";

                Connection con = DriverManager.getConnection(connectionUrl, username, password);

                String query = "UPDATE Angajati SET Pozitie = '" + position + "' WHERE CNP = '" + nationalID + "';";
                PreparedStatement pSt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                ResultSet rs = pSt.executeQuery();



                } catch(SQLException e) {
                    e.printStackTrace();
                    return false;

                }
            }

            if (!salary.equals("")) {
                try {

                String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
                String username = "sa";
                String password = "herooftheworld";

                Connection con = DriverManager.getConnection(connectionUrl, username, password);

                String query = "UPDATE Angajati SET Salariu = " + salary + " WHERE CNP = '" + nationalID + "';";
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

        jLabel1 = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        countryLabel = new javax.swing.JLabel();
        positionLabel = new javax.swing.JLabel();
        salaryLabel = new javax.swing.JLabel();
        countryTextField = new javax.swing.JTextField();
        positionText = new javax.swing.JTextField();
        salaryText = new javax.swing.JTextField();
        backToMenuButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FLAssistant");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Modifica datele angajatului");

        IDLabel.setText("CNP/ID *");

        nameLabel.setText("Nume");

        firstNameLabel.setText("Prenume");

        addressLabel.setText("Adresa");

        cityLabel.setText("Oras");

        countryLabel.setText("Tara");

        positionLabel.setText("Pozitie");

        salaryLabel.setText("Salariu");

        backToMenuButton.setText("< Inapoi la meniu");
        backToMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuButtonActionPerformed(evt);
            }
        });

        modifyButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        modifyButton.setText("Modifica");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDLabel)
                                    .addComponent(nameLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IDTextField)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameLabel)
                                    .addComponent(addressLabel)
                                    .addComponent(cityLabel)
                                    .addComponent(countryLabel)
                                    .addComponent(positionLabel)
                                    .addComponent(salaryLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameTextField)
                                    .addComponent(addressTextField)
                                    .addComponent(cityTextField)
                                    .addComponent(countryTextField)
                                    .addComponent(positionText)
                                    .addComponent(salaryText)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backToMenuButton)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modifyButton)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLabel)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityLabel)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countryLabel)
                    .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(positionLabel)
                    .addComponent(positionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salaryLabel)
                    .addComponent(salaryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(modifyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(backToMenuButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backToMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuButtonActionPerformed
        dispose();
    }//GEN-LAST:event_backToMenuButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        if(modifyEmployee()) {
            new ModifySuccess().setVisible(true);
        } else {
            new ModifyError().setVisible(true);
        }
    }//GEN-LAST:event_modifyButtonActionPerformed

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
                new EmployeesModify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton backToMenuButton;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JTextField countryTextField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton modifyButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JTextField positionText;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JTextField salaryText;
    // End of variables declaration//GEN-END:variables
}
