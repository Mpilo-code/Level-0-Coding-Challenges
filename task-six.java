import java.util.ArrayList;

public class Program {
    
    public static void main(String args[]) {
        
      int a = 70;
      int b = 5553;
      int c = 1003;
      int e = 7841;
      
      int d = maxFunction(a, b, c, e);
      
      System.out.println("Maximum Value = " + d);
      
    }
   public static int maxFunction( int num1, int num2, int num3, int num4) {
       
        int max = 0;
        
        ArrayList<Integer> mArray = new ArrayList<Integer>(); 
        mArray.add(num1);
        mArray.add(num2);
        mArray.add(num3); 
        mArray.add(num4);
        
        for(int i = 0; i < mArray.size(); i++){
            
            if (i == 0) {
                
                max = mArray.get(i);
                
            } else if(mArray.get(i) > max) {
                
                max = mArray.get(i);
                
            }
            
        }

        return max; 
   }
}
