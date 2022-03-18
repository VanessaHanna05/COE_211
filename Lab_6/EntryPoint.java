package Lab_6;

	import java.util.Scanner;
	public class EntryPoint {
	public static void main(String[] args) {

		int doit;
		Scanner scan =  new Scanner(System.in);
		int n;
		do {
		/*while (true) {*/
		System.out.print("Which service would you like to use?\r\n"
				+ "[1]: Basic week visualizer\r\n"
				+ "[2]: Advanced week visualizer\r\n"
				+ "[3]: Basic calculator\r\n"
				+ "[4]: Employee repertoire\r\n"
				+ "");
		int service =  scan.nextInt();
		
		while (service!=1 && service!=2 && service!= 3 && service !=4) {
			System.out.println("Please make sure you pick a number between 1 and 4");
			service = scan.nextInt();
			
		}
		
		switch (service) {
		case 1: 
			BasicWeek S =  new BasicWeek();
		S.printDays();
			break;
		
		
		case 2:
			AdvancedWeek S1 = new AdvancedWeek();
		S1.printDays();	
		break;
		
		case 3:
			Calculator Calc = new Calculator();
		break;
		
		
		
		case 4:
			Employee Emp = new Employee();
		System.out.println(Emp.formation());	;
			break;
	}
		
	System.out.println("Would you like to perform another operation? (0/1)");
		 doit  = scan.nextInt();
		}
		
		while(doit ==0);
		
		/*if( n == 0) {
			break;*/
		
		
		
		}}

