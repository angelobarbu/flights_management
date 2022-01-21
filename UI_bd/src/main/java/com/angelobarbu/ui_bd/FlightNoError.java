/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.angelobarbu.ui_bd;

import javax.swing.UIManager;

/**
 *
 * @author Angelo
 */
public class FlightNoError extends javax.swing.JFrame {

    /**
     * Creates new form PassengersDisplayFailed
     */
    public FlightNoError() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passengersDisplayFailedLabel = new javax.swing.JLabel();
        passengersDisplayFailedButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Error");

        passengersDisplayFailedLabel.setText("Introduceti un numar de zbor valid!");

        passengersDisplayFailedButton.setText("OK");
        passengersDisplayFailedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengersDisplayFailedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(passengersDisplayFailedLabel)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(passengersDisplayFailedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passengersDisplayFailedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passengersDisplayFailedButton)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passengersDisplayFailedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengersDisplayFailedButtonActionPerformed
        dispose();
    }//GEN-LAST:event_passengersDisplayFailedButtonActionPerformed

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
                new FlightNoError().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton passengersDisplayFailedButton;
    private javax.swing.JLabel passengersDisplayFailedLabel;
    // End of variables declaration//GEN-END:variables
}
