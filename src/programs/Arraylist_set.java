package programs;

import java.util.ArrayList;
import java.util.HashSet;

public class Arraylist_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> arr= new ArrayList<>();
arr.add("tom");
arr.add("mohan");
arr.add("sohan");
arr.add("tom");


HashSet<String> hs= new HashSet<>();
for(int i=0;i<arr.size();i++) {
	
	hs.add(arr.get(i));
	
	
	
}

for(String sp: hs) {
	
	System.out.println(sp);//op sohan
	//tom
	//mohan
	
}
	}

}
