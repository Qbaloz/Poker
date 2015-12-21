package handsComparing;

import java.util.List;

import handType.HandSequanceValue;
import handType.HandType;
import handType.Straight;

public class HandsComparator {

	boolean playerOneWin = false;
	boolean playerTwoWin = false;
	private HandType player1 = new HandType();
	private HandType player2 = new HandType();
	private Straight straight = new Straight();
	HandSequanceValue player1Value;
	HandSequanceValue player2Value;

	public void compareHands(List<String> PlayerOne, List<String> PlayerTwo) {
		
		playerOneWin = false;
		playerTwoWin = false;
		
		player1Value = player1.checkHandType(PlayerOne);
		player2Value = player2.checkHandType(PlayerTwo);

		if (player1Value.asInt() > player2Value.asInt()) {
			playerOneWin = true;
		}

		if (player2Value.asInt() > player1Value.asInt()) {
			playerTwoWin = true;
		}

		if (player1Value.asInt() == player2Value.asInt()) {
			if(straight.isStraightFromAce == true){
				compareStraightFromAce();
			}else{
				compareSameTypeOfHand();
			}
		}

	}
	
	private void compareStraightFromAce(){
		for (int i = 5; i > 0; i--) {
			boolean isPlayerOneHandStronger = player1.cardsValues.get(i) > player2.cardsValues
					.get(i);
			boolean isPlayerTwoHandStronger = player2.cardsValues.get(i) > player1.cardsValues
					.get(i);
			if (isPlayerOneHandStronger) {
				playerOneWin = true;
				break;
			}

			if (isPlayerTwoHandStronger) {
				playerTwoWin = true;
				break;
			}
		}
	}

	private void compareSameTypeOfHand() {
		for (int i = 0; i < 5; i++) {
			boolean isPlayerOneHandStronger = player1.cardsValues.get(i) > player2.cardsValues
					.get(i);
			boolean isPlayerTwoHandStronger = player2.cardsValues.get(i) > player1.cardsValues
					.get(i);
			if (isPlayerOneHandStronger) {
				playerOneWin = true;
				break;
			}

			if (isPlayerTwoHandStronger) {
				playerTwoWin = true;
				break;
			}
		}
	}
}
