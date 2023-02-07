package week1.day1;

public class Mobile {
	
	public void makeCall() {
		
		String mobileModel = "Samsung";
		float mobileWeight = 18.5f;
		
		System.out.println("The Mobile model is : "+mobileModel);
		System.out.println("The Mobile weight is : "+mobileWeight);
	}
	
	public void sendMsg() {
		
		boolean isFullyCharged = true;
		int mobileCost = 30000;
		
		System.out.println("Is the Mobile fully charged : "+isFullyCharged);
		System.out.println("Cost of the Mobile is : "+mobileCost);
	}  
		
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is my mobile");
	 
	}

}
