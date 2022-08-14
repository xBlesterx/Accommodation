/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;
import java.io.*;


/**
 *
 * @author user
 */
public class technision_User extends Calculations{
    private String UserID;
    private String User_prob;
    private String User_date;
    private String User_time;
    private String User_bill;
    private String User_Room;
    private String User_note;
    protected static final String file_Path ="C:\\Users\\user\\Desktop\\java_Assignment\\Main_Application\\src\\main\\java\\Data";
    
    static technision_User tt = new technision_User();
    
    
    public String get_User_note(){return this.User_note;}
        
    
    public String get_UserID(){return this.UserID;}
        
    
    public String get_User_prob(){return this.User_prob;}
        
    
    public String get_User_time(){return this.User_time;}
        
    
    public String get_User_date(){return this.User_date;}
        
    
    public String get_User_bill(){return this.User_bill;}
        
    
    public String get_User_room(){return this.User_Room;}
 
    
    public BufferedReader[] UsersData() throws Exception{
        //function in control of the files readings
        File data_Appointments = new File("Appointments.txt");
        BufferedReader read_Appointments = new BufferedReader(new FileReader(data_Appointments));
        
        File data_Payment = new File("Payments.txt");
        BufferedReader read_Payment = new BufferedReader(new FileReader(data_Payment));
        
        File data_Feedback = new File("Feedbacks.txt");
        BufferedReader read_Feedback = new BufferedReader(new FileReader(data_Feedback));
        
        return new BufferedReader[] {read_Appointments,read_Payment,read_Feedback};//collects the different readers into an array
    }
    
    public void get_User_Info(String userID,int datanum) throws Exception{
        this.UserID = userID;
        String line;
        BufferedReader data = tt.UsersData()[datanum];
        line = data.readLine();
        try{
            while((line = data.readLine()) != null){
                int i = 0;            
                //System.out.println(line);
                String[] values = line.split("::");
                while(i < values.length){ 
                    //System.out.println(values[i]);
                    //ID::ROOM-ID::PROBLEM::DATE::TIME::NOTE::FEES::
                    if (this.UserID.equals(values[i])){
                        this.User_Room = values[1];
                        this.User_prob = values[2];
                        this.User_date = values[3];
                        this.User_time = values[4];
                        this.User_note = values[5];
                        this.User_bill = values[6];
                    }
                    i++;
                }
                //line = data.readLine();
            }
        }catch(IOException e ){
            System.out.println("Error"); 
        }
    }
    public StringBuffer view_Data() throws Exception{
        StringBuffer str = new StringBuffer();
        String line;
        BufferedReader data = tt.UsersData()[0];
        line = data.readLine();
        while(line != null){
            str.append("\n"+line); 
            line = data.readLine();
        } 
       System.out.println(str);
       return str;
    }
    
    public void remove_Data(String UserID,String File_name,int datanum) throws Exception{
        //the function take in the user id that will be deleted from the appointment file
        //because the technision_User has confirmed the appointment and will be transfered to 
        //the payment file
        
        String line;
        BufferedReader data = tt.UsersData()[datanum];
        //line = data.readLine();
        FileWriter writer = new FileWriter("Copy.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        
        try{
            while((line = data.readLine()) != null){
                int i = 0;            
                String[] values = line.split("::");
                String line1 = values[0];
                if (UserID.equals(line1)){
                    System.out.println(values[0]+" is not add");
                }
                else{
                    bufferedWriter.write(values[0]+"::"+values[1]+"::"+values[2]+"::"+
                            values[3]+"::"+values[4]+"::"+values[5]+"::"+values[6]+"::\n");
                    //bufferedWriter.close();
                }
                //line = data.readLine();
            }
            bufferedWriter.close();
        }catch(IOException e ){
            System.out.println("Error"); 
        }
        
        FileInputStream inputStream = new FileInputStream("Copy.txt");  
        FileOutputStream outputStream = new FileOutputStream(File_name);  
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
        File delete = new File("Copy.txt");
        delete.delete();
    }

    public boolean validation(String ID,int datanum) throws Exception{
        String line;
        BufferedReader data = tt.UsersData()[datanum];;
        line = data.readLine();
        while(line != null){
            int i = 0;            
            //System.out.println(line);
            String[] values = line.split("::");
            while(i < values.length){ 
                //System.out.println(values[i]);
                if (ID.equals(values[i])){return true;} 
                i++;
            }
            line = data.readLine();
        }
        return false;
    }
     
   /* 
    public static void main(String[] args) throws Exception{
        tt.remove_appointments("TP056678");
    }        
    */

}
   //technision tt = new technision_User();
       // int total = 
        /*
        technision_User tt = new technision_User();
        String line;
        BufferedReader data = tt.UsersData();
        line = data.readLine();
        
        while(line != null){
            
            int i = 0;            
            //System.out.println(line);
            String[] values = line.split("::");
            while(i < values.length){ 
                //System.out.println(values[i]);
                if ("TP056678".equals(values[i]))
                    System.out.println(values[2]); 
                    
                i++;
            }
            line = data.readLine();
        }
        */
/*
    private void butRegisterActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Manager manager1 = new Manager();
        manager1.setID(Sidtxt.getText());
        manager1.setName(Snametxt.getText());
        manager1.setTP(Stptxt.getText());
        manager1.setE(Setxt.getText());
        manager1.setRI(Sritxt.getText());
        try {
            // TODO add your handling code here:
            checkUser();
            if(Sidtxt.getText().equals("") || Snametxt.getText().equals("") || Setxt.getText().equals("") || Stptxt.getText().equals("") || Sritxt.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please fill up all the field","Registered", JOptionPane.ERROR_MESSAGE);
            }
            else{
                if(checkUser().equals("e")){
                    JOptionPane.showMessageDialog(null, "User already exist","Registered", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    String filepath1 = f+"\\registration\\registration.txt";
                    File file1 = new File(filepath1);
                    try{
                    FileWriter writer = new FileWriter(file1,true);
                    writer.append("\n"+manager1.getID() + "::" +manager1.getName()+"::"+manager1.getTP() + "::"+ manager1.getE() +"::" + manager1.getRI());
                    writer.write(System.getProperty("line.separator"));
                    writer.close();
                    JOptionPane.showMessageDialog(null, "Successfully Registered","Registered", JOptionPane.ERROR_MESSAGE);
                    }catch(IOException e){
                    e.printStackTrace();
                    }
                    Sidtxt.setText("");
                    Snametxt.setText("");
                    Stptxt.setText("");
                    Setxt.setText("");
                    Sritxt.setText("");
                    
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(adminR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
*/
       

