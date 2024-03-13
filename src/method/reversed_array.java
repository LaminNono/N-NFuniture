package method;

import java.util.Scanner;

public class reversed_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		System.out.println("Original array :");
		for (int i=0;i<a.length;i++) 
		{
			
			System.out.print(a[i]+" ");
			
		}
			
		System.out.println();
		System.out.println("Reversed array :");
		
		for (int i=a.length-1;i>=0;i--) 
		{
			System.out.print(a[i]+" ");
		}
		
		

	}

}
