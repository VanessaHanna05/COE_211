package Assignment;
import java.util.Scanner;
public class Calculator {
	private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
       System.out.println("Input the first number: ");
       num1 =  scanCalc.nextInt();
       System.out.println("Input the operator: ");
       operator =  scanCalc.next();
      System.out.println("Input the second number: ");
      num2 =  scanCalc.nextInt();
       
    
     
    
  switch(operator) {
  case "+" :
	 
    	System.out.println(num1+ operator+ num2 +"=" +(num2+num1));
    break;
    	
  case "-":
    	System.out.println(num2 + operator + num2 + "= "+ (num1 - num2));
   break;
  case "*":
    	System.out.println(num2 + operator + num2 + "=" + (num1*num2));
    	break;
    
  case "/":
    	System.out.println(num2 + operator + num2 + "=" + ((double)num1/num2));
    	break;
    }
    
    
    }
  
  

}
