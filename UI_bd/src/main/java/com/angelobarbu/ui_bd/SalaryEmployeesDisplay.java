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
public class SalaryEmployeesDisplay extends javax.swing.JFrame {

    /**
     * Creates new form SalaryEmployeesDisplay
     */
    public SalaryEmployeesDisplay() {
        initComponents();
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
            String salary = salaryTextField.getText();
            String airline = Home.airlineText.getText();
            String selectQuery = "SELECT A.Nume, A.Prenume, A.Pozitie, A.Salariu FROM Angajati AS A " +
                                 "WHERE A.Salariu >= " + salary + " AND A.CompanieID IN " +
                                    "(SELECT A.CompanieID FROM Angajati AS A INNER JOIN CompaniiAeriene as CA ON A.CompanieID = CA.CompanieID " +
                                        "WHERE CA.Nume = '" + airline + "');";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectQuery);
            while (rs.next()) {
                Employees employee = new Employees(rs.getString("Nume"), rs.getString("Prenume"), rs.getString("Pozitie"), rs.getInt("Salariu"));
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
        Object[] row = new Object[4];
        for (int i = 0; i < employeesList.size(); i++) {
            row[0] = employeesList.get(i).getLastName();
            row[1] = employeesList.get(i).getFirstName();
            row[2] = employeesList.get(i).getPosition();
            row[3] = employeesList.get(i).getSalary();
            
            model.addRow(row);
        }
        
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        displayEmployees = new javax.swing.JTable();
        backToMenuButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        salaryTextField = new javax.swing.JTextField();
        displayEmployeesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FLAssistant");

        displayEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nume", "Prenume", "Pozitie", "Salariu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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

        jLabel1.setText("Angajatii cu salariul mai mare decat (introduceti valoarea)");

        displayEmployeesButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        displayEmployeesButton.setText("Afiseaza");
        displayEmployeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayEmployeesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backToMenuButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(displayEmployeesButton)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayEmployeesButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(backToMenuButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backToMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuButtonActionPerformed
        dispose();
    }//GEN-LAST:event_backToMenuButtonActionPerformed

    //actiune a butonului Afiseaza
    private void displayEmployeesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayEmployeesButtonActionPerformed
        if (salaryTextField.getText().equals("")) { //daca NU s-a introdus o valoare in campul salariu
            new PassengersInsertFail().setVisible(true); //afiseaza eroarea
        } else {
            //altfel, goleste JTable-ul in cazul in care a mai fost folosit
            DefaultTableModel model = (DefaultTableModel) displayEmployees.getModel();
            model.setRowCount(0);
            showEmployees(); //afiseaza angajatii
        }
        salaryTextField.setText("");
    }//GEN-LAST:event_displayEmployeesButtonActionPerformed

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
                new SalaryEmployeesDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMenuButton;
    private javax.swing.JTable displayEmployees;
    private javax.swing.JButton displayEmployeesButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField salaryTextField;
    // End of variables declaration//GEN-END:variables
}
