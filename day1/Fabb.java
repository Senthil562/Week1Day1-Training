package week1.day1;

public class Fabb {

	public static void main(String[] args) {
	int x=0;
	int y=1;
	int z=8;
	
System.out.println(x);
for (int i=1;i<z;i++) {
	int j= x+y;
	System.out.println(j);
	x = y;
	y = j;
}
	}

}
