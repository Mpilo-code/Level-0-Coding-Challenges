import java.util.*;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> commonChars = CommonCharacters("house" , "computers");
		System.out.println(commonChars);
		
	}
	
	public static ArrayList<String> CommonCharacters(String str1 , String str2) {
		
	    ArrayList<String> commonChars = new ArrayList<String>(); 
		
		for(int i = 0 ; i < str1.length() ; i++) {
			for(int k = 0 ; k < str2.length() ; k++) {
				
				if(Character.toString(str1.charAt(i)).equalsIgnoreCase(Character.toString(str2.charAt(k)))) {
				    commonChars.add(Character.toString(str1.charAt(i)));
				
				}
				
			}
		}
		
		
		
	    return commonChars;
		
	}

}   
