package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class test {
public static void main(String args[]) {
	
	//System.out.println("hello");
	String word="12456#!a#e33aeiouut345.uUuio";
	int flag=0;
	String temp="";
	//ArrayList<String> ar = new ArrayList<>();
	
	String[] arr= new String[word.length()];
	
	for(int i=0;i<=word.length()-1;i++) {
		
		if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'||word.charAt(i)=='A'||word.charAt(i)=='E'||word.charAt(i)=='I'||word.charAt(i)=='O'||word.charAt(i)=='U') {
			
			flag=1;
			
			temp= temp+word.charAt(i);
			
			
		}
		
		else {
			
			flag=0;
		}
		
		if(i==word.length()-1 && temp!="") {
			
			flag=0;
			
		}
		
		if(flag==0 && temp!="") {
			
			arr[i]=temp;
			//ar.add(temp);
			
			temp="";
		}
		
		
		
		/*
		 * for(int j=0;j<ar.size();j++) {
		 * 
		 * 
		 * System.out.println(ar.get(j));
		 * 
		 * }
		 */
	}
	
	for(int j=0;j<arr.length;j++) {
		
		if(arr[j]!=null) {
			
			System.out.println(arr[j]);
			
		}
		
	}
	
	/*
	 * Iterator it =ar.iterator();
	 * 
	 * while(it.hasNext()) {
	 * 
	 * 
	 * System.out.println(it.next().toString()); }
	 */
}
}
