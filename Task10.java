import java.util.*;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	commonChar("house" , "computers");
	
	}
	
	 public static void commonChar(String str1, String str2) {
		
	 String Output;
        String common = "";
		
		for(int i = 0 ; i < str1.length() ; i++) {
			for(int k = 0 ; k < str2.length() ; k++) {
				
				if(Character.toString(str1.charAt(i)).equalsIgnoreCase(Character.toString(str2.charAt(k)))) {
				    
                    Output = Character.toString(str1.charAt(i));


                    common += Output + ",";
				
				}
				
			}
		}
		
	common = common.substring(0,common.length()-1);
	System.out.print("Common letters: " + common);
        
	}

} 
