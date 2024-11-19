package conditionalstatements;

public class DrivingCompany {
	public static void main(String[] args) {
		int age=29;
			System.out.println("Enetr the age");
         String gender="x";
            System.out.println("Enetr the gender");
            System.out.println("x for men & y for women");
          String status="m";
            System.out.println("Enter the marriage status");
            System.out.println("m for married & u for unmarried");
          if(status='m' || status=='u' && gender=='x' && age>30 || status=='u' && gender=='y' && age>25) {
        	  System.out.println("insure");
        	  else {
        		 System.out.println("uninsure");
        	  }
        	    
          }
}}
