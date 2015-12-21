package handType;

import java.util.List;

public class HighCard {

	private boolean isHighCard = false;
	private CardsFrequency cards = new CardsFrequency();
	final static int NUMBER_OF_NOT_SAME_CARDS = 1;
	final static int FIVE_DIFFERENT_CARDS = 5;

	public boolean isHighCard(List<Integer> cardsValues) {
		
		if(cards.numberOfDifferentTypesInList(cardsValues, NUMBER_OF_NOT_SAME_CARDS) == FIVE_DIFFERENT_CARDS){
			isHighCard = true;
		}

		return isHighCard;
	}

}
