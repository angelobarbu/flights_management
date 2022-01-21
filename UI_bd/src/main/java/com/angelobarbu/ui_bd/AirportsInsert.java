/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.angelobarbu.ui_bd;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.UIManager;

/**
 *
 * @author Angelo
 */
public class AirportsInsert extends javax.swing.JFrame {

    /**
     * Creates new form AirportsInsert
     */
    public AirportsInsert() {
        initComponents();
    }

    public boolean insertAirport() {
        
        String name = airportsNameText.getText();
        String city = airportsCityText.getText();
        String country = airportsCountryText.getText();
        
        if (name.equals("") || city.equals("") || country.equals("")) {
            return false;
        }
        
        try {
            
            String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
            String username = "sa";
            String password = "herooftheworld";

            Connection con = DriverManager.getConnection(connectionUrl, username, password);

            String insertQuery = "INSERT INTO Aeroporturi VALUES ('" + name + "', '" + city + "', '" + country + "')";
            Statement insertSt = con.createStatement();
            ResultSet rs = insertSt.executeQuery(insertQuery);
            
            /* String getFlightIDQuery = "Select ZborID FROM Zboruri WHERE NrZbor = '" + flightNo + "'";
            String getPassengerIDQuery = "Select PasagerID FROM Pasageri WHERE NrPasaport = '" + passportNo + "'";
            
            Statement selectSt1 = con.createStatement();
            ResultSet rs1 = selectSt1.executeQuery(getFlightIDQuery);
            
            Statement selectSt2 = con.createStatement();
            ResultSet rs2 = selectSt2.executeQuery(getPassengerIDQuery);
            
            rs1.next();
            int flightID = rs1.getInt("ZborID");
            rs2.next();
            int passengerID = rs2.getInt("PasagerID");
            
            String addToFlightQuery = "INSERT INTO PasageriZboruri(PasagerID, ZborID) VALUES ((Select PasagerID FROM Pasageri WHERE NrPasaport = '" + passportNo + "'), (Select ZborID FROM Zboruri WHERE NrZbor = '" + flightNo + "'))";
            Statement addToFlightSt = con.createStatement();
            addToFlightSt.executeQuery(addToFlightQuery); */
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        return true;
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        airportsCountryText = new javax.swing.JTextField();
        airportsCityText = new javax.swing.JTextField();
        airportsNameText = new javax.swing.JTextField();
        airportsNameLabel = new javax.swing.JLabel();
        headerLabel = new javax.swing.JLabel();
        airportsInsertButton = new javax.swing.JButton();
        airportsCityLabel = new javax.swing.JLabel();
        airportsResetButton = new javax.swing.JButton();
        airportsCountryLabel = new javax.swing.JLabel();
        backToMenuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FLAssistant");

        airportsCountryText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                airportsCountryTextKeyPressed(evt);
            }
        });

        airportsCityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airportsCityTextActionPerformed(evt);
            }
        });
        airportsCityText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                airportsCityTextKeyPressed(evt);
            }
        });

        airportsNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                airportsNameTextKeyPressed(evt);
            }
        });

        airportsNameLabel.setText("Nume");

        headerLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        headerLabel.setText("Completeaza datele aeroportului");

        airportsInsertButton.setText("Adauga");
        airportsInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airportsInsertButtonActionPerformed(evt);
            }
        });

        airportsCityLabel.setText("Oras");

        airportsResetButton.setText("Reseteaza");
        airportsResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airportsResetButtonActionPerformed(evt);
            }
        });

        airportsCountryLabel.setText("Tara");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(airportsInsertButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(airportsResetButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addComponent(headerLabel)))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backToMenuButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(airportsCountryLabel)
                        .addComponent(airportsCityLabel)
                        .addComponent(airportsNameLabel))
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(airportsCountryText)
                        .addComponent(airportsCityText)
                        .addComponent(airportsNameText))
                    .addGap(34, 34, 34)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel)
                .addGap(174, 174, 174)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airportsInsertButton)
                    .addComponent(airportsResetButton))
                .addGap(33, 33, 33)
                .addComponent(backToMenuButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(airportsNameLabel)
                        .addComponent(airportsNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(airportsCityLabel)
                        .addComponent(airportsCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(airportsCountryLabel)
                        .addComponent(airportsCountryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(117, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void airportsCountryTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_airportsCountryTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            airportsInsertButton.requestFocus();
        }
    }//GEN-LAST:event_airportsCountryTextKeyPressed

    private void airportsCityTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_airportsCityTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            airportsCountryText.requestFocus();
        }
    }//GEN-LAST:event_airportsCityTextKeyPressed

    private void airportsNameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_airportsNameTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            airportsCityText.requestFocus();
        }
    }//GEN-LAST:event_airportsNameTextKeyPressed

    private void airportsInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airportsInsertButtonActionPerformed
        if (insertAirport()) {
            new AirportsInsertSuccess().setVisible(true);
            airportsNameText.setText("");
            airportsCityText.setText("");
            airportsCountryText.setText("");
            
        } else {
            new AirportsInsertFail().setVisible(true);
        }
    }//GEN-LAST:event_airportsInsertButtonActionPerformed

    private void airportsResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airportsResetButtonActionPerformed
        airportsNameText.setText("");
        airportsCityText.setText("");
        airportsCountryText.setText("");
    }//GEN-LAST:event_airportsResetButtonActionPerformed

    private void backToMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuButtonActionPerformed
        dispose();
    }//GEN-LAST:event_backToMenuButtonActionPerformed

    private void airportsCityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airportsCityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airportsCityTextActionPerformed

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
                new AirportsInsert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airportsCityLabel;
    private javax.swing.JTextField airportsCityText;
    private javax.swing.JLabel airportsCountryLabel;
    private javax.swing.JTextField airportsCountryText;
    private javax.swing.JButton airportsInsertButton;
    private javax.swing.JLabel airportsNameLabel;
    private javax.swing.JTextField airportsNameText;
    private javax.swing.JButton airportsResetButton;
    private javax.swing.JButton backToMenuButton;
    private javax.swing.JLabel headerLabel;
    // End of variables declaration//GEN-END:variables
}