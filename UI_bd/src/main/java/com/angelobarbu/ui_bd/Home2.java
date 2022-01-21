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
public class Home2 extends javax.swing.JFrame {

    /**
     * Creates new form Home2
     */
    public Home2() {
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

        homeDisplayButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        passengersInsertButton = new javax.swing.JButton();
        airportsInsertButton = new javax.swing.JButton();
        passengersDeleteButton = new javax.swing.JButton();
        menuLabel = new javax.swing.JLabel();
        employeesDeleteButton = new javax.swing.JButton();
        employeesModifyButton = new javax.swing.JButton();
        airplanesModifyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FLAssistant");
        setResizable(false);

        homeDisplayButton.setText("< Pagina anterioara");
        homeDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeDisplayButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Iesire");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        passengersInsertButton.setText("Adauga un pasager");
        passengersInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengersInsertButtonActionPerformed(evt);
            }
        });

        airportsInsertButton.setText("Adauga un aeroport");
        airportsInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airportsInsertButtonActionPerformed(evt);
            }
        });

        passengersDeleteButton.setText("Sterge un pasager");
        passengersDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengersDeleteButtonActionPerformed(evt);
            }
        });

        menuLabel.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        menuLabel.setText("Meniu");

        employeesDeleteButton.setText("Sterge un angajat");
        employeesDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesDeleteButtonActionPerformed(evt);
            }
        });

        employeesModifyButton.setText("Modifica datele unui angajat");
        employeesModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesModifyButtonActionPerformed(evt);
            }
        });

        airplanesModifyButton.setText("Modifica datele unui pasager");
        airplanesModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airplanesModifyButtonActionPerformed(evt);
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
                        .addComponent(homeDisplayButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(airportsInsertButton)
                            .addComponent(passengersInsertButton)
                            .addComponent(passengersDeleteButton)
                            .addComponent(employeesDeleteButton)
                            .addComponent(employeesModifyButton)
                            .addComponent(airplanesModifyButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exitButton)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(menuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuLabel)
                .addGap(43, 43, 43)
                .addComponent(passengersInsertButton)
                .addGap(18, 18, 18)
                .addComponent(airportsInsertButton)
                .addGap(18, 18, 18)
                .addComponent(passengersDeleteButton)
                .addGap(18, 18, 18)
                .addComponent(employeesDeleteButton)
                .addGap(18, 18, 18)
                .addComponent(employeesModifyButton)
                .addGap(18, 18, 18)
                .addComponent(airplanesModifyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(homeDisplayButton)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /*
    linii de cod ce configureaza actiunea apasarii fiecarui buton, dar, in functie de caz
    si actiunea apasarii unei taste sau a mouse-ului
    */
    private void homeDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeDisplayButtonActionPerformed
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_homeDisplayButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void passengersInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengersInsertButtonActionPerformed
        new PassengersInsert().setVisible(true);
    }//GEN-LAST:event_passengersInsertButtonActionPerformed

    private void airportsInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airportsInsertButtonActionPerformed
        new AirportsInsert().setVisible(true);
    }//GEN-LAST:event_airportsInsertButtonActionPerformed

    private void passengersDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengersDeleteButtonActionPerformed
        new PassengersDelete().setVisible(true);
    }//GEN-LAST:event_passengersDeleteButtonActionPerformed

    private void employeesDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesDeleteButtonActionPerformed
        new EmployeesDelete().setVisible(true);
    }//GEN-LAST:event_employeesDeleteButtonActionPerformed

    private void employeesModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesModifyButtonActionPerformed
        new EmployeesModify().setVisible(true);
    }//GEN-LAST:event_employeesModifyButtonActionPerformed

    private void airplanesModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airplanesModifyButtonActionPerformed
        new PassengersModify().setVisible(true);
    }//GEN-LAST:event_airplanesModifyButtonActionPerformed

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
                new Home2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton airplanesModifyButton;
    private javax.swing.JButton airportsInsertButton;
    private javax.swing.JButton employeesDeleteButton;
    private javax.swing.JButton employeesModifyButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton homeDisplayButton;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JButton passengersDeleteButton;
    private javax.swing.JButton passengersInsertButton;
    // End of variables declaration//GEN-END:variables
}