/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.angelobarbu.ui_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.UIManager;

/**
 *
 * @author Angelo
 */
public class HubDisplay extends javax.swing.JFrame {

    /**
     * Creates new form HubDisplay
     */
    public HubDisplay() {
        initComponents();
        showHub();
    }
    
    /*
    functie ce afiseaza informatiile despre hub-ul companiei aeriene
    prin conectarea bazei de date, trimiterea interogarii la baza de date si
    introducerea valorilor returnate de baza de date in label-urile specifice
    */
    
    public void showHub() {
        try {
            
            String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
            String username = "sa";
            String password = "herooftheworld";
            Connection con = DriverManager.getConnection(connectionUrl, username, password);
            String airline = Home.airlineText.getText();
            String selectQuery = "SELECT A.Nume, A.Oras, A.Tara FROM Aeroporturi AS A " + 
                                 "INNER JOIN CompaniiAeriene AS CA ON CA.HubID = A.AeroportID " +
                                 "WHERE CA.Nume = '" + airline + "';";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectQuery);
            
            while (rs.next()) {
                nameText.setText(rs.getString("Nume"));
                cityText.setText(rs.getString("Oras"));
                countryText.setText(rs.getString("Tara"));
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        backToMenuButton = new javax.swing.JButton();
        nameText = new javax.swing.JLabel();
        cityText = new javax.swing.JLabel();
        countryText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FLAssistant");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameLabel.setText("Nume:");

        cityLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cityLabel.setText("Oras:");

        countryLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        countryLabel.setText("Tara:");

        backToMenuButton.setText("< Inapoi la meniu");
        backToMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuButtonActionPerformed(evt);
            }
        });

        nameText.setText("nameText");

        cityText.setText("cityText");

        countryText.setText("countryText");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(cityLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(countryLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameText)
                    .addComponent(cityText)
                    .addComponent(countryText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(backToMenuButton)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameText))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityText))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryLabel)
                    .addComponent(countryText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(backToMenuButton)
                .addContainerGap())
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
                new HubDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMenuButton;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel cityText;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JLabel countryText;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameText;
    // End of variables declaration//GEN-END:variables
}
