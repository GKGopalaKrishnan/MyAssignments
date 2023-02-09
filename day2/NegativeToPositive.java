package week1.day2;

public class NegativeToPositive {

	public static void main(String[] args) {
		int n = -40;
		int i;
		if(n<0) {
			System.out.println(n + " is Negative Number");
			i=n*(-1);
			System.out.println("The Converted Positive Number is " + i);
			}
		else
		{
			System.out.println(n+"is Neutral Number");
		}

	}

}
