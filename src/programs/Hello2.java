package programs;

import java.util.ArrayList;

public class Hello2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="abc12cb34gh45";
		String temp="";
		int sum=0;
		ArrayList<Integer> al= new ArrayList<>();
		
		int flag=0;
		
		for(int i=0;i<s.length();i++) {
			
			if(Character.isDigit(s.charAt(i))) {
				flag=1;
				temp=temp+s.charAt(i);
				
				
				
			}
			
			else {
				
				flag=0;
			}
			if(i==s.length()-1 && temp!="") {
				flag=0;
				
			}
			
			if(flag==0 && temp!="") {
				al.add(Integer.parseInt(temp));
				temp="";
				
				
			}
			
			
		}
		for(int j=0;j<al.size();j++) {
			sum=sum+al.get(j);
			
		}
		System.out.println(sum);
	}
}