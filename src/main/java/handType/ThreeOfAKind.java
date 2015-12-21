package handType;

import java.util.List;

public class ThreeOfAKind {

	private boolean isThreeOfAKind = false;
	private CardsFrequency cards = new CardsFrequency();
	final static int NUMBER_OF_SAME_CARDS_TO_BE_THREE_OF_A_KIND = 3;

	public boolean isThreeOfAKind(List<Integer> cardsValues) {

		isThreeOfAKind = cards.frequeancyOfElementsInIntegerList(cardsValues,
				NUMBER_OF_SAME_CARDS_TO_BE_THREE_OF_A_KIND);

		return isThreeOfAKind;
	}

}
