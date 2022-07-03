package programs;

import java.util.Arrays;

public class Anargam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="tomoy";
		String s1 ="yotom";
		char ar1[]=s.toCharArray();
		char ar2[]=s1.toCharArray();
		
	boolean flag=false;
		
		
		if(s1.length()!=s.length()) {
			
			flag=false;
			
		}
		
		else {
		
			Arrays.sort(ar1);
			Arrays.sort(ar2);
			
	
			
			for(int i=0;i<ar1.length;i++) {
				
				if(ar1[i]!=ar2[i]) {
					
					
					flag=false;
					
					break;
					
					
				}
				
				else {
					
					flag=true;
					
				}
			}
			
			
			
			
		}
		
		if(flag) {
			
			System.out.println("anargam");
			
		}
		else {
			System.out.println(flag);
			
			System.out.println("not anargam");
			
		}
		
	}

}
