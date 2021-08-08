package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int x = 15;
		boolean f = false;
		int y = x/2;
		int z;
        for (int i=2;i<y;i++) {
        	z = x % i;
        	if(z==0) {
        		f=true;
        	}
        if(f==false) {
        	System.out.println("This is an prime Number");
        }
        else {
        	System.out.println("This is not Prime number");
        }
        }
	}

}
