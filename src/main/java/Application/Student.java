/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import static Application.technision_User.file_Path;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alexl
 */
public class Student extends User{
    private String studentid;
    private String studentname;
    private String studenttp;
    private String studente;
    private String studentri;
    String filepath = "C:\\Users\\user\\Desktop\\java_Assignment\\Main_Application";
    private final File f = new File("C:\\Users\\user\\Desktop\\java_Assignment\\Main_Application");
    public String line;
    
    public Student(String sid,String sn,String sri){
        super(sid,sn);
        studentid = sid;
        studentname = sn;
        studenttp = "";//getTPtxt();
        studente =  ""; //getEtxt();
        studentri = sri;
    }
    
    public String getID(){
        return studentid;
    }
    
    public String getName(){
        return studentname;
    }
    
    public String getTP(){
        return studenttp;
    }
    
    public String getE(){
        return studente;
    }
    
    public String getRI(){
        return studentri;
    }
    
    
    
    
    
    public void setID(String TID){
        this.studentid = TID;
    }
    
    public void setName(String TN){
        this.studentname = TN;
    }
    
    public void setTP(String TTP){
        this.studenttp = TTP;
    }
    
    public void setE(String TE){
        this.studente = TE;
    }
    
    public void setRI(String TRI){
        this.studentri = TRI;
    }
    
    public String checkUser(String sid,String sn) throws IOException{
        sid = getID();
        sn = getName();
        String check ="";
        File data_Appointments = new File("registration.txt");
        BufferedReader reader = new BufferedReader(new FileReader(data_Appointments));
        try {
            
            while ((line = reader.readLine()) != null){ //loop will run from 2nd line
                String wholeline = reader.readLine().trim();
                String[] studentinfo = wholeline.split("::");
                if(getID().equals(studentinfo[0])){
                    return check = "e";
                }
        }} catch (FileNotFoundException ex) {
            Logger.getLogger(studentR.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
        
        }
    
    public void registration(){
        String filepath1 = "registration.txt";
        File file1 = new File(filepath1);
        try{
        FileWriter writer = new FileWriter(file1,true);
        writer.append("\n"+ getID() + "::" +getName()+"::"+ getTP() + "::"+ getE() +"::" + getRI());
        writer.write(System.getProperty("line.separator"));
        writer.close();
        JOptionPane.showMessageDialog(null, "Successfully Registered","Registered", JOptionPane.ERROR_MESSAGE);
        }catch(IOException e){
        e.printStackTrace();
        }
    }
    
    
    
    
    
    
    
    
    
    
    @Override
    public String toString(){
        return "Student ID:" + " " +studentid+ " "+ "Name:" + " " + studentname + "is registered";
    }
    

}
