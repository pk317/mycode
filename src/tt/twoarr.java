package tt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class twoarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer first[]= {10,20,30,42,50,55,67};
		Integer second[]= {10,20,30,40,56,59,60};
		Integer third[]= {10,20,33,40,51,53,64};
		
		List<Integer> l1= Arrays.asList(first);
		List<Integer> l2= Arrays.asList(second);
		List<Integer> l3= Arrays.asList(third);
		
		
		Set<Integer> s= new HashSet<>();
		s.addAll(l1);
		s.addAll(l2);
		s.addAll(l3);
		
		for(Integer p:s) {
			
			if(l1.contains(p)&& l2.contains(p)||l2.contains(p)&& l3.contains(p)|| l1.contains(p) && l3.contains(p)) {
				
				System.out.println(p);
				
				
				
			}
			
		}
		
		


}}
