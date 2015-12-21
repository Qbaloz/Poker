package handType;

import java.util.List;

public class Flush {

	private boolean isFlush = false;
	private CardsFrequency cards = new CardsFrequency();
	final static int NUMBER_OF_SAME_CARDS_TO_BE_FLUSH = 5; 

	public boolean isFlush(List<String> cardsColors) {
		
		isFlush = cards.frequeancyOfElementsInStringList(cardsColors, NUMBER_OF_SAME_CARDS_TO_BE_FLUSH);

		return isFlush;
	}

}
