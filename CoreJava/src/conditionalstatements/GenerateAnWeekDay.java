package conditionalstatements;

public class GenerateAnWeekDay {
   public static void main(String[] args) {
	   int num=12;
	   if(num>8) {
		   System.out.println("the given number is invalide");
	   }
	   else if(num==1) {
		   System.out.println("Monday");
	   }
	   else if(num==2){
		   System.out.println("Tuesday");
	   } 
	   else if(num==3) {
		   System.out.println("Wensday");
	   } 
	   else if(num==4) {
		   System.out.println("Thursday");
	   }
	   else if(num==5) {
		   System.out.println("Friday");
	   } 
	   else if(num==6) {
		   System.out.println("Saturday");
	   } 
	   else if(num==7) {
		   System.out.println("Sunday");
	   }
   }
}
