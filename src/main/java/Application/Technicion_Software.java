/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Application;

import java.io.BufferedReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author user
 */
public class Technicion_Software extends javax.swing.JFrame{

    public Technicion_Software() {
        initComponents();
    }
    JFrame jf = new JFrame();
    technision_User tt = new technision_User();
    Payments p = new Payments();
    Feedbacks f = new Feedbacks();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pages_Panel = new javax.swing.JTabbedPane();
        P_home = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        T_appointments = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        total_App = new javax.swing.JLabel();
        T_payments = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        total_payments = new javax.swing.JLabel();
        appointments = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointments_Added = new javax.swing.JTable();
        fees = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fees_Summary = new javax.swing.JTable();
        Logout = new javax.swing.JButton();
        P_Appointments = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        appointment_Field = new javax.swing.JTextField();
        appointment_Search = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        User_Room = new javax.swing.JLabel();
        User_ID = new javax.swing.JLabel();
        User_Time = new javax.swing.JLabel();
        User_Date = new javax.swing.JLabel();
        User_Fees = new javax.swing.JLabel();
        B_appointment = new javax.swing.JButton();
        User_note = new javax.swing.JLabel();
        appointments1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        appointments_Added1 = new javax.swing.JTable();
        P_Payments = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        payments_Field = new javax.swing.JTextField();
        payments_search = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        User_Room1 = new javax.swing.JLabel();
        User_ID1 = new javax.swing.JLabel();
        User_Time1 = new javax.swing.JLabel();
        User_Date1 = new javax.swing.JLabel();
        User_Fees1 = new javax.swing.JLabel();
        B_payment = new javax.swing.JButton();
        User_Time2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        feedback = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        Payments = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        payments_Added = new javax.swing.JTable();
        P_feedbacks = new javax.swing.JPanel();
        Feedbaks = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Feedback_data = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        feedback_field = new javax.swing.JTextField();
        filter_Feedbacks = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DachBoard");
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Dashboard"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(60, 194, 198));

        pages_Panel.setForeground(new java.awt.Color(255, 255, 255));
        pages_Panel.setName("Home"); // NOI18N

        P_home.setBackground(new java.awt.Color(153, 153, 153));
        P_home.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome Back");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Total appointments");

        total_App.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        total_App.setForeground(new java.awt.Color(102, 102, 102));
        total_App.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_App.setText("0");

        javax.swing.GroupLayout T_appointmentsLayout = new javax.swing.GroupLayout(T_appointments);
        T_appointments.setLayout(T_appointmentsLayout);
        T_appointmentsLayout.setHorizontalGroup(
            T_appointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(T_appointmentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(T_appointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(T_appointmentsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(total_App, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        T_appointmentsLayout.setVerticalGroup(
            T_appointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(T_appointmentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(total_App, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Total Outstanding Payments");

        total_payments.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        total_payments.setForeground(new java.awt.Color(102, 102, 102));
        total_payments.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_payments.setText("0");

        javax.swing.GroupLayout T_paymentsLayout = new javax.swing.GroupLayout(T_payments);
        T_payments.setLayout(T_paymentsLayout);
        T_paymentsLayout.setHorizontalGroup(
            T_paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(T_paymentsLayout.createSequentialGroup()
                .addGroup(T_paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(T_paymentsLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(total_payments, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(T_paymentsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        T_paymentsLayout.setVerticalGroup(
            T_paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(T_paymentsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total_payments, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Recent Appointments Added");

        appointments_Added.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        appointments_Added.setEditingColumn(0);
        appointments_Added.setEditingRow(0);
        appointments_Added.setEnabled(false);
        appointments_Added.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(appointments_Added);

        javax.swing.GroupLayout appointmentsLayout = new javax.swing.GroupLayout(appointments);
        appointments.setLayout(appointmentsLayout);
        appointmentsLayout.setHorizontalGroup(
            appointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(appointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                    .addGroup(appointmentsLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        appointmentsLayout.setVerticalGroup(
            appointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fees Summary");

        fees_Summary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        fees_Summary.setEditingColumn(0);
        fees_Summary.setEditingRow(0);
        fees_Summary.setEnabled(false);
        fees_Summary.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane2.setViewportView(fees_Summary);

        javax.swing.GroupLayout feesLayout = new javax.swing.GroupLayout(fees);
        fees.setLayout(feesLayout);
        feesLayout.setHorizontalGroup(
            feesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(feesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(feesLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE))
                .addContainerGap())
        );
        feesLayout.setVerticalGroup(
            feesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        Logout.setBackground(new java.awt.Color(60, 194, 198));
        Logout.setForeground(new java.awt.Color(51, 51, 51));
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_homeLayout = new javax.swing.GroupLayout(P_home);
        P_home.setLayout(P_homeLayout);
        P_homeLayout.setHorizontalGroup(
            P_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_homeLayout.createSequentialGroup()
                .addGroup(P_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_homeLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_homeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(P_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appointments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T_appointments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(P_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(P_homeLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(T_payments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        P_homeLayout.setVerticalGroup(
            P_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_homeLayout.createSequentialGroup()
                .addGroup(P_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(P_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(T_appointments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_payments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(appointments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pages_Panel.addTab("Home", null, P_home, "");

        P_Appointments.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Appointments");

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Enter the Student ID to view the appointment");

        appointment_Field.setBackground(new java.awt.Color(102, 102, 102));
        appointment_Field.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        appointment_Field.setForeground(new java.awt.Color(204, 204, 204));

        appointment_Search.setBackground(new java.awt.Color(60, 194, 198));
        appointment_Search.setForeground(new java.awt.Color(51, 51, 51));
        appointment_Search.setText("Search");
        appointment_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointment_SearchActionPerformed(evt);
            }
        });

        User_Room.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        User_Room.setForeground(new java.awt.Color(0, 0, 0));
        User_Room.setText("Room-ID:NULL");

        User_ID.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        User_ID.setForeground(new java.awt.Color(0, 0, 0));
        User_ID.setText("User-ID: NULL");

        User_Time.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        User_Time.setForeground(new java.awt.Color(0, 0, 0));
        User_Time.setText("Time: NULL");

        User_Date.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        User_Date.setForeground(new java.awt.Color(0, 0, 0));
        User_Date.setText("Date: NULL");

        User_Fees.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        User_Fees.setForeground(new java.awt.Color(0, 0, 0));
        User_Fees.setText("Fees: NULL");

        B_appointment.setBackground(new java.awt.Color(60, 194, 198));
        B_appointment.setForeground(new java.awt.Color(51, 51, 51));
        B_appointment.setText("Confirm Appointemt");
        B_appointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_appointmentActionPerformed(evt);
            }
        });

        User_note.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        User_note.setForeground(new java.awt.Color(0, 0, 0));
        User_note.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        User_note.setText("Note: NULL");
        User_note.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(User_note, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(User_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(User_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(User_Room, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(User_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(User_Fees, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B_appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User_ID)
                    .addComponent(User_Room))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(User_Time))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(User_Date)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(User_Fees)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(User_note, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B_appointment)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Recent Appointments Added");

        appointments_Added1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        appointments_Added1.setEditingColumn(0);
        appointments_Added1.setEditingRow(0);
        appointments_Added1.setEnabled(false);
        appointments_Added1.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane3.setViewportView(appointments_Added1);

        javax.swing.GroupLayout appointments1Layout = new javax.swing.GroupLayout(appointments1);
        appointments1.setLayout(appointments1Layout);
        appointments1Layout.setHorizontalGroup(
            appointments1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointments1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(appointments1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addGroup(appointments1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        appointments1Layout.setVerticalGroup(
            appointments1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointments1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout P_AppointmentsLayout = new javax.swing.GroupLayout(P_Appointments);
        P_Appointments.setLayout(P_AppointmentsLayout);
        P_AppointmentsLayout.setHorizontalGroup(
            P_AppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_AppointmentsLayout.createSequentialGroup()
                .addGroup(P_AppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_AppointmentsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_AppointmentsLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(P_AppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_AppointmentsLayout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(appointments1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(P_AppointmentsLayout.createSequentialGroup()
                                .addGroup(P_AppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(P_AppointmentsLayout.createSequentialGroup()
                                        .addComponent(appointment_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(appointment_Search)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        P_AppointmentsLayout.setVerticalGroup(
            P_AppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_AppointmentsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(P_AppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appointment_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appointment_Search))
                .addGap(18, 18, 18)
                .addGroup(P_AppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appointments1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(P_AppointmentsLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pages_Panel.addTab("Appointments", P_Appointments);

        P_Payments.setBackground(new java.awt.Color(153, 153, 153));

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Enter the Student ID to view the payments");

        payments_Field.setBackground(new java.awt.Color(102, 102, 102));
        payments_Field.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        payments_Field.setForeground(new java.awt.Color(204, 204, 204));

        payments_search.setBackground(new java.awt.Color(60, 194, 198));
        payments_search.setForeground(new java.awt.Color(51, 51, 51));
        payments_search.setText("Search");
        payments_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payments_searchActionPerformed(evt);
            }
        });

        User_Room1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        User_Room1.setForeground(new java.awt.Color(0, 0, 0));
        User_Room1.setText("Room-ID:NULL");

        User_ID1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        User_ID1.setForeground(new java.awt.Color(0, 0, 0));
        User_ID1.setText("User-ID: NULL");

        User_Time1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        User_Time1.setForeground(new java.awt.Color(0, 0, 0));
        User_Time1.setText("Time: NULL");

        User_Date1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        User_Date1.setForeground(new java.awt.Color(0, 0, 0));
        User_Date1.setText("Date: NULL");

        User_Fees1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        User_Fees1.setForeground(new java.awt.Color(0, 0, 0));
        User_Fees1.setText("Fees: NULL");

        B_payment.setBackground(new java.awt.Color(60, 194, 198));
        B_payment.setForeground(new java.awt.Color(51, 51, 51));
        B_payment.setText("Confirm Payments");
        B_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_paymentActionPerformed(evt);
            }
        });

        User_Time2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        User_Time2.setForeground(new java.awt.Color(0, 0, 0));
        User_Time2.setText("Feedback:");

        feedback.setColumns(20);
        feedback.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        feedback.setLineWrap(true);
        feedback.setRows(5);
        jScrollPane5.setViewportView(feedback);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(B_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(User_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(User_Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(User_Room1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(User_Time1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(User_Time2)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5)
                                .addGap(2, 2, 2)))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(User_Fees1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User_ID1)
                    .addComponent(User_Room1))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(User_Time1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(User_Date1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(User_Fees1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(User_Time2)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B_payment)
                .addGap(14, 14, 14))
        );

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Payments");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Payments");

        payments_Added.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        payments_Added.setEditingColumn(0);
        payments_Added.setEditingRow(0);
        payments_Added.setEnabled(false);
        payments_Added.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane4.setViewportView(payments_Added);

        javax.swing.GroupLayout PaymentsLayout = new javax.swing.GroupLayout(Payments);
        Payments.setLayout(PaymentsLayout);
        PaymentsLayout.setHorizontalGroup(
            PaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addGroup(PaymentsLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PaymentsLayout.setVerticalGroup(
            PaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout P_PaymentsLayout = new javax.swing.GroupLayout(P_Payments);
        P_Payments.setLayout(P_PaymentsLayout);
        P_PaymentsLayout.setHorizontalGroup(
            P_PaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PaymentsLayout.createSequentialGroup()
                .addGroup(P_PaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_PaymentsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_PaymentsLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(P_PaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_PaymentsLayout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Payments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(P_PaymentsLayout.createSequentialGroup()
                                .addGroup(P_PaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(P_PaymentsLayout.createSequentialGroup()
                                        .addComponent(payments_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(payments_search)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        P_PaymentsLayout.setVerticalGroup(
            P_PaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PaymentsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(P_PaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payments_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payments_search))
                .addGap(18, 18, 18)
                .addGroup(P_PaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Payments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pages_Panel.addTab("Payments", P_Payments);

        P_feedbacks.setBackground(new java.awt.Color(153, 153, 153));

        Feedback_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Feedback_data.setEditingColumn(0);
        Feedback_data.setEditingRow(0);
        Feedback_data.setEnabled(false);
        Feedback_data.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane6.setViewportView(Feedback_data);

        javax.swing.GroupLayout FeedbaksLayout = new javax.swing.GroupLayout(Feedbaks);
        Feedbaks.setLayout(FeedbaksLayout);
        FeedbaksLayout.setHorizontalGroup(
            FeedbaksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedbaksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                .addContainerGap())
        );
        FeedbaksLayout.setVerticalGroup(
            FeedbaksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FeedbaksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Feedbacks");

        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Enter the Student ID to filter the table");

        feedback_field.setBackground(new java.awt.Color(102, 102, 102));
        feedback_field.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        feedback_field.setForeground(new java.awt.Color(204, 204, 204));
        feedback_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                feedback_fieldKeyPressed(evt);
            }
        });

        filter_Feedbacks.setBackground(new java.awt.Color(60, 194, 198));
        filter_Feedbacks.setForeground(new java.awt.Color(51, 51, 51));
        filter_Feedbacks.setText("Search");
        filter_Feedbacks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filter_FeedbacksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_feedbacksLayout = new javax.swing.GroupLayout(P_feedbacks);
        P_feedbacks.setLayout(P_feedbacksLayout);
        P_feedbacksLayout.setHorizontalGroup(
            P_feedbacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_feedbacksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_feedbacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Feedbaks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(P_feedbacksLayout.createSequentialGroup()
                        .addGroup(P_feedbacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(P_feedbacksLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(P_feedbacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(P_feedbacksLayout.createSequentialGroup()
                                        .addComponent(feedback_field, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(filter_Feedbacks)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_feedbacksLayout.setVerticalGroup(
            P_feedbacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_feedbacksLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(P_feedbacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feedback_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filter_Feedbacks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Feedbaks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pages_Panel.addTab("Feedbacks", P_feedbacks);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pages_Panel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pages_Panel)
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        Heading.setFont(new java.awt.Font("Trebuchet MS", 2, 42)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setText("Dashboard");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Heading)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Heading)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        dataset_Creater();
        total_Calculation();
        
    }//GEN-LAST:event_formWindowOpened

    private void appointment_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointment_SearchActionPerformed
        // TODO add your handling code here:
        User_ID.setText("User ID: NULL");
        User_Room.setText("Room ID: NULL");
        User_Time.setText("Time: NULL");
        User_Date.setText("Date: NULL");
        User_Fees.setText("Fees: NULL");
        User_note.setText("Note: NULL");
        try {
            if (tt.validation(appointment_Field.getText(),0)){
                tt.get_User_Info(appointment_Field.getText(),0);
                User_ID.setText("User ID: "+tt.get_UserID());
                User_Room.setText("Room ID: "+tt.get_User_room());
                User_Time.setText("Time: "+tt.get_User_time());
                User_Date.setText("Date: "+tt.get_User_date());
                User_Fees.setText("Fees: RM"+tt.get_User_bill());
                User_note.setText("Note: "+tt.get_User_note());
                
            }
            else{
                JOptionPane.showMessageDialog(jf,"Student ID is wrong or no ID was inputed\n. Please try again");
                appointment_Field.setText("");
                        }
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(jf,"Student ID is wrong or no ID was inputed\n. Please try again");
        }

    }//GEN-LAST:event_appointment_SearchActionPerformed

    private void B_appointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_appointmentActionPerformed
        try {
            // TODO add your handling code here:
            p.File_Writer(appointment_Field.getText());
            
            
        } catch (Exception ex) {
            Logger.getLogger(Technicion_Software.class.getName()).log(Level.SEVERE, null, ex);
        }
        dataset_Creater();
        total_Calculation();
    }//GEN-LAST:event_B_appointmentActionPerformed

    private void payments_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payments_searchActionPerformed
        // TODO add your handling code here:
        User_ID1.setText("User ID: NULL");
        User_Room1.setText("Room ID: NULL");
        User_Time1.setText("Time: NULL");
        User_Date1.setText("Date: NULL");
        User_Fees1.setText("Fees: NULL");
        try {
            if (tt.validation(payments_Field.getText(),1)){
                tt.get_User_Info(payments_Field.getText(),1);
                User_ID1.setText("User ID: "+tt.get_UserID());
                User_Room1.setText("Room ID: "+tt.get_User_room());
                User_Time1.setText("Time: "+tt.get_User_time());
                User_Date1.setText("Date: "+tt.get_User_date());
                User_Fees1.setText("Fees: "+tt.get_User_bill()+"RM");
                
            }
            else{
                JOptionPane.showMessageDialog(jf,"Student ID is wrong or no ID was inputed\n. Please try again");
                appointment_Field.setText("");
            }
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(jf,"Student ID is wrong or no ID was inputed\n. Please try again");
        }
        
    }//GEN-LAST:event_payments_searchActionPerformed

    private void B_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_paymentActionPerformed
        // TODO add your handling code here:
        if(feedback.getText() != null){
            try {
                // TODO add your handling code here:
                f.File_Writer(payments_Field.getText(),feedback.getText());
            } catch (Exception ex) {
                Logger.getLogger(Technicion_Software.class.getName()).log(Level.SEVERE, null, ex);
            }
            dataset_Creater();
            total_Calculation();
        }
        else
            JOptionPane.showMessageDialog(jf,"Feedback is missing\n. Please try again");       
    }//GEN-LAST:event_B_paymentActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        Rlogin rl = new Rlogin();
        rl.show();
        dispose();
                
    }//GEN-LAST:event_LogoutActionPerformed

    private void filter_FeedbacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filter_FeedbacksActionPerformed
        // TODO add your handling code here:
        String searchString = feedback_field.getText();
        search_payment(searchString);
        
    }//GEN-LAST:event_filter_FeedbacksActionPerformed
    public void search_payment(String str){
        DefaultTableModel model= (DefaultTableModel)Feedback_data.getModel();
        TableRowSorter<DefaultTableModel>  t= new TableRowSorter<>(model);
        Feedback_data.setRowSorter(t);
        t.setRowFilter(RowFilter.regexFilter(str));
    }
    private void feedback_fieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_feedback_fieldKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_feedback_fieldKeyPressed
    private void dataset_Creater(){
        try {
            
            BufferedReader data = tt.UsersData()[0];
            BufferedReader data_Payment = tt.UsersData()[1];
            BufferedReader data_Feedback = tt.UsersData()[2];
            String[] columnName = data.readLine().split("::");
            String[] Payment_columnName = data_Payment.readLine().split("::");
            String[] Feedback_columnName = data_Feedback.readLine().split("::");
            DefaultTableModel appoint = (DefaultTableModel)appointments_Added.getModel();
            DefaultTableModel appoint2 = (DefaultTableModel)appointments_Added1.getModel();
            DefaultTableModel payment1 = (DefaultTableModel)fees_Summary.getModel();
            DefaultTableModel payment2 = (DefaultTableModel)payments_Added.getModel();
            DefaultTableModel feedback1 = (DefaultTableModel)Feedback_data.getModel();
            appoint.setColumnIdentifiers(columnName);
            appoint2.setColumnIdentifiers(columnName);
            payment1.setColumnIdentifiers(Payment_columnName);
            payment2.setColumnIdentifiers(Payment_columnName);
            feedback1.setColumnIdentifiers(Feedback_columnName);
            Object[] tableRaws = data.lines().toArray();
            Object[] payment_tableRaws = data_Payment.lines().toArray();
            Object[] feedback_tableRaws = data_Feedback.lines().toArray();
            appoint.setRowCount(0);
            appoint2.setRowCount(0);
            payment1.setRowCount(0);
            payment2.setRowCount(0);
            feedback1.setRowCount(0);
            
            for(int i = 0;i< tableRaws.length;i++){
                String line = tableRaws[i].toString().trim();
                String[] dataRow = line.split("::");
                appoint.addRow(dataRow);
                appoint2.addRow(dataRow);
            }  
            
            for(int i = 0;i< payment_tableRaws.length;i++){
                String line = payment_tableRaws[i].toString().trim();
                String[] dataRow = line.split("::");
                payment1.addRow(dataRow);
                payment2.addRow(dataRow);
            }
            
            for(int i = 0;i< feedback_tableRaws.length;i++){
                String line = feedback_tableRaws[i].toString().trim();
                String[] dataRow = line.split("::");
                feedback1.addRow(dataRow);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Technicion_Software.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void total_Calculation(){
        try {
            total_payments.setText(Integer.toString(p.get_Total_Payments()));
        } catch (Exception ex) {
            Logger.getLogger(Technicion_Software.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            // TODO add your handling code here:
            total_App.setText(String.valueOf(tt.get_Total_Users())+" Users");
        } catch (Exception ex) {
            total_App.setText("No Appointments");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Technicion_Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Technicion_Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Technicion_Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Technicion_Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Technicion_Software().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_appointment;
    private javax.swing.JButton B_payment;
    private javax.swing.JTable Feedback_data;
    private javax.swing.JPanel Feedbaks;
    private javax.swing.JLabel Heading;
    private javax.swing.JButton Logout;
    private javax.swing.JPanel P_Appointments;
    private javax.swing.JPanel P_Payments;
    private javax.swing.JPanel P_feedbacks;
    private javax.swing.JPanel P_home;
    private javax.swing.JPanel Payments;
    private javax.swing.JPanel T_appointments;
    private javax.swing.JPanel T_payments;
    private javax.swing.JLabel User_Date;
    private javax.swing.JLabel User_Date1;
    private javax.swing.JLabel User_Fees;
    private javax.swing.JLabel User_Fees1;
    private javax.swing.JLabel User_ID;
    private javax.swing.JLabel User_ID1;
    private javax.swing.JLabel User_Room;
    private javax.swing.JLabel User_Room1;
    private javax.swing.JLabel User_Time;
    private javax.swing.JLabel User_Time1;
    private javax.swing.JLabel User_Time2;
    private javax.swing.JLabel User_note;
    private javax.swing.JTextField appointment_Field;
    private javax.swing.JButton appointment_Search;
    private javax.swing.JPanel appointments;
    private javax.swing.JPanel appointments1;
    private javax.swing.JTable appointments_Added;
    private javax.swing.JTable appointments_Added1;
    private javax.swing.JTextArea feedback;
    private javax.swing.JTextField feedback_field;
    private javax.swing.JPanel fees;
    private javax.swing.JTable fees_Summary;
    private javax.swing.JButton filter_Feedbacks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane pages_Panel;
    private javax.swing.JTable payments_Added;
    private javax.swing.JTextField payments_Field;
    private javax.swing.JButton payments_search;
    private javax.swing.JLabel total_App;
    private javax.swing.JLabel total_payments;
    // End of variables declaration//GEN-END:variables


}
