package Speer;

import java.net.MalformedURLException;

import java.util.Scanner;
public class Number {


	    public static void main(String[] arg) throws MalformedURLException {
	  
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter an Integer: ");
	        int n = scanner.nextInt();
	        if (n >= 1 && n <= 20) {
	            System.out.println("" + n + " is a valid number");

	        } else {
	            System.out.println("Please Enter a Valid Integer between 1 and 20");
	        }

	    }
}

