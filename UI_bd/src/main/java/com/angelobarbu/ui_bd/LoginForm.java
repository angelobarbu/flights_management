/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.angelobarbu.ui_bd;

import java.awt.event.KeyEvent;
import javax.swing.UIManager;

/**
 *
 * @author Angelo
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form Test_InterfaceForm
     */
    public LoginForm() {
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

        loginPanel = new javax.swing.JPanel();
        userLabel = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        passText = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FLAssistant Login");

        userLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userLabel.setText("Utilizator");

        userText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userTextKeyPressed(evt);
            }
        });

        passLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passLabel.setText("Parola");

        passText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passTextKeyPressed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userLabel)
                    .addComponent(passLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(userText, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addComponent(passText))
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(loginButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //se verifica utilizatorul si parola in urma apasarii butonului
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        String user = userText.getText();
        String pass = passText.getText();

        if (user.equals("sa") && pass.equals("serveradmin")) {

            dispose();
            new Home().setVisible(true);
            //daca sunt corecte, se deschide meniul

        } else {

            new LoginFailed().setVisible(true);
            //altfel, apare JFrame-ul pentru eroare de login
            userText.setText("");
            passText.setText("");
            
        }

    }//GEN-LAST:event_loginButtonActionPerformed

    /* 
    actiune pentru JTextField-ul de la utilizator pentru trecerea focusului la JTextField-ul de la parola
    la JTextField-ul de la parola in urma apasarii enter
    */
    private void userTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            passText.requestFocus();
        }
    }//GEN-LAST:event_userTextKeyPressed
    
    /* 
    actiune pentru JTextField-ul de la parola pentru trecerea focusului la butonul de login
    in urma apasarii enter
    */
    private void passTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loginButton.requestFocus();
        }
    }//GEN-LAST:event_passTextKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //modificare Look And Feel la fereastra tip Windows 10
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch(Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passText;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
