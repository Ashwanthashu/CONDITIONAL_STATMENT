package conditionalstatements;

public class GreatestAmoungThreeNumbers {
	public static void main(String[] args) {
		int n1=10;
		int n2=70;
		int n3=30;
		if(n1>n2 && n1>n3) {
			System.out.println(n1+" a Is greater");
		}
		else if(n2>n1 && n2>n3) {
			System.out.println(n2+" b Is greater");
		}
		else {
			System.out.println(n3+" c Is greater");
		}
	}

}
