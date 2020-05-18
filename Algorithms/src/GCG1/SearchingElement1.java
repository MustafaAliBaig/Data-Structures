package GCG1;


public class SearchingElement1 {
	
	public static int search(int x, int[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x)
				return i;
		}
			return -1;

}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50,90,160};
		int x=50;
		int result=search(x, arr);
		if(result==-1)
			System.out.println("The Number doesnt found");
		else
			System.out.println("The index of the found number is "+result);

	}
	
	
}
