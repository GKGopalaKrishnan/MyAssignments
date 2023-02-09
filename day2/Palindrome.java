package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
	int n = 34343;
	int r, sum, temp;
	temp=n;
	
	for(sum = 0; n>0; n/=10) {
		r = n%10;
		sum =(sum * 10)+r;
	}
	
	if(temp == sum) {
		System.out.println("The Given Number is a Palindrome");
	} 
	else {
		System.out.println("The Given Number is not a Palindrome");
    }
  }
}

