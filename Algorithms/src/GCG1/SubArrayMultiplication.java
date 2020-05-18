package GCG1;

public class SubArrayMultiplication {
	
	public static void SubArray_Multiply(int[] arr, int n)
	{
		int result=1;
		/*
		for(int i=0;i<n;i++)
		{
		for(int j=i;j<n;j++)
			{
			for(int k=i;k<=j;k++)
			result *=arr[k];;
			}
		}*/
		System.out.println(result +" \n");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,3,7};
		int n=arr.length;
		
		SubArray_Multiply(arr, n);
		

	}

}
