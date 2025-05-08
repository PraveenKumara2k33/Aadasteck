package presentation1;

import java.util.Scanner;

public class SumofdigitsEven_8 {

	public static void main(String[] args) {
		
		int d;
    	int sum=0;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your number:");
    	int n=sc.nextInt();
    	while(n>0) {
    		d=n%10;
    		if(d%2==0) {
    			sum=sum+d;
    		}
    		n/=10;
    	}
    	System.out.println("sumofdigits:"+sum);
    	sc.close();
	}

}
