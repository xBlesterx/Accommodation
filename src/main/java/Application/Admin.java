/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.io.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexl
 */
public class Admin extends User{
    private String aid;
    private String ap;
    private String atype;
    private String aname; //2type after
    private String manager;
    private String technician;
    public int ln;
    public int attempt;
    //private final File f = new File("C:\\Users\\user\\Desktop\\java_Assignment\\Main_Application\\src\\main\\java");
    SimpleDateFormat Time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    public int countm;
    public String tempoid;
    public boolean successful;
    
    public Admin(String tid,String tn){
        super(tid,tn);
        aid = tid;
        aname = tn;
        ap = "";
        atype = "";
        manager = "m";
        technician ="t";
        
    }
    


    public void setP(String tp){
        this.ap = tp;
    }
    
    //public void setType(String tt){
        //this.atype = tt;
    //}

    
    public String getID(){
        return aid;
    }
    
    public String getP(){
        return ap;
    }
    
    public String getN(){
        return aname;
    }
    
    @Override
    public String toString(){
        return "Admin ID:"+ aid + " " + "Name:"+ aname + " " + "is registered";
    }
    
    public void writeLog(){
        String filepath1 = "log.txt"; // if got out of indexbound problem check for textfile remove extra white blankline.
        File file1 = new File(filepath1);
        try{
            FileWriter writer = new FileWriter(file1,true);
            writer.append("\n"+ "id::" + getID() +"\n" + "password::" +getP() + "\n" + "type::Technician" +"\n" + "Status::Success" + "\n" + "Time::" + Time.format(timestamp));
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
    
           
    public void registration(String at){
        String filepath1 = "admin.txt"; // if got out of indexbound problem check for textfile remove extra white blankline.
        File file1 = new File(filepath1);
        try{
        FileWriter writer = new FileWriter(file1,true);
        writer.append("\n"+ "id::" + getID() +"\n" + "password::" +getP()+ "\n" + "type::"+ gettype(at) + "\n"+ "name::"+ getN());
        writer.write(System.getProperty("line.separator"));
        writer.close();
        JOptionPane.showMessageDialog(null, "Successfully Registered","Registered", JOptionPane.ERROR_MESSAGE);
        } catch(IOException e){
        e.printStackTrace();
        }
    }
    
    public String DetectRow() throws FileNotFoundException, IOException{
        String x = null;
        countline();
        RandomAccessFile raf = new RandomAccessFile("admin.txt","rw");
        for(int i=0;i<ln;i+=5){
            String temaid = raf.readLine().substring(4);
            return x = temaid;
        }
        return x;
    }
    
    //removeRow("filepath","1234",1,:)
    public void removeRow(String filepath,String rt,int pot) throws IOException{
        int p = pot - 1;
        String data[];
        String tempFile = "temp.txt" ;
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);
        String cl;
        FileWriter fw = new FileWriter(tempFile,true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        FileReader fr = new FileReader(filepath);
        BufferedReader br = new BufferedReader(fr);

        while((cl = br.readLine()) != null){
            System.out.println(cl);
            if(!(cl.equalsIgnoreCase(rt))){
                pw.println(cl);
            }
        }
        pw.flush();
        pw.close();
        fr.close();
        br.close();
        bw.close();
        fw.close();
        oldFile.delete();
        File dump = new File("registration.txt");
        newFile.renameTo(dump);

        

        
    }
    
    
    
    /*
    public void deleteUser(String r) throws FileNotFoundException, IOException{;
        String loc = "temp.txt";
        String filepath = "\\admin\\test.txt";
        File oldFile = new File(f+"\\admin\\test.txt"); 
        File newFile = new File(f+"\\admin\\"); 
        BufferedReader reader = new BufferedReader(new FileReader(oldFile)); //inputFile
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFile)); //tempFile
        String lineToRemove = r; 
        String currentLine; 
        while((currentLine = reader.readLine()) != null) { 
        // trim newline when comparing with lineToRemove 
            String trimmedLine = currentLine.trim(); 
            if(trimmedLine.equals(lineToRemove)) continue; 
            writer.write(currentLine + System.getProperty("line.separator")); 
        } 
        writer.close();  
        reader.close();  
        
        oldFile.delete();
        File dump = new File(f+filepath);
        newFile.renameTo(dump);
        //successful = tempFile.renameTo(inputFile); 
    }*/
    
    
      /*
     public void remove_appointments(String row) throws Exception{
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(f+"\\admin\\test.txt"));
        FileWriter writer = new FileWriter(f+"\\admin\\test.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
            while((line = reader.readLine()) != null){
                int i = 0;
                String[] values = line.split("::");
                System.out.println(values[0]+"::"+values[1]+"::"+values[2]+"::"+ values[3]+ "::"+ values[4]);
                System.out.println(row + "111");
                String line1 = values[0]+"::"+values[1]+"::"+values[2]+"::"+ values[3]+ "::"+ values[4];
                if (row.equals(line1)){
                    System.out.println(line1+" is not add");
                }
                else{
                bufferedWriter.write(row);
                bufferedWriter.newLine();
                }
            }
        bufferedWriter.close(); 
        FileInputStream inputStream = new FileInputStream(f+"\\admin\\test.txt");  
        FileOutputStream outputStream = new FileOutputStream(f+"\\admin\\temp.txt");  
        // use try-catch-finally block to read and write bytes data into file  
        try {  
            // declare variable for indexing  
            int i;  
            // use while loop with read() method of FileInputStream class to read bytes data from file1  
            while ((i = inputStream.read()) != -1) {  

                // use write() method of FileOutputStream class to write the byte data into file2  
                outputStream.write(i);  
            }  
        }  
        // catch block to handle exceptions  
        catch(Exception e) {  
            System.out.println("Error Found: "+e.getMessage());  
        }  
        // use finally to close instance of the FileInputStream and FileOutputStream classes  
        finally {  
            if (inputStream != null) {  
        // use close() method of FileInputStream class to close the stream  
                inputStream.close();  
            }  
            // use close() method of FileOutputStream class to close the stream  
            if (outputStream != null) {  
                outputStream.close();  
            }  
        }  
        System.out.println("File Copied");  
        File delete = new File(f+"\\test.txt");
        delete.delete();
     }*/
     
}   
