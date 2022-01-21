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
public class PassengersInsert extends javax.swing.JFrame {

    /**
     * Creates new form PassengersInsert
     */
    public PassengersInsert() {
        initComponents();
    }
    
    public boolean insertPassenger() {
        String lastName = passengerLastNameText.getText();
        String firstName = passengerFirstNameText.getText();
        String passportNo = passengerPassportNoText.getText();
        String address = passengerAddressText.getText();
        String city = passengerCityText.getText();
        String country = passengerCountryText.getText();
        String dateOfBirth = passengerDateOfBirthText.getText();       
        String flightNo = passengerFlightNoText.getText();
        
        if (lastName.equals("") || firstName.equals("") || passportNo.equals("") || address.equals("") ||
            city.equals("") || country.equals("") || dateOfBirth.equals("") || flightNo.equals("")) {
            return false;
        }
        
        try {
            
            String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
            String username = "sa";
            String password = "herooftheworld";

            Connection con = DriverManager.getConnection(connectionUrl, username, password);

            String insertQuery = "INSERT INTO Pasageri VALUES ('" + lastName + "', '" + firstName + "', '" + passportNo + "', '" + address + "', '" 
                                                                           + city + "', '" + country + "', '" + dateOfBirth + "')";
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
    
    public void insertIntoFlight() {
        try {
            
            String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
            String username = "sa";
            String password = "herooftheworld";

            Connection con = DriverManager.getConnection(connectionUrl, username, password);
            Statement st = con.createStatement();
            String query = "INSERT INTO PasageriZboruri(PasagerID, ZborID) VALUES ((SELECT PasagerID FROM Pasageri WHERE NrPasaport = '" + passengerPassportNoText.getText() + "'), (Select ZborID FROM Zboruri WHERE NrZbor = '" + passengerFlightNoText.getText() + "'))";
            
            ResultSet rs = st.executeQuery(query);
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passengerLastNameLabel = new javax.swing.JLabel();
        headerLabel = new javax.swing.JLabel();
        passengerFirstNameLabel = new javax.swing.JLabel();
        passengerPassportNoLabel = new javax.swing.JLabel();
        passengerAddressLabel = new javax.swing.JLabel();
        passengerCityLabel = new javax.swing.JLabel();
        passengerCountryLabel = new javax.swing.JLabel();
        passengerDateOfBirthLabel = new javax.swing.JLabel();
        passengerDateOfBirthFormatLabel = new javax.swing.JLabel();
        passengerDateOfBirthText = new javax.swing.JTextField();
        passengerCountryText = new javax.swing.JTextField();
        passengerCityText = new javax.swing.JTextField();
        passengerAddressText = new javax.swing.JTextField();
        passengerPassportNoText = new javax.swing.JTextField();
        passengerFirstNameText = new javax.swing.JTextField();
        passengerLastNameText = new javax.swing.JTextField();
        backToMenuButton = new javax.swing.JButton();
        passengersInsertButton = new javax.swing.JButton();
        passengersResetButton = new javax.swing.JButton();
        passengersFlightNoLabel = new javax.swing.JLabel();
        passengerFlightNoText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FLAssistant");

        passengerLastNameLabel.setText("Nume");

        headerLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        headerLabel.setText("Completeaza datele pasagerului");

        passengerFirstNameLabel.setText("Prenume");

        passengerPassportNoLabel.setText("Nr Pasaport");

        passengerAddressLabel.setText("Adresa");

        passengerCityLabel.setText("Oras");

        passengerCountryLabel.setText("Tara");

        passengerDateOfBirthLabel.setText("Data nasterii");

        passengerDateOfBirthFormatLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        passengerDateOfBirthFormatLabel.setText("(YYYY-MM-DD)");

        passengerDateOfBirthText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passengerDateOfBirthTextKeyPressed(evt);
            }
        });

        passengerCountryText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passengerCountryTextKeyPressed(evt);
            }
        });

        passengerCityText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passengerCityTextKeyPressed(evt);
            }
        });

        passengerAddressText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passengerAddressTextKeyPressed(evt);
            }
        });

        passengerPassportNoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passengerPassportNoTextKeyPressed(evt);
            }
        });

        passengerFirstNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passengerFirstNameTextKeyPressed(evt);
            }
        });

        passengerLastNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passengerLastNameTextKeyPressed(evt);
            }
        });

        backToMenuButton.setText("< Inapoi la meniu");
        backToMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuButtonActionPerformed(evt);
            }
        });

        passengersInsertButton.setText("Adauga");
        passengersInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengersInsertButtonActionPerformed(evt);
            }
        });

        passengersResetButton.setText("Reseteaza");
        passengersResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengersResetButtonActionPerformed(evt);
            }
        });

        passengersFlightNoLabel.setText("Nr Zbor");

        passengerFlightNoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passengerFlightNoTextKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(headerLabel))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(passengerDateOfBirthFormatLabel)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(passengersInsertButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passengersResetButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passengerAddressLabel)
                                        .addComponent(passengerPassportNoLabel)
                                        .addComponent(passengerFirstNameLabel)
                                        .addComponent(passengerLastNameLabel))
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passengerAddressText)
                                        .addComponent(passengerPassportNoText)
                                        .addComponent(passengerFirstNameText)
                                        .addComponent(passengerLastNameText)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passengerDateOfBirthLabel)
                                        .addComponent(passengerCountryLabel)
                                        .addComponent(passengerCityLabel)
                                        .addComponent(passengersFlightNoLabel))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passengerDateOfBirthText)
                                        .addComponent(passengerCountryText)
                                        .addComponent(passengerCityText)
                                        .addComponent(passengerFlightNoText))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backToMenuButton)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passengerLastNameLabel)
                    .addComponent(passengerLastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passengerFirstNameLabel)
                    .addComponent(passengerFirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passengerPassportNoLabel)
                    .addComponent(passengerPassportNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passengerAddressLabel)
                    .addComponent(passengerAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passengerCityLabel)
                    .addComponent(passengerCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passengerCountryLabel)
                    .addComponent(passengerCountryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passengerDateOfBirthLabel)
                    .addComponent(passengerDateOfBirthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passengerDateOfBirthFormatLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passengersFlightNoLabel)
                    .addComponent(passengerFlightNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passengersInsertButton)
                    .addComponent(passengersResetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(backToMenuButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backToMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuButtonActionPerformed
        dispose();
    }//GEN-LAST:event_backToMenuButtonActionPerformed

    private void passengersInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengersInsertButtonActionPerformed
        if (insertPassenger()) {
            insertIntoFlight();
            new PassengersInsertSuccess().setVisible(true);
            passengerLastNameText.setText("");
            passengerFirstNameText.setText("");
            passengerPassportNoText.setText("");
            passengerAddressText.setText("");
            passengerCityText.setText("");
            passengerCountryText.setText("");
            passengerDateOfBirthText.setText("");
            passengerFlightNoText.setText("");
        } else {
            new PassengersInsertFail().setVisible(true);
        }
    }//GEN-LAST:event_passengersInsertButtonActionPerformed

    private void passengersResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengersResetButtonActionPerformed
        passengerLastNameText.setText("");
        passengerFirstNameText.setText("");
        passengerPassportNoText.setText("");
        passengerAddressText.setText("");
        passengerCityText.setText("");
        passengerCountryText.setText("");
        passengerDateOfBirthText.setText("");
        passengerFlightNoText.setText("");
    }//GEN-LAST:event_passengersResetButtonActionPerformed

    private void passengerLastNameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passengerLastNameTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            passengerFirstNameText.requestFocus();
        }
    }//GEN-LAST:event_passengerLastNameTextKeyPressed

    private void passengerFirstNameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passengerFirstNameTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            passengerPassportNoText.requestFocus();
        }
    }//GEN-LAST:event_passengerFirstNameTextKeyPressed

    private void passengerPassportNoTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passengerPassportNoTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            passengerAddressText.requestFocus();
        }
    }//GEN-LAST:event_passengerPassportNoTextKeyPressed

    private void passengerAddressTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passengerAddressTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            passengerCityText.requestFocus();
        }
    }//GEN-LAST:event_passengerAddressTextKeyPressed

    private void passengerCityTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passengerCityTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            passengerCountryText.requestFocus();
        }
    }//GEN-LAST:event_passengerCityTextKeyPressed

    private void passengerCountryTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passengerCountryTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            passengerDateOfBirthText.requestFocus();
        }
    }//GEN-LAST:event_passengerCountryTextKeyPressed

    private void passengerDateOfBirthTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passengerDateOfBirthTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            passengerFlightNoText.requestFocus();
        }
    }//GEN-LAST:event_passengerDateOfBirthTextKeyPressed

    private void passengerFlightNoTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passengerFlightNoTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            passengersInsertButton.requestFocus();
        }
    }//GEN-LAST:event_passengerFlightNoTextKeyPressed

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
                new PassengersInsert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMenuButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel passengerAddressLabel;
    private javax.swing.JTextField passengerAddressText;
    private javax.swing.JLabel passengerCityLabel;
    private javax.swing.JTextField passengerCityText;
    private javax.swing.JLabel passengerCountryLabel;
    private javax.swing.JTextField passengerCountryText;
    private javax.swing.JLabel passengerDateOfBirthFormatLabel;
    private javax.swing.JLabel passengerDateOfBirthLabel;
    private javax.swing.JTextField passengerDateOfBirthText;
    private javax.swing.JLabel passengerFirstNameLabel;
    private javax.swing.JTextField passengerFirstNameText;
    private javax.swing.JTextField passengerFlightNoText;
    private javax.swing.JLabel passengerLastNameLabel;
    private javax.swing.JTextField passengerLastNameText;
    private javax.swing.JLabel passengerPassportNoLabel;
    private javax.swing.JTextField passengerPassportNoText;
    private javax.swing.JLabel passengersFlightNoLabel;
    private javax.swing.JButton passengersInsertButton;
    private javax.swing.JButton passengersResetButton;
    // End of variables declaration//GEN-END:variables
}