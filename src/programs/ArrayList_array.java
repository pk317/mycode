package programs;

import java.util.ArrayList;

public class ArrayList_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar =new ArrayList<>();
ar.add("gd");
ar.add("pk");
ar.add("cd");

System.out.println(ar);//op [gd, pk, cd]
String arr[]= new String[ar.size()];

for(int i=0;i<ar.size();i++) {
	
	arr[i]=ar.get(i);
	
	
}
System.out.println(arr);//op [Ljava.lang.String;@123a439b
for(String s:arr) {
	
	
	System.out.println(s); //op  gd
	//pk
	//cd
}
	}

}
