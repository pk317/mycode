package programs;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		int sum=0;
		StringBuilder st=new StringBuilder("");
		String s="abc12cb34gh45";
		for(int i=0;i<s.length();i++) {
			
			if(Character.getNumericValue(s.charAt(i))>=0 && Character.getNumericValue(s.charAt(i))<=9) {
				sum=sum+ Character.getNumericValue(s.charAt(i));
				
				
				//st.append(s.charAt(i));
				//System.out.println(s.charAt(i));
				
			}
			
		
		}
		
		System.out.println(sum);
	}

}
