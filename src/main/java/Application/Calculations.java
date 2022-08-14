/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import static Application.technision_User.tt;
import java.io.BufferedReader;

/**
 *
 * @author user
 */
public class Calculations{
    private int total_Payments;
    private int total_Users;

    public int get_Total_Payments() throws Exception{
        int total = 0;
        String line;
        BufferedReader data = tt.UsersData()[1];
        line = data.readLine();
        while(line != null){
            int i = 0;            
            //System.out.println(line);
            String[] values = line.split("::");
            if(values != null){
                while(i < values.length){ 
                        try 
                        { 
                            total += Integer.parseInt(values[6]);
                            break;	
                        }  
                        catch (NumberFormatException e)  
                        { 
                            System.out.println(values[5] + " is not a valid integer"); 
                        } 
                    //System.out.println(values[i]);
                    i++;
                }
            }
            line = data.readLine();
        }
        return this.total_Payments = total;
    }
    public int get_Total_Users() throws Exception{
        //to calculate the total number of the students with appointment
        BufferedReader data = tt.UsersData()[0];
        String line = data.readLine();
        int i = 0;
        while(line != null){
            i++;
            line = data.readLine();
        }
        return this.total_Users = i-1;//-1 to remove the headers so it will not be counted
    }
    
}
