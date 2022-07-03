package programs;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name ="My name is praveen";
		
		//output Neevarp Si Eman yM
		String word[] =name.split(" ");
		System.out.println(word.length);
		for(int i=word.length-1;i>=0;i--) {
			
			for(int j=word[i].length()-1;j>=0;j--) {
				
				//if(j==word[i].length()-1) { //Neevarp Si Eman YM 
					if(j==0) { //neevarP sI emaN yM 
				System.out.print(Character.toUpperCase(word[i].charAt(j)));
		
				
				}
				
				else {
					System.out.print(Character.toLowerCase(word[i].charAt(j)));
					
				}
			}
			System.out.print(" ");
		}
		
		
	}

}
