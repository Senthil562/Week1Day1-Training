package week1.day1;

public class Amstrong {

	public static void main(String[] args) {	
		int input=370;
		int calculated=0;
		int remainder;
		int original;
		
		original=input;
		
		while(original>0) {
			remainder=original%10;
			calculated += Math.pow(remainder, 3);
			original=original/10;
		}
	
if (calculated==input){
		System.out.println(input + "it is an armstrong number");
	}
	else
	{
		System.out.println(input + "it is not an armstrong number");
	}
}
}
