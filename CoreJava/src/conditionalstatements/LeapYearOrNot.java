package conditionalstatements;

public class LeapYearOrNot {
 public static void main(String[] args) {
	 int year=2053;
	 if(year %4==0) {
		 System.out.println(year+" : given year is a leap year");
	 }
	 else {
		 System.out.println(year+": given year is  not a leep year");
	 }
 }
}
