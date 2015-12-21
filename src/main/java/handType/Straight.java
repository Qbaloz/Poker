package handType;

import java.util.List;

public class Straight {

	private boolean isStraigh = false;
	public boolean isStraightFromAce = false;
	private int nearbyCards = 0;
	final static int NUMBER_OF_NEARBY_CARDS_TO_BE_STRAIGHT = 4;
	final static int NUMBER_OF_NEARBY_CARDS_TO_BE_STRAIGHT_FROM_ACE = 4;

	public boolean isStraight(List<Integer> cardsValues) {

		isStraightFromAce = false;
		
		for (int i = 0; i < 4; i++) {
			int differenceBetweenNearbyCards = cardsValues.get(i) - cardsValues.get(i + 1);
			
			if (differenceBetweenNearbyCards == 1) {
				nearbyCards++;
			}
		}

		if (nearbyCards == NUMBER_OF_NEARBY_CARDS_TO_BE_STRAIGHT) {
			isStraigh = true;
		}
		
		for (int i = 1; i < 4; i++) {
			int differenceBetweenNearbyCards = cardsValues.get(i) - cardsValues.get(i + 1);
			if (differenceBetweenNearbyCards == 1) {
				nearbyCards++;
			}
		}
		
		boolean firstCardIsAce = cardsValues.get(0).equals(14);
		
		if (nearbyCards == NUMBER_OF_NEARBY_CARDS_TO_BE_STRAIGHT_FROM_ACE && firstCardIsAce) {
			isStraightFromAce = true;
		}
		
		return isStraigh;
	}

}
