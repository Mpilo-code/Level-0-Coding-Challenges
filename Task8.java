import java.util.*;

public class Task8 {
    public static void main(String args[]) {
        
      createTimeString(71);
      
    }
    
    public static void createTimeString (double num) {
        
        int hours = 0;
        int minutes = 0;
        String finalTime = "";
        
        double convertTime = num / 60.0;
        
        hours = (int) convertTime; //got the hour by simply just type casting, this operation removes the decimal part of the value
        
        minutes = (int) ( (convertTime - hours) * 60 ); //after subtracting hours from the value I am left with minutes in decimal form and multipling by 60 gives me the minutes equivalent
        
        if( hours > 1) {
            
            finalTime = hours + " hours, ";
            
        } else {
            finalTime = hours + " hour, ";
             
        }
        
        if (minutes > 1) {
            
            finalTime = finalTime + minutes + " minutes";
            
        } else {
            
            finalTime = finalTime + minutes + " minute";
            
        }
        
        System.out.println(finalTime);
        
    }
    
}
