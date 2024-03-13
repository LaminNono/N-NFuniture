package method;

import java.util.Scanner;

public class two_dimensional_array_sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[][]=new int[3][4];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter number");
				A[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(A[i][j]+"\t\t");
			}
			System.out.println();
		}
		

	}

}
