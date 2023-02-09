package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 13;
		boolean flag = false;
		for(int i = 2; i <= n/2; i++) {
			if(n%i == 0) {
				flag = true;
				break;
			}
		}
		if(flag != true) {
			System.out.println("The Given Number is a Prime Number");
			
		}
		else {
			System.out.println("The Given Number is not a Prime Number");

	   }
	}
}
