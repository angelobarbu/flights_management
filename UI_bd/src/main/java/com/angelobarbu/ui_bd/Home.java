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
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form HomeForm
     */
    public Home() {
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

        menuLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        dispAirplaneButton = new javax.swing.JButton();
        flightNoText = new javax.swing.JTextField();
        dispPassengersButton = new javax.swing.JButton();
        dispFlightsToCityText = new javax.swing.JTextField();
        dispFlightsToCityButton = new javax.swing.JButton();
        home2DisplayButton = new javax.swing.JButton();
        dispFlightCrewButton = new javax.swing.JButton();
        airlineText = new javax.swing.JTextField();
        dispHubButton = new javax.swing.JButton();
        dispEmployeesButton = new javax.swing.JButton();
        flightsDisplayButton = new javax.swing.JButton();
        salaryEmployeesDisplayButton = new javax.swing.JButton();
        capacityAirplanesDisplayButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FLAssistant");

        menuLabel.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        menuLabel.setText("Meniu");

        exitButton.setText("Iesire");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        dispAirplaneButton.setText("Avionul zborului");
        dispAirplaneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispAirplaneButtonActionPerformed(evt);
            }
        });

        flightNoText.setText("Nr Zbor");
        flightNoText.setToolTipText("");
        flightNoText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flightNoTextMouseClicked(evt);
            }
        });
        flightNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightNoTextActionPerformed(evt);
            }
        });
        flightNoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                flightNoTextKeyPressed(evt);
            }
        });

        dispPassengersButton.setText("Pasagerii zborului");
        dispPassengersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispPassengersButtonActionPerformed(evt);
            }
        });

        dispFlightsToCityText.setText("Destinatia");
        dispFlightsToCityText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dispFlightsToCityTextMouseClicked(evt);
            }
        });
        dispFlightsToCityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispFlightsToCityTextActionPerformed(evt);
            }
        });
        dispFlightsToCityText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dispFlightsToCityTextKeyPressed(evt);
            }
        });

        dispFlightsToCityButton.setText("Zborurile catre destinatie");
        dispFlightsToCityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispFlightsToCityButtonActionPerformed(evt);
            }
        });

        home2DisplayButton.setText("Pagina urmatoare >");
        home2DisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home2DisplayButtonActionPerformed(evt);
            }
        });

        dispFlightCrewButton.setText("Echipajul de bord al zborului");
        dispFlightCrewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispFlightCrewButtonActionPerformed(evt);
            }
        });

        airlineText.setText("Companie Aeriana");
        airlineText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                airlineTextMouseClicked(evt);
            }
        });
        airlineText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlineTextActionPerformed(evt);
            }
        });
        airlineText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                airlineTextKeyPressed(evt);
            }
        });

        dispHubButton.setText("Hub");
        dispHubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispHubButtonActionPerformed(evt);
            }
        });

        dispEmployeesButton.setText("Angajati");
        dispEmployeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispEmployeesButtonActionPerformed(evt);
            }
        });

        flightsDisplayButton.setText("Toate zborurile");
        flightsDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightsDisplayButtonActionPerformed(evt);
            }
        });

        salaryEmployeesDisplayButton.setText("Angajatii cu un salariu mai mare");
        salaryEmployeesDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryEmployeesDisplayButtonActionPerformed(evt);
            }
        });

        capacityAirplanesDisplayButton.setText("Avioanele cu o capacitate mai mare");
        capacityAirplanesDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacityAirplanesDisplayButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Pasapoartele ce vor fi verificate de angajati in ziua data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(flightNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dispPassengersButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dispAirplaneButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(exitButton)
                                        .addGap(140, 140, 140))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(dispFlightCrewButton)
                                        .addGap(44, 44, 44))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(airlineText, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salaryEmployeesDisplayButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dispFlightsToCityText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dispFlightsToCityButton)))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(menuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(home2DisplayButton)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(dispHubButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dispEmployeesButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(flightsDisplayButton)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(capacityAirplanesDisplayButton)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(20, 20, 20))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dispPassengersButton)
                            .addComponent(flightNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dispAirplaneButton)))
                    .addComponent(menuLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dispFlightCrewButton)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlineText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaryEmployeesDisplayButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightsDisplayButton)
                    .addComponent(dispHubButton)
                    .addComponent(dispEmployeesButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(capacityAirplanesDisplayButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dispFlightsToCityButton)
                    .addComponent(dispFlightsToCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(home2DisplayButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void dispAirplaneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispAirplaneButtonActionPerformed
        if (flightNoText.getText().equals("")) {
            new FlightNoError().setVisible(true);
        } else {
            new AirplaneDisplay().setVisible(true);
        }
        flightNoText.setText("");
    }//GEN-LAST:event_dispAirplaneButtonActionPerformed

    private void dispPassengersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispPassengersButtonActionPerformed
        if (flightNoText.getText().equals("")) {
            new FlightNoError().setVisible(true);
        } else {
            new PassengersDisplay().setVisible(true);
        }
        flightNoText.setText("");
    }//GEN-LAST:event_dispPassengersButtonActionPerformed

    private void flightNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightNoTextActionPerformed
        //Code
    }//GEN-LAST:event_flightNoTextActionPerformed

    private void dispFlightsToCityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispFlightsToCityButtonActionPerformed
        if (dispFlightsToCityText.getText().equals("")) {
            new CityError().setVisible(true);
        } else {
            new FlightsToCityDisplay().setVisible(true);
        }
        dispFlightsToCityText.setText("");
    }//GEN-LAST:event_dispFlightsToCityButtonActionPerformed

    private void dispFlightsToCityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispFlightsToCityTextActionPerformed
        ///Code
    }//GEN-LAST:event_dispFlightsToCityTextActionPerformed

    private void flightNoTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flightNoTextMouseClicked
        flightNoText.setText("");
    }//GEN-LAST:event_flightNoTextMouseClicked

    private void dispFlightsToCityTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dispFlightsToCityTextMouseClicked
        dispFlightsToCityText.setText("");
    }//GEN-LAST:event_dispFlightsToCityTextMouseClicked

    private void home2DisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home2DisplayButtonActionPerformed
        new Home2().setVisible(true);
        dispose();
    }//GEN-LAST:event_home2DisplayButtonActionPerformed

    private void flightNoTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_flightNoTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dispPassengersButton.requestFocus();
        }
    }//GEN-LAST:event_flightNoTextKeyPressed

    private void dispFlightsToCityTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dispFlightsToCityTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dispFlightsToCityButton.requestFocus();
        }
    }//GEN-LAST:event_dispFlightsToCityTextKeyPressed

    private void airlineTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_airlineTextMouseClicked
        airlineText.setText("");
    }//GEN-LAST:event_airlineTextMouseClicked

    private void airlineTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_airlineTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dispHubButton.requestFocus();
        }
    }//GEN-LAST:event_airlineTextKeyPressed

    private void dispFlightCrewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispFlightCrewButtonActionPerformed
        if (flightNoText.getText().equals("")) {
            new FlightNoError().setVisible(true);
        } else {
            new FlightCrewDisplay().setVisible(true);
        }
        flightNoText.setText("");
    }//GEN-LAST:event_dispFlightCrewButtonActionPerformed

    private void dispEmployeesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispEmployeesButtonActionPerformed
        if (airlineText.getText().equals("")) {
            new AirlineError().setVisible(true);
        } else {
            new EmployeesDisplay().setVisible(true);
        }
        airlineText.setText("");
    }//GEN-LAST:event_dispEmployeesButtonActionPerformed

    private void airlineTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlineTextActionPerformed
        //Code
    }//GEN-LAST:event_airlineTextActionPerformed

    private void dispHubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispHubButtonActionPerformed
        if (airlineText.getText().equals("")) {
            new AirlineError().setVisible(true);
        } else {
            new HubDisplay().setVisible(true);
        }
        airlineText.setText("");
    }//GEN-LAST:event_dispHubButtonActionPerformed

    private void flightsDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightsDisplayButtonActionPerformed
        if (airlineText.getText().equals("")) {
            new AirlineError().setVisible(true);
        } else {
            new FlightsDisplay().setVisible(true);
        }
        airlineText.setText("");
    }//GEN-LAST:event_flightsDisplayButtonActionPerformed

    private void salaryEmployeesDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryEmployeesDisplayButtonActionPerformed
        if (airlineText.getText().equals("")) {
            new AirlineError().setVisible(true);
        } else {
            new SalaryEmployeesDisplay().setVisible(true);
        }
    }//GEN-LAST:event_salaryEmployeesDisplayButtonActionPerformed

    private void capacityAirplanesDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacityAirplanesDisplayButtonActionPerformed
        if (airlineText.getText().equals("")) {
            new AirlineError().setVisible(true);
        } else {
            new AirplanesCapacityDisplay().setVisible(true);
        }
    }//GEN-LAST:event_capacityAirplanesDisplayButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (airlineText.getText().equals("")) {
            new AirlineError().setVisible(true);
        } else {
            new PassportsDisplay().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField airlineText;
    private javax.swing.JButton capacityAirplanesDisplayButton;
    private javax.swing.JButton dispAirplaneButton;
    private javax.swing.JButton dispEmployeesButton;
    private javax.swing.JButton dispFlightCrewButton;
    private javax.swing.JButton dispFlightsToCityButton;
    public static javax.swing.JTextField dispFlightsToCityText;
    private javax.swing.JButton dispHubButton;
    private javax.swing.JButton dispPassengersButton;
    private javax.swing.JButton exitButton;
    public static javax.swing.JTextField flightNoText;
    private javax.swing.JButton flightsDisplayButton;
    private javax.swing.JButton home2DisplayButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JButton salaryEmployeesDisplayButton;
    // End of variables declaration//GEN-END:variables
}
