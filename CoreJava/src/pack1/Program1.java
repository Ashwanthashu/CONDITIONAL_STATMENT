package pack1;

public class Program1 {
	public static void main(String[] args)
	{
		int age=27;
		if(age<18)
		{
			System.out.println("not eligible for mrage");
		}
		else if(age>=18 && age<=24)
		{
			System.out.println("college student");
		}
		else if(age>=25 && age<=32)
		{
			System.out.println("eligible");
		}
		else if(age>=33 && age<=45)
		{
			System.out.println("can try for mrage");
		}
		else 
		{
			System.out.println("not allowed");
		}
		
		
	}

}
 