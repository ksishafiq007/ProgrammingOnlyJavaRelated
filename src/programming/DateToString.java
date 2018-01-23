/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author KSI
 */
public class DateToString {
    public static void main(String args[]){  
                Date date = Calendar.getInstance().getTime();  
                Date date2=new Date();
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
                SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                String strDate = dateFormat.format(date);  
                String strDate2 = formatter.format(date2); 
                System.out.println("Converted String: " + strDate);
                System.out.println("Converted String: " + strDate2);
    }
    
}
