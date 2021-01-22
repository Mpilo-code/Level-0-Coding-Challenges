public class Program {
    public static void main(String args[]) {
        
      double here = calculateArea(5, 3, 4);
      
    }
    
    public static double calculateArea (double a, double b, double c) {
        
        ArrayList<Double> mArray = new ArrayList<>();
        mArray.add(a);
        mArray.add(b);
        mArray.add(c);
        
        mArray.remove(Collections.max(mArray));
        
        double area = (double)(0.5) * ( mArray.get(0) * mArray.get(1));
        
        return area;
    }
    
}
