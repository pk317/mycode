package test;

import java.util.HashMap;
import java.util.Map;

public class manindemo {

	static  public void main(String[] args) {
		// TODO Auto-generated method stub

		String word ="abcdab";

		char c[] = word.toCharArray();


		Map<Character,Integer> m= new HashMap<>();


		for(char ch:c){


		if(m.containsKey(ch)){



		m.put(ch,m.get(ch)+1);


		}
		

			else {


			m.put(ch,1);

			}


			for(Map.Entry<Character,Integer> ms:m.entrySet()){

			if(ms.getValue()>1){


			System.out.println(ms.getKey());
		
		}
	}}
		
	}}



