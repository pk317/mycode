package programs;

import java.util.HashMap;
import java.util.Map;

public class numer_count2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// just add the integr only in map
		
		String word="abc12dfr23fh3333gh345";  
		
		char ch[]=word.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c:ch) {
	
			if(c>='0' && c<='9') {
				
				if(map.containsKey(c)) {
					
					
					map.put(c, map.get(c)+1);
					
					
				}
				else {
					
					
					map.put(c,1);
				}
			}}
				for(Map.Entry<Character,Integer> m:map.entrySet()) {
					
					
					
					
					System.out.println(m.getKey()+":"+m.getValue());
					
					
			
					
				}
			}
			
		}
		
	



   /*  o/p1 :1
2 :2
3 :6
4 :1
5 :1 */
