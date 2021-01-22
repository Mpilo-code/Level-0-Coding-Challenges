import java.util.*;

public class Program {
    public static void main(String args[]) {
        
      double tempInFah = metricToImperialTemp(25);
      

      double tempInDeg = imperialToMetricTemp(77);
      
    }
    
    public static double metricToImperialTemp (double temp) {
        
        double convertedTemp = (temp * 1.8 ) + (32);
        
        System.out.println("C to F: " + convertedTemp);
        
        return convertedTemp;
    }
    
     public static double imperialToMetricTemp (double temp) {
        
        double convertedTemp = (double)(temp - 32 ) * (double)( 5.0 / 9.0);
        
        System.out.println("F to C: " + convertedTemp);
        
        return convertedTemp;
    }
    
}
