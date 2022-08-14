/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import static Application.Payments.file_path;
//import static com.mycompany.java_technision.technision_User.tt;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Feedbacks extends technision_User implements Interface{
    JFrame jf = new JFrame();
    
        
    /**
     *
     * @param UserID
     * @param feedback
     * @throws Exception
     */
    public void File_Writer(String UserID,String feedback) throws Exception{
        boolean checks = false;
        //writes the confirmed appointments to the payment data to be saved
        //ID::ROOM-ID::PROBLEM::DATE::TIME::FEES::STATUS::Feedback::
        FileWriter writer = new FileWriter("Feedbacks.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        get_User_Info(UserID,1);
        if(tt.validation(UserID,1)&&feedback != null){
            try {
                bufferedWriter.write(get_UserID()+"::"+get_User_room()+"::"+get_User_prob()+"::"+
                        get_User_date()+"::"+get_User_time()+"::"+get_User_bill()+"::paid::"+feedback+"::\n");
                bufferedWriter.close();
                checks = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{JOptionPane.showMessageDialog(jf,"Student ID is wrong or no ID was inputed\n. Please try again");}
        remove_Data(UserID,"Payments.txt",1);
        if (checks)
            JOptionPane.showMessageDialog(jf,"Payment has been confirmed");
    }

    @Override
    public void File_Writer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
