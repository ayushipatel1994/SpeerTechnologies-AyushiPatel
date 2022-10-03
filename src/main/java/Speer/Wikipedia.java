package Speer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wikipedia {
	
	 public static void main(String[] arg) throws IOException {
		 	
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a Wikipedia link : " );
	        String url = scanner.nextLine();
	        HashSet<String> list = new HashSet<>();
	        
	        
	        FileWriter csv = new FileWriter("Results.csv");
	        

	        // Pattern for email validation with constraints
	        String pat = "https://en.wikipedia.org/wiki/.*";        // [A-Za-z0-9] can be used instead of * here. But I used * because we just need a valid wikipedia url despise of the content in that web page

	        Pattern p = Pattern.compile(pat);  // Pattern Object

	        do{
	            Matcher m = p.matcher(url);
	            if(m.matches()){
	                list.add(url);
	                System.out.println("Valid url");
	                System.out.println("List of Valid URLs : "+list);
	                System.out.println("Total count : "+list.size());
	                csv.write(url);
	                csv.write(System.lineSeparator());
	                csv.write("Total Unique  Valid URLs: "+list.size());
	            }else{
	                System.out.println("not matched");
	                System.out.println("list : "+list);
	                System.out.println("Total count : "+list.size());
	                throw new MalformedURLException();
	            }
	           
	            System.out.println("Please enter \"Stop\" to exit the execution" );
	            System.out.println("Enter a Wikipedia link : " );
	            url = scanner.nextLine();
	        }while(!url.equalsIgnoreCase("stop"));
	        scanner.close();
	        csv.close();
	        System.exit(0);
	        
	 }

}
