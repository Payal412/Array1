package javaPackage;

public class Array3 {

    public static void main(String[] args) {
		
		int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int row = a.length;
		System.out.println("Total Rows: " +row);
		
		int columns = a[0].length;
		System.out.println("Total columns: " +columns);
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<columns; j++)
			{
				System.out.println(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
