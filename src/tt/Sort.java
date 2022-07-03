package tt;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,1,2,53,43,2}; //,i=0 ,1,10,2,53,43,2 
									//,i=1 ,1,2,10,53,43,2
									//,i=2 ,1,2,10,53,43,2
									//,i=3 ,1,2,10,43,53,2
									//,i=4 ,1,2,10,43,2,53
		
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
						
				
			}
			
			
				
				
			}
			
	
			
		}
		for(int k=0;k<a.length;k++) {
			
			System.out.println(a[k]);
			
		}
		
	}

}
