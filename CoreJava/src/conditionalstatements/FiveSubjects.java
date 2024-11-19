package conditionalstatements;

public class FiveSubjects {
	public static void main(String[] args) {
		int sub1=10;
		int sub2=20;
		int sub3=20;
		int sub4=10;
		int sub5=10;
		int percentage=0;
		int total=0;
	
		total=sub1+sub2+sub3+sub4+sub5;
	    percentage= total;
	  
	  if(percentage>=90) {
		  System.out.println("Grade A");
	  }
	  else if(percentage>=80) {
		  System.out.println("Grade B");
	  }
	  else if(percentage>=70) {
		  System.out.println("Grade C");
	  }else if(percentage>=60) {
		  System.out.println("Grade D");
	  }
	  else if(percentage>=40) {
		  System.out.println("Grade E");}
	  else{
		  System.out.println("Grade F");
	  }
	}
	
}
