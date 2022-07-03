package programs;

import java.util.ArrayList;



public class Array_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"ram","mohan","sohan"};
		
		ArrayList<String> ls = new ArrayList<String>();
		
		for(String s:arr) {
			
			
			ls.add(s);
		}
		
		System.out.println(ls);
		for(String p:ls) {
			
			System.out.println(p);
			
			
		}
		
	}

}
