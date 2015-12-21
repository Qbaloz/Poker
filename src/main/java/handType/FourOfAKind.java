package handType;

import java.util.List;

public class FourOfAKind {

	private boolean isFourOfAKind = false;
	private CardsFrequency cards = new CardsFrequency();
	final static int NUMBER_OF_SAME_CARDS_TO_BE_FOUR_OF_A_KIND = 4;

	public boolean isFourOfAKind(List<Integer> cardsValues) {

		isFourOfAKind = cards.frequeancyOfElementsInIntegerList(cardsValues, NUMBER_OF_SAME_CARDS_TO_BE_FOUR_OF_A_KIND);

		return isFourOfAKind;
	}
}
