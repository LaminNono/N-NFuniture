package method;

import java.util.Random;

public class random_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Math.pow(2,3));
//		System.out.println(Math.pow(6,2));
//		System.out.println(Math.ceil(4.3));
//		System.out.println("Floor :"+Math.floor(4.6));
//		System.out.println("Rond :"+Math.rint(4.6));
		//int random=(int) (Math.random()*6);
		//System.out.println(random);
		Random r = new Random();
		int x=r.nextInt(10);
		System.out.println(x+1);

	}

}
