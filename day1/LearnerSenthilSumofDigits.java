package week1.day1;

public class LearnerSenthilSumofDigits {

	public static void main(String[] args) {
		int x = 345;
		int y = 0;
		int z ;
		while (x > 0){
			z =  x % 10;
			System.out.println(z);
			y = y + z;
			x = x / 10;
			
		}
		System.out.println("SUM of Value is"  + y);		

	}
}
