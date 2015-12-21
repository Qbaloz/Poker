package handType;

import java.util.List;

public class FullHouse {

	private Pair pair = new Pair();
	private ThreeOfAKind threeOfAKind = new ThreeOfAKind();
	private boolean isFullHouse = false;
	private boolean containOnePair = false;
	private boolean containThreeOfAKind = false;

	public boolean isFullHouse(List<Integer> cardsValues) {
		
		containOnePair = pair.isPair(cardsValues);
		containThreeOfAKind = threeOfAKind.isThreeOfAKind(cardsValues);
		
		if (containOnePair && containThreeOfAKind) {
			isFullHouse = true;
		}

		return isFullHouse;
	}

}
