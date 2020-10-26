package card;

public class Card {

	private static int CardNum=10000;
	
	public int getCardNumber() {
		CardNum++;
		return CardNum;
	}
}
