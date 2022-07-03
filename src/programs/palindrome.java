package programs;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="madamq";
String temp="";
		
		
		
		for(int i=s.length()-1;i>=0;i--) {
			
			
			temp =temp+s.charAt(i);
			
		}
		 
		if(temp.equals(s)) {
			
			
			System.out.println("palindrome");
		}
		else {
			
			
			System.out.println("not palindrome");
		}
	}

}
