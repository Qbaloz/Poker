package handType;

import java.util.List;

public class TwoPairs {

	private boolean isTwoPairs = false;
	private CardsFrequency cards = new CardsFrequency();
	final static int NUMBER_OF_SAME_CARDS_TO_BE_PAIR = 2;
	final static int TWO_PAIRS = 2;

	public boolean isTwoPairs(List<Integer> cardsValues) {

		if (cards.numberOfDifferentTypesInList(cardsValues, NUMBER_OF_SAME_CARDS_TO_BE_PAIR) == TWO_PAIRS) {
			isTwoPairs = true;
		}

		return isTwoPairs;
	}

}
