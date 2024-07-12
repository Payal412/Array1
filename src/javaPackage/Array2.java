package javaPackage;

public class Array2 {

	public static void main(String[] args) {

	       int b[] = {1,2,3,4,5};
	       
	       String s[] = {"Hi", "Hello"};
	       
	       Object a[] = {1,2,3,4, "Selenium", 6.5};
	       
	       System.out.println(a.length);
	       System.out.println(b.length);
	       System.out.println(s.length);
	       
	       System.out.println(a[4]);
	       System.out.println(b[4]);
	       System.out.println(s[1]);
	       
	       a[5] = "Automation";
	       System.out.println(a[5]);
		}
}
