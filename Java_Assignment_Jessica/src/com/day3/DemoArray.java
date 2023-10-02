package com.day3;

public class DemoArray 
{

	public static void main(String[] args)
	{
		int firstArray[][]= {{1,1,1},{1,1,1}};
		int secondArray[][]= {{2,2,2},{2,2,2}};
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(firstArray[i][j]+secondArray[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
