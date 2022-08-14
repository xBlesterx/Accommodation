/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

//import static com.mycompany.java_technision.technision_User.tt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Payments extends technision_User implements Interface{
    public static final String file_path = file_Path;
    private int total;
    JFrame jf = new JFrame();
    public void File_Writer(String UserID) throws Exception{
        boolean checks = false;
        //writes the confirmed appointments to the payment data to be saved
        //ID::ROOM-ID::PROBLEM::DATE::TIME::FEES::STATUS::
        //Create the filewriter with the file path
        FileWriter writer = new FileWriter("Payments.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        get_User_Info(UserID,0);
        //validation for the user input
        if(tt.validation(UserID,0)){
            try {
                //the commint that needs to be written to the file incase validaiton is true
                bufferedWriter.write(get_UserID()+"::"+get_User_room()+"::"+get_User_prob()+"::"+
                        get_User_date()+"::"+get_User_time()+"::Unpaid::"+get_User_bill()+"::\n");
                bufferedWriter.close();
                checks = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //message box incase the validation is false alerting the user
        else{JOptionPane.showMessageDialog(jf,"Student ID is wrong or no ID was inputed\n. Please try again");}
        remove_Data(UserID,"Appointments.txt",0);
        if (checks)
            JOptionPane.showMessageDialog(jf,"Your appointment has been confirmed");
    }
    
    
    /*
    public static void main(String[] args) throws Exception{
        Payments p = new Payments("TP056678");
        p.Writer();
    }
*/

    @Override
    public void File_Writer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
