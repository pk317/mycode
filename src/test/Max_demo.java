package test;

public class Max_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,12,39,13,45,91};
		

		
		int first =Integer.MIN_VALUE;
				int second = Integer.MIN_VALUE; 
        for (int i = 0; i < arr.length ; i++) 
        { 
            /* If current element is smaller than  
            first then update both first and second */
            if (arr[i] > first) 
            { 
                second = first; 39
                first = arr[i]; 45
            } 
       
            /* If arr[i] is in between first and  
               second then update second  */
            else if (arr[i] > second && arr[i] != first) 
                second = arr[i]; 
        } 

		System.out.println(second);
	}

}
