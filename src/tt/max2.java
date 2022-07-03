package tt;

public class max2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,10,5,40,30};
		int first=a[0];
		int second=a[0];
		
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>first) {
				
				second=first;
				first=a[i];
				
				
			}
			else if(a[i]>second && a[i]!=first) {
				
				second=a[i];
				
			}
			
			
			
		}

		System.out.println(first+":"+second);
		
		
	}

}
