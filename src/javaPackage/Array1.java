package javaPackage;

public class Array1 {

   public static void main(String[] args) {
		
		int a[] = new int[5];
		
		System.out.println(a.length);
		
		a[0] = 65;
		a[1] = 99;
		a[2] = 5;
		a[3] = 10;
		a[4] = 6;
		
		System.out.println(a[2]);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
    }
}
