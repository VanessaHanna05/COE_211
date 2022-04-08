package lab_8;
import java.util.Scanner;
import java.io.*;
public class Finances {
public static void main(String [] args) throws IOException{

		String option;
	
		Scanner scan =  new Scanner(System.in);	
		File newfile = new File("expenses.txt");
		Scanner scanFromFile = new Scanner(newfile);
		FileWriter file = new FileWriter(newfile, true);

		do {
	
			System.out.print("Input your name: ");
			String name  =  scan.next();
	
			System.out.print("What did you purchase? ");
			String item =  scan.next();
	
			System.out.print("How much did you purchase? (in USD) ");
			double payment = scan.nextDouble();
	
			String str  = name + " purchased "+ item + " for " + payment + " USD Dollars.";
			file.write(str+"\n");
	
			System.out.println("would you like to log another purchase? (y/n)");
			option = scan.next();
	
			}
		
			while(option.equalsIgnoreCase("y"));
		
			file.close();
		
		//Scanning from the file
		
			System.out.print("Would you like to read a summary of your purchases? ");
			String sum = scan.next();
			
	
			if(sum.equalsIgnoreCase("y")) {
			
			while(scanFromFile.hasNext()){
				
				String line =  scanFromFile.nextLine();
				System.out.println(line);
			}
			
			
		}
}	
}
