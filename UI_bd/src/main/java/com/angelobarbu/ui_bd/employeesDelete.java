/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.angelobarbu.ui_bd;

import java.awt.event.KeyEvent;
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
public class EmployeesDelete extends javax.swing.JFrame {

    /**
     * Creates new form employeesDelete
     */
    public EmployeesDelete() {
        initComponents();
    }

    public boolean deleteEmployeeFlights() {
        
        String nationalID = employeesDeleteText.getText();
        
        if (nationalID.equals(""))
            return false;
        
        try {
            
            String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
            String username = "sa";
            String password = "herooftheworld";

            Connection con = DriverManager.getConnection(connectionUrl, username, password);

            String query = "DELETE AZ FROM AngajatiZboruri AZ INNER JOIN Angajati A ON A.AngajatID = AZ.AngajatID WHERE A.CNP = '" + nationalID + "'";
            PreparedStatement pSt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = pSt.executeQuery();
          
            
            
        } catch(SQLException e) {
            e.printStackTrace();
            return false;
        }
        
        return true;
        
    }
    
    public boolean deleteEmployee() {
        
        String nationalID = employeesDeleteText.getText();
        
        if (nationalID.equals(""))
            return false;
        
        try {
            
            String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
            String username = "sa";
            String password = "herooftheworld";

            Connection con = DriverManager.getConnection(connectionUrl, username, password);

            String query = "DELETE FROM Angajati WHERE CNP = '" + nationalID + "'";
            PreparedStatement pSt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = pSt.executeQuery();
            
            
            
        } catch(SQLException e) {
            e.printStackTrace();
            return false;
            
        }
        
       return true;
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        employeesDeleteLabel = new javax.swing.JLabel();
        employeesDeleteText = new javax.swing.JTextField();
        employeesDeleteButton = new javax.swing.JButton();
        backToMenuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FLAssistant");

        employeesDeleteLabel.setText("Codul Numeric Personal(CNP) sau numarul de identificare al angajatului");

        employeesDeleteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                employeesDeleteTextKeyPressed(evt);
            }
        });

        employeesDeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        employeesDeleteButton.setText("Sterge");
        employeesDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesDeleteButtonActionPerformed(evt);
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backToMenuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(employeesDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(employeesDeleteText, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(employeesDeleteLabel)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(employeesDeleteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(employeesDeleteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeesDeleteButton)
                    .addComponent(backToMenuButton))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void employeesDeleteTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeesDeleteTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            employeesDeleteButton.requestFocus();
        }
    }//GEN-LAST:event_employeesDeleteTextKeyPressed

    private void employeesDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesDeleteButtonActionPerformed
        if (deleteEmployeeFlights()) {
            if (deleteEmployee()) {
                new DeleteSuccess().setVisible(true);
                employeesDeleteText.setText("");
            } else {
                new DeleteError().setVisible(true);
            }
        } else {
            new DeleteError().setVisible(true);
        }
    }//GEN-LAST:event_employeesDeleteButtonActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeesDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMenuButton;
    private javax.swing.JButton employeesDeleteButton;
    private javax.swing.JLabel employeesDeleteLabel;
    private javax.swing.JTextField employeesDeleteText;
    // End of variables declaration//GEN-END:variables
}
