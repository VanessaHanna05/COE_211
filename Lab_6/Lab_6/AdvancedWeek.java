package Assignment;

public class AdvancedWeek {
	   private String day_1 = "Monday";
	    private int day_1_index = 1;
	    private String day_2 = "Tuesday";
	    private String day_3 ="Wednsday";
	    private String day_4 = "Thursday";
	    private String day_5 = "Friday";
	    private String day_6 = "Sturday";
	    private String day_7 = "Sunday";
	   
	   
	    
	    public void printDays() {
	    	
	    	
	        System.out.println( day_1_index +": "+ day_1+ "," + "\r\n" + (day_1_index+1) +": "+ day_2+ "," + "\r\n" +
	        		(day_1_index+2)+": "+ day_3+ "," + "\r\n" +(day_1_index+3) +": "+ day_4+ "," + "\r\n" +
	        		(day_1_index+4) +": "+ day_5+ "," + "\r\n" +(day_1_index+5) +": "+ day_6+ "," + "\r\n" +
	        		(day_1_index+6) +": "+ day_7+ "." + "\r\n" );
}
}