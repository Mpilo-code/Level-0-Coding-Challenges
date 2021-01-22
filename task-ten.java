public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CommonCharacters("Out" , "Out");
		
	}
	
	public static void CommonCharacters(String str1 , String str2) {
		
		
		for(int i = 0 ; i < str1.length() ; i++) {
			for(int k = 0 ; k < str2.length() ; k++) {
				
				if(Character.toString(str1.charAt(i)).equalsIgnoreCase(Character.toString(str2.charAt(k)))) {
					System.out.println(Character.toString(str1.charAt(i)));
				}
				
			}
		}
		
	}

}
