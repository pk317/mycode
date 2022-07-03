package tt;

import java.util.HashSet;
import java.util.Set;

public class Delete_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,10,30,40,50,40,30,60,70,80,88};
		
		
		
		Set<Integer> s= new HashSet<>();
		
		for(int c:a) {
			
			
			s.add(c);
			
		}
		
		
		
		
		
		int g[]= new int[s.size()];
		int k=0;
		
for(Integer d:s) {
			
		g[k++]=d;	
			
		
		}
		for(int l:g) {
			
			System.out.println(l);
			
		}
	}

}
