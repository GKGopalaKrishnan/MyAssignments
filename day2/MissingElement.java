package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] Arr = {1,2,3,4,7,6,8};
		Arrays.sort(Arr);
		
		for(int i = 1; i < Arr.length; i++ ) {
			if(i != Arr[i-1]) {
		  
				System.out.println(i);
				break;
			}
			
			}
		}
		
	}

 