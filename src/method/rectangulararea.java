package method;

import java.util.Scanner;

public class rectangulararea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter width :");
		int width = sc.nextInt();
		System.out.print("Enter height :");
		int height = sc.nextInt();
		area(height,width);
		area(20,50);
		//int result = weight * height;
		//System.out.println("The area of the rectangular :"+result+" square-unit");
		sc.close();
	}
	public static void area(int height,int width) {
		int result = height*width;
		System.out.println("The area of the rectangular :"+result+" square-unit");
	}

}
