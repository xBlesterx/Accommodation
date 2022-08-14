/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alexl
 */
public class HomeAppliances extends Student{
    private String productname;
    private int fees;
    private String Hstudentname;
    private String Hstudentid;
    private String Hstudentri;
    private final File f = new File("C:\\Users\\user\\Desktop\\java_Assignment\\Main_Application\\src\\main\\java\\Data");
    public String line;
    public ArrayList<String> things = new ArrayList<String>();
   
    
    public HomeAppliances(String hsn,String hsi,String hri,String pn){
        super(hsn,hsi,hri);
        this.Hstudentid = hsi;
        this.Hstudentname = hsn;
        this.Hstudentri = hri;
        this.productname = pn;
        this.fees = 0;
        things.add("TV");
        things.add("AC");
        things.add("Iron");
        things.add("Fan");
        things.add("Washing Machine");
        things.add("Vacuum Cleanaer");
        things.add("Mixer");
        things.add("Refrigerator");
        things.add("Hair Dryer");
    }
    
    public String getID(){
        return Hstudentid;
    }
    
    public String getRI(){
        return Hstudentri;
    }
    
    public String getPN(){
        return productname;
    }
    
    public void setPN(String TPN){
        this.productname = TPN;
    }
    
    public void setFees(int TF){
        this.fees = TF;
    }

    
    public int calFees(String pn){
        int servicesfees = 50;
        if(pn.equals(things.get(0))){
             fees = 200 + servicesfees;
             return fees;
        }
        else if(pn.equals(things.get(1))){
            fees = 100 + servicesfees;
            return fees;
        }
        else if(pn.equals(things.get(2))){
            fees = 50 + servicesfees;
            return fees;
        }
        else if(pn.equals(things.get(3))){
            fees = 50 + servicesfees;
            return fees;
        }
        else if(pn.equals(things.get(4))){
            fees = 300+ servicesfees;
            return fees;
        }
        else if(pn.equals(things.get(5))){
            fees = 50 + servicesfees;
            return fees;
        }
        else if(pn.equals(things.get(6))){
            fees = 50 + servicesfees;
            return fees;
        }
        else if(pn.equals(things.get(7))){
            fees = 300+ servicesfees;
            return fees;
        }
        else if(pn.equals(things.get(8))){
            fees = 50 + servicesfees;
            return fees;
        }
        return fees;
    }
    
   public String checkUser(String sid,String ri) throws IOException{
        sid = Hstudentid;
        ri = Hstudentri;
        String check ="";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("registration.txt"));
            while ((line = reader.readLine()) != null){ //loop will run from 2nd line
                String wholeline = reader.readLine().trim();
                String[] studentinfo = wholeline.split("::");
                if(sid.equals(studentinfo[0]) && ri.equals(studentinfo[4])){
                    return check = "e";
                }
                else if(getID().equals(studentinfo[0]) || getRI().equals(studentinfo[4]) ){
                    return check = "n";
                }
        }} catch (FileNotFoundException ex) {
            Logger.getLogger(studentR.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
   
   public void bookAppointment(String date,String time,String note,String fe){
        String filepath1 = "Appointments.txt";
        File file1 = new File(filepath1);
        
        try{
        FileWriter writer = new FileWriter(file1,true);
        BufferedWriter reader = new BufferedWriter(writer);
        reader.newLine();
        writer.append(getID() + "::" + getRI()+"::"+ getPN() + "::"+ date + "::" + time + "::"+ note + "::" + calFees(fe)+"::");
        writer.write(System.getProperty("line.separator"));
        writer.close();
        JOptionPane.showMessageDialog(null, "Successfully Book Appointment","Registered", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Kindly Wait for Technician to Contact You","Registered", JOptionPane.INFORMATION_MESSAGE);
        }catch(IOException e){
        e.printStackTrace();
        }
    }
   
}
