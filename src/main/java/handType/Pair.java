package handType;

import java.util.List;

public class Pair {

	private boolean isPair = false;
	private CardsFrequency cards = new CardsFrequency();
	final static int NUMBER_OF_SAME_CARDS_TO_BE_PAIR = 2;
	final static int ONE_PAIR = 1;

	public boolean isPair(List<Integer> cardsValues) {
		
		if(cards.numberOfDifferentTypesInList(cardsValues, NUMBER_OF_SAME_CARDS_TO_BE_PAIR) == ONE_PAIR){
			isPair = true;
		}

		return isPair;
	}

}
