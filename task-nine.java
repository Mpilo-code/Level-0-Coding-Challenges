  
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getVowels("Lionel Messi");
		
	}
	
	public static void getVowels(String str) {
		
		ArrayList<String> vowels = new ArrayList<String>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		
		char[] inputStrinChars = str.toCharArray();
		
		for(char c:inputStrinChars) {
			String strChar = Character.toString(c).toLowerCase();
			if(vowels.contains(strChar)) {
				System.out.println(strChar);
			}
		}
		
	}

}
