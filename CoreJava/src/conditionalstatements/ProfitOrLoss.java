package conditionalstatements;

public class ProfitOrLoss {
	public static void main(String[] args) {
		int actualprice=10;
		int sellingprice=10;
		int profitorloss=sellingprice-actualprice;
		if(profitorloss>0) {
			System.out.println( profitorloss+" its a loss");
		}
		else if (profitorloss<0) {
			System.out.println(profitorloss+" its a profit");
		}
		else {
			System.out.println("No loss no Gain");
		}
	}

}
