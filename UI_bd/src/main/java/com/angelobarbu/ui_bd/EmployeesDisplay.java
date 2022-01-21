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
public class EmployeesDisplay extends javax.swing.JFrame {

    /**
     * Creates new form EmployeesDisplay
     */
    public EmployeesDisplay() {
        initComponents();
        showEmployees();
    }
    
    /*
    functie ce creeaza lista de angajati prin conectarea bazei de date,
    trimiterea interogarii la baza de date si introducerea a fiecarei
    valori returnate de baza de date in lista de angajati
    */
    
    public ArrayList<Employees> getEmployeesList() {
        
        ArrayList<Employees> employeesList = new ArrayList<>();
        
        try {
            String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=zboruri_aeroport;";
            String username = "sa";
            String password = "herooftheworld";
            Connection con = DriverManager.getConnection(connectionUrl, username, password);
            String airline = Home.airlineText.getText();
            String selectQuery = "SELECT A.AngajatID, A.CompanieID, A.Nume, A.Prenume, A.CNP, A.Adresa, A.Oras, A.Tara, A.DataNasterii, A.Pozitie, A.Salariu FROM Angajati AS A " +
                                 "INNER JOIN CompaniiAeriene AS CA ON A.CompanieID = CA.CompanieID " +
                                 "WHERE CA.Nume = '" + airline + "'; ";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectQuery);
            while (rs.next()) {
                Employees employee = new Employees(rs.getInt("AngajatID"), rs.getInt("CompanieID"), rs.getString("Nume"), rs.getString("Prenume"), rs.getString("CNP"), 
                        rs.getString("Adresa"), rs.getString("Oras"), rs.getString("Tara"), rs.getDate("DataNasterii"), rs.getString("Pozitie"), rs.getInt("Salariu"));
                employeesList.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return employeesList;
        
    }
    
    //functie pt afisarea angajatilor
    public void showEmployees() {
        
        ArrayList<Employees> employeesList = getEmployeesList();
        DefaultTableModel model = (DefaultTableModel) displayEmployees.getModel();
        Object[] row = new Object[9];
        for (int i = 0; i < employeesList.size(); i++) {
            row[0] = employeesList.get(i).getLastName();
            row[1] = employeesList.get(i).getFirstName();
            row[2] = employeesList.get(i).getNationalID();
            row[3] = employeesList.get(i).getAddress();
            row[4] = employeesList.get(i).getCity();
            row[5] = employeesList.get(i).getCountry();
            row[6] = employeesList.get(i).getDateOfBirth();
            row[7] = employeesList.get(i).getPosition();
            row[8] = employeesList.get(i).getSalary();
            model.addRow(row);
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        displayEmployees = new javax.swing.JTable();
        backToMenuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FLAssistant");

        displayEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nume", "Prenume", "CNP", "Adresa", "Oras", "Tara", "Data Nasterii", "Pozitie", "Salariu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(displayEmployees);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backToMenuButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backToMenuButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                new EmployeesDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMenuButton;
    private javax.swing.JTable displayEmployees;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
