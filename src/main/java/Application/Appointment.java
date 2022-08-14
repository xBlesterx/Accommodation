/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Application;

import java.awt.event.KeyEvent;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alexl
 */
public class Appointment extends javax.swing.JFrame {
    
    File f = new File("C:\\Users\\user\\Desktop\\java_Assignment\\Main_Application");
    String line;

    /**
     * Creates new form Appointment
     */
    public Appointment() {
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

        panel1 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblsi = new javax.swing.JLabel();
        lblri = new javax.swing.JLabel();
        lbldt = new javax.swing.JLabel();
        butBook = new javax.swing.JButton();
        Ridtxt = new javax.swing.JTextField();
        Sidtxt = new javax.swing.JTextField();
        ProductCB = new javax.swing.JComboBox<>();
        lblri1 = new javax.swing.JLabel();
        lbldt1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notetxt = new javax.swing.JTextArea();
        lbldt2 = new javax.swing.JLabel();
        lbldt3 = new javax.swing.JLabel();
        butBack = new javax.swing.JButton();
        DTP = new com.github.lgooddatepicker.components.DateTimePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(4, 194, 198));

        jLabel2.setText("APU Hostel Appliances ");
        jLabel2.setFont(new java.awt.Font("Century Gothic", 2, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("APPOINTMENT");
        jLabel4.setFont(new java.awt.Font("Century Gothic", 2, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblsi.setText("STUDENT ID:");
        lblsi.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N

        lblri.setText("ROOM ID:");
        lblri.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N

        lbldt.setText("Note:");
        lbldt.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N

        butBook.setText("Book Appointment");
        butBook.setFont(new java.awt.Font("Century Gothic", 2, 16)); // NOI18N
        butBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBookActionPerformed(evt);
            }
        });

        Ridtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(155, 103, 60)));
        Ridtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RidtxtKeyPressed(evt);
            }
        });

        Sidtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(155, 103, 60)));
        Sidtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SidtxtKeyPressed(evt);
            }
        });

        ProductCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TV", "AC", "Iron", "Fan", "Washing Machine", "Vacuum Cleaner", "Mixer", "Refrigerator", "Hair Dryer" }));
        ProductCB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProductCBKeyPressed(evt);
            }
        });

        lblri1.setText("DATE/TIME:");
        lblri1.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N

        lbldt1.setText("PRODUCT:");
        lbldt1.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N

        notetxt.setColumns(20);
        notetxt.setRows(5);
        notetxt.setText("..........");
        notetxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(155, 103, 60)));
        jScrollPane1.setViewportView(notetxt);

        lbldt2.setText("(If you have any special requestment");
        lbldt2.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N

        lbldt3.setText("Or more than 1 product)");
        lbldt3.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N

        butBack.setText("Back");
        butBack.setFont(new java.awt.Font("Century Gothic", 2, 16)); // NOI18N
        butBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBackActionPerformed(evt);
            }
        });

        DTP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(155, 103, 60)));
        DTP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DTPKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblsi)
                    .addComponent(lbldt1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butBack, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldt))
                        .addGap(12, 12, 12)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ProductCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblri1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Sidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblri, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DTP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ridtxt))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldt3)
                            .addComponent(lbldt2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butBook))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsi)
                    .addComponent(lblri)
                    .addComponent(Ridtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductCB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblri1)
                    .addComponent(lbldt1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DTP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldt)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldt3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butBook, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butBack, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RidtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RidtxtKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            ProductCB.requestFocusInWindow();
        }
    }//GEN-LAST:event_RidtxtKeyPressed
    
    String checkUser() throws IOException{
        Student student1 = new Student(Sidtxt.getText(),null,Ridtxt.getText());
        String check ="";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("registration.txt"));
            while ((line = reader.readLine()) != null){ //loop will run from 2nd line
                String wholeline = reader.readLine().trim();
                String[] studentinfo = wholeline.split("::");
                if(student1.getID().equals(studentinfo[0]) && student1.getRI().equals(studentinfo[4])){
                    return check = "e";
                }
                else if(student1.getID().equals(studentinfo[0]) || student1.getRI().equals(studentinfo[4]) ){
                    return check = "n";
                }
        }} catch (FileNotFoundException ex) {
            Logger.getLogger(studentR.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
    
    
    
    
    private void SidtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SidtxtKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if(Character.isDigit(c) || Character.isUpperCase(c)|| Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            Sidtxt.setEditable(true);
        }else
        {
            Sidtxt.setEditable(false);
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Ridtxt.requestFocusInWindow();
        }
    }//GEN-LAST:event_SidtxtKeyPressed

    private void ProductCBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProductCBKeyPressed
            // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            DTP.requestFocusInWindow();
        }
    }//GEN-LAST:event_ProductCBKeyPressed

    private void DTPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DTPKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            butBook.doClick();
        }

    }//GEN-LAST:event_DTPKeyPressed

    private void butBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBookActionPerformed
        // TODO add your handling code here:
        HomeAppliances ha = new HomeAppliances(null,Sidtxt.getText(),Ridtxt.getText(),ProductCB.getSelectedItem().toString());
        try {
            // TODO add your handling code here:
            if(Sidtxt.getText().equals("") || Ridtxt.getText().equals("") || ProductCB.getSelectedItem().toString().equals("")){
                JOptionPane.showMessageDialog(null, "Please fill up all the field","Registered", JOptionPane.ERROR_MESSAGE);
            }
            else{
                if(ha.checkUser(Sidtxt.getText(),Ridtxt.getText()).equals("e")){
                    //HomeAppliances ha = new HomeAppliances(ProductCB.getSelectedItem().toString());
                    String d = DTP.datePicker.toString();
                    String t = DTP.timePicker.toString();
                    String n = notetxt.getText();
                    int fee = ha.calFees(ProductCB.getSelectedItem().toString());
                    ha.bookAppointment(d,t,n,ProductCB.getSelectedItem().toString());
                    /*
                    String filepath1 = f+"\\Appointment\\Appointment.txt";
                    File file1 = new File(filepath1);
                    try{
                    FileWriter writer = new FileWriter(file1,true);
                    writer.append("\n"+ ha.getID() + "::" + ha.getRI()+"::"+ha.getPN() + "::"+ DTP.datePicker.toString() + "::" +DTP.timePicker.toString() + "::"+ notetxt.getText() + "::" + ha.calFees(ProductCB.getSelectedItem().toString()));
                    writer.write(System.getProperty("line.separator"));
                    writer.close();
                    JOptionPane.showMessageDialog(null, "Successfully Book Appointment","Registered", JOptionPane.ERROR_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Kindly Wait for Technician to Contact You","Registered", JOptionPane.INFORMATION_MESSAGE);
                    }catch(IOException e){
                    e.printStackTrace();
                    }
                    Sidtxt.setText("");
                    Ridtxt.setText("");
                    ProductCB.setSelectedItem("");
                    DTP.removeAll();
                    */
                }
                else{
                    JOptionPane.showMessageDialog(null, "The Information is not match OR Student is not registered yet","Registered", JOptionPane.ERROR_MESSAGE);
                }
        }} catch (IOException ex) {
            Logger.getLogger(studentR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_butBookActionPerformed

    private void butBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBackActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_butBackActionPerformed

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
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DateTimePicker DTP;
    private javax.swing.JComboBox<String> ProductCB;
    private javax.swing.JTextField Ridtxt;
    private javax.swing.JTextField Sidtxt;
    private javax.swing.JButton butBack;
    private javax.swing.JButton butBook;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldt;
    private javax.swing.JLabel lbldt1;
    private javax.swing.JLabel lbldt2;
    private javax.swing.JLabel lbldt3;
    private javax.swing.JLabel lblri;
    private javax.swing.JLabel lblri1;
    private javax.swing.JLabel lblsi;
    private javax.swing.JTextArea notetxt;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}