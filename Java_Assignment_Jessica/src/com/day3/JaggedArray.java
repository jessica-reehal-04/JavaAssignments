package com.day3;

public class JaggedArray
{
	public static void main(String[] args) {
		String[][] arr= {
				{"Tony","JAVA","C","C++"},
				{"Thomas","JAVA","UNIX"},
				{"Dinil","Linux","Oracle"},
				{"Delvin","RDMS","C#","Oracle"}
				};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
