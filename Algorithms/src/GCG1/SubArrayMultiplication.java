package GCG1;

public class SubArrayMultiplication {
	
	
	
	//This program has to be revisited as result is not as expected
	public static void SubArray_Multiply(int[] arr, int n)
	{
		int result=1;

		for(int i=0;i<n;i++)
		{
		int product=1;
		for(int j=i;j<n;j++)
			{
			product=product*arr[j];
			result *=product;
			}
		}
		System.out.println(result +" \n");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,3,7};
		int n=arr.length;
		SubArray_Multiply(arr, n);
		

	}

}
