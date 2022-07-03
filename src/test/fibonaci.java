package test;

public class fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first=0,next=1;
		System.out.print(first+""+next);
		for(int i=2;i<10;i++) {
			
			
			int sum=first+next;
			first=next;
			next=sum;
			System.out.print(sum);
		}
		
		

	}

}
