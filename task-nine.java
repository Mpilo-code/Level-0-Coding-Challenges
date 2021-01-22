import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getVowls("Out");
		
	}
	
	public static void getVowls(String str) {
		
		ArrayList<String> vowls = new ArrayList<String>();
		vowls.add("a");
		vowls.add("e");
		vowls.add("i");
		vowls.add("o");
		vowls.add("u");
		
		char[] inputStrinChars = str.toCharArray();
		
		for(char c:inputStrinChars) {
			String strChar = Character.toString(c).toLowerCase();
			if(vowls.contains(strChar)) {
				System.out.println(strChar);
			}
		}
		
	}

}
