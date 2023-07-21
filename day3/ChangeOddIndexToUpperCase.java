package week1.day3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";
		
		char[] charac=test.toCharArray();
		for(int i=0;i<test.length();i++) {
			
			if(i%2!=0) {
				
			charac[i]=Character.toUpperCase(charac[i]);
			System.out.println(charac[i]);
			
			}
			
			else {
				
				System.out.println(charac[i]);	
			}
		}
		
	}

}
