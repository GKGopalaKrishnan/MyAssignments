package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 8;
		int sum , firstnum = 0, secondnum = 1;
		for(int i = 1; i < n; i++) {
			 sum = firstnum + secondnum;
			 firstnum = secondnum;
			 secondnum = sum;
			 System.out.println(sum);
		}
	}
}
		

