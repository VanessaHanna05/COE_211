package lab_9;
import java.util.Scanner;
public class Grades {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int[] array = new int[5];
	int sum = 0;
	for(int i = 0; i <5; i++) {
		System.out.print("Input the grade of the assignment " + (i+1) +" ");
		int nbOfAssignment = scan.nextInt();
		array[i] = nbOfAssignment;
	}
	
	System.out.print("Input the number of attended labs ");
	int labs = scan.nextInt();
	
	System.out.print("Input the midterm grade ");
	int mid = scan.nextInt();
	
	for(int i = 0; i<5; i++)
	{
	sum = sum + array[i];
	
	}

	double gradesAverage = ((double)sum/5)*0.3;
	double attendance = (labs*100)*0.05;
	double midterm = 0.3*mid;
	
	System.out.println("Assignment (30%): " + (int)gradesAverage);
	System.out.println("Attendance (5%): " + (int) attendance);
	System.out.println("Midterm (30%): " + (int) midterm);
	
}
}
