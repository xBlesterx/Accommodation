/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexl
 */
public class User {
    private String ID;
    private String password;
    private String name;
    public int ln;
    private String atype;
    private String MANAGER;
    private String TECHNICIAN;
    File f = new File("C:\\Users\\user\\Desktop\\java_Assignment\\Main_Application\\src\\main\\java");
    SimpleDateFormat Time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    
    public User(String uid,String un){
        this.ID = uid;
        this.name = un;
        atype = "";
        MANAGER = "m";
        TECHNICIAN ="t";
    }

    public String getID(){
        return ID;
    }
    
    public String getP(){
        return password;
    }
    
    public void setID(String Tid){
        this.ID = Tid;
    }
    
    public void setpw(String Tpw){
        this.password = Tpw;
    }
    
    public enum Type{
        MANAGER,TECHNICIAN;
    }
    Type aType;
    
    public String gettype(String atype){
        if (MANAGER.equals(atype)){
            return atype = aType.MANAGER.toString();
        }
        else if(TECHNICIAN.equals(atype)){
            return atype = aType.TECHNICIAN.toString();
    }
        return atype;
    }
    
    public void writeLog(int count) throws FileNotFoundException{
        String filepath1 = "log.txt"; // if got out of indexbound problem check for textfile remove extra white blankline.
        File file1 = new File(filepath1);
        try{
            FileWriter writer = new FileWriter(file1,true);
            writer.append("\n"+ "id::" + getID() +"\n" + "password::" + getP() + "\n" + "Status::failed" + "\n" + "Time::" + Time.format(timestamp) + "\n" + "Atempt::" + count);
            writer.write(System.getProperty("line.separator"));
            writer.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    //put into admin

    
    public void writeLogM(){
        String filepath1 = "log.txt"; // if got out of indexbound problem check for textfile remove extra white blankline.
        File file1 = new File(filepath1);
        try{
            FileWriter writer = new FileWriter(file1,true);
            writer.append("\n"+ "id::" + getID() +"\n" + "password::" + getP() + "\n" + "type::Manager" +"\n" + "Status::Success" + "\n" + "Time::" + Time.format(timestamp));
            writer.write(System.getProperty("line.separator"));
            writer.close();

        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    
    public void countline() throws FileNotFoundException{
        ln =1;
        RandomAccessFile raf = new RandomAccessFile("admin.txt","rw");
        try {
            for(int i =0;raf.readLine()!=null;i++){
                ln++;
            }
        } catch (IOException ex) {
            Logger.getLogger(Rlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}

