/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Application;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexl
 */
public class studentR extends javax.swing.JFrame {

    /**
     * Creates new form studentR
     */
    File f = new File("C:\\Users\\user\\Desktop\\java_Assignment\\Main_Application");
    String line;
    
    public studentR() {
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
        lblsn = new javax.swing.JLabel();
        lbltp = new javax.swing.JLabel();
        lble = new javax.swing.JLabel();
        lblri = new javax.swing.JLabel();
        Snametxt = new javax.swing.JTextField();
        Stptxt = new javax.swing.JTextField();
        Setxt = new javax.swing.JTextField();
        Sritxt = new javax.swing.JTextField();
        Sidtxt = new javax.swing.JTextField();
        butRegister = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(4, 194, 198));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 2, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("APU Hostel Appliances ");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 2, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("STUDENT REGISTRATION");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        lblsi.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        lblsi.setText("STUDENT ID:");

        lblsn.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        lblsn.setText("NAME:");

        lbltp.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        lbltp.setText("TELEPHONE:");

        lble.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        lble.setText("EMAIL:");

        lblri.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        lblri.setText("ROOM ID:");

        Snametxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(155, 103, 60)));
        Snametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SnametxtKeyPressed(evt);
            }
        });

        Stptxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(155, 103, 60), 1, true));
        Stptxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StptxtKeyPressed(evt);
            }
        });

        Setxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(155, 103, 60)));
        Setxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SetxtKeyPressed(evt);
            }
        });

        Sritxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(155, 103, 60)));
        Sritxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SritxtKeyPressed(evt);
            }
        });

        Sidtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(155, 103, 60)));
        Sidtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SidtxtKeyPressed(evt);
            }
        });

        butRegister.setText("Register");
        butRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRegisterActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbltp)
                        .addGap(162, 162, 162))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblri, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Stptxt)
                            .addComponent(Sritxt, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblsi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sidtxt)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblsn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Snametxt))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lble)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Setxt)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsi)
                    .addComponent(Sidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Snametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsn))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lble)
                    .addComponent(Setxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblri)
                    .addComponent(Sritxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
    String checkUser() throws IOException{
        Student student1 = new Student(Sidtxt.getText(),Sidtxt.getName(),null);
        String check ="";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(f+"\\registration\\registration.txt"));
            while ((line = reader.readLine()) != null){ //loop will run from 2nd line
                String wholeline = reader.readLine().trim();
                String[] studentinfo = wholeline.split("::");
                if(student1.getID().equals(studentinfo[0])){
                    return check = "e";
                }
        }} catch (FileNotFoundException ex) {
            Logger.getLogger(studentR.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }*/
    
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
            Snametxt.requestFocusInWindow();
        }
    }//GEN-LAST:event_SidtxtKeyPressed

    private void StptxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StptxtKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c) ||   Character.isWhitespace(c) || Character.isISOControl(c)){
            Stptxt.setEditable(true);
        }else if(Character.isLetter(c))
        {
            Stptxt.setEditable(false);
            JOptionPane.showMessageDialog(null, "Character is not allow","Registered", JOptionPane.ERROR_MESSAGE);
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Setxt.requestFocusInWindow();
        }
    }//GEN-LAST:event_StptxtKeyPressed

    private void SnametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SnametxtKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) ||   Character.isWhitespace(c) || Character.isISOControl(c)){
            Snametxt.setEditable(true);
        }else if(Character.isDigit(c))
        {
            Snametxt.setEditable(false);
            JOptionPane.showMessageDialog(null, "Digit number is not allow","Registered", JOptionPane.ERROR_MESSAGE);
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Stptxt.requestFocusInWindow();
        }
    }//GEN-LAST:event_SnametxtKeyPressed

    private void SetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SetxtKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Sritxt.requestFocusInWindow();
        }
    }//GEN-LAST:event_SetxtKeyPressed

    private void SritxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SritxtKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            butRegister.doClick();
        }
    }//GEN-LAST:event_SritxtKeyPressed

    private void butRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRegisterActionPerformed
        Student student1 = new Student(Sidtxt.getText(),Snametxt.getText(),null);
        student1.setTP(Stptxt.getText());
        student1.setE(Setxt.getText());
        student1.setRI(Sritxt.getText());
        try {
            // TODO add your handling code here:
            student1.checkUser(Sidtxt.getText(),Snametxt.getText());
            if(Sidtxt.getText().equals("") || Snametxt.getText().equals("") || Setxt.getText().equals("") || Stptxt.getText().equals("") || Sritxt.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please fill up all the field","Registered", JOptionPane.ERROR_MESSAGE);
            }
            else{
                if(student1.checkUser(Sidtxt.getText(),Snametxt.getText()).equals("e")){
                    JOptionPane.showMessageDialog(null, "User already exist","Registered", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    student1.registration();
                    /*
                    String filepath1 = f+"\\registration\\registration.txt";
                    File file1 = new File(filepath1);
                    try{
                    FileWriter writer = new FileWriter(file1,true);
                    writer.append("\n"+student1.getID() + "::" +student1.getName()+"::"+student1.getTP() + "::"+ student1.getE() +"::" + student1.getRI());
                    writer.write(System.getProperty("line.separator"));
                    writer.close();
                    JOptionPane.showMessageDialog(null, "Successfully Registered","Registered", JOptionPane.ERROR_MESSAGE);
                    }catch(IOException e){
                    e.printStackTrace();
                    }*/
                    Sidtxt.setText("");
                    Snametxt.setText("");
                    Stptxt.setText("");
                    Setxt.setText("");
                    Sritxt.setText("");
                    
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(studentR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_butRegisterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ManagerInterface newframe = new ManagerInterface();
        newframe.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public String getIDTxt() {
        return Sidtxt.getText();

    }
    
    public String getNametxt() {
        return Snametxt.getText();

    }
    
    public String getRitxt(){
        return Sritxt.getText();
    }
    
    public String getTPtxt(){
        return Stptxt.getText();
    }
    
    public String getEtxt(){
        return Setxt.getText();
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
            java.util.logging.Logger.getLogger(studentR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Setxt;
    private javax.swing.JTextField Sidtxt;
    private javax.swing.JTextField Snametxt;
    private javax.swing.JTextField Sritxt;
    private javax.swing.JTextField Stptxt;
    private javax.swing.JButton butRegister;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lble;
    private javax.swing.JLabel lblri;
    private javax.swing.JLabel lblsi;
    private javax.swing.JLabel lblsn;
    private javax.swing.JLabel lbltp;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
