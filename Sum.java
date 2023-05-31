package day2;

import java.util.Scanner;
import java.util.Arrays;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of matrix:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum1=0;
		int sum2=0;
		int arr[][]=new int[n][m];
		int arr1[][]=new int[n][m];
		int res[][]=new int[n][m];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
    	{
    		System.out.println("enter the value for index["+i+"]["+j+"]");
    		arr[i][j]=sc.nextInt();
    	}
        }
    
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=0;j<arr[i].length;j++)
    	{
    		System.out.print(arr[i][j] +" ");
    		
    	}
	
	System.out.println();
}
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
	{
			if(i==j)
			{
			sum1=sum1+arr[i][j];
			}
			else
			{
				sum2=sum2+arr[i][j];
			}

		/*System.out.println("enter the value for index["+i+"]["+j+"]");
		arr1[i][j]=sc.nextInt();*/
	}
    }
	System.out.println("the sum is " +sum1 +","+sum2);

/*for(int i=0;i<arr1.length;i++)
{
	for(int j=0;j<arr1[i].length;j++)
	{
		System.out.print(arr1[i][j] +" ");
   	}
	System.out.println();
}
System.out.println("addition of matrix:");

for(int i=0;i<res.length;i++)
{
	int sum1=0;
	int sum2=0;
	for(int j=0;j<res[i].length;j++)
	{
		if(i==j)
		{
		sum1=sum1+arr[i][j];
		}
		else
		{
			sum2=sum2+arr[i][j];
		}
		res[i][j]=arr[i][j]+arr1[i][j];
		System.out.print(res[i][j] +" ");
	}
	System.out.println();
}*/

    
		



	}

}
