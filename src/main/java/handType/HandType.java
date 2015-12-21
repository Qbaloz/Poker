package handType;

import java.util.ArrayList;
import java.util.List;

import inputHand.InputHand;

public class HandType {

	private InputHand hand = new InputHand();
	private HighCard highCard = new HighCard();
	private Pair pair = new Pair();
	private TwoPairs twoPairs = new TwoPairs();
	private ThreeOfAKind threeOfAKind = new ThreeOfAKind();
	private Straight straight = new Straight();
	private Flush flush = new Flush();
	private FullHouse fullHouse = new FullHouse();
	private FourOfAKind fourOfAKind = new FourOfAKind();
	private StraightFlush straightFlush = new StraightFlush();

	public List<Integer> cardsValues = new ArrayList<>();
	public List<String> cardsColors = new ArrayList<>();
	HandSequanceValue handSequanceValue;

	public HandSequanceValue checkHandType(List<String> cardsList) {

		cardsValues = hand.getCardsValuesList(cardsList);
		cardsColors = hand.getCardsColorsList(cardsList);

		if (straightFlush.isStraighFlush(cardsValues, cardsColors)) {
			handSequanceValue = HandSequanceValue.STRAIGHT_FLUSH;
		} else if (fourOfAKind.isFourOfAKind(cardsValues)) {
			handSequanceValue = HandSequanceValue.FOUR_OF_A_KIND;
		} else if (fullHouse.isFullHouse(cardsValues)) {
			handSequanceValue = HandSequanceValue.FULL_HOUSE;
		} else if (flush.isFlush(cardsColors)) {
			handSequanceValue = HandSequanceValue.FLUSH;
		} else if (straight.isStraight(cardsValues)) {
			handSequanceValue = HandSequanceValue.STRAIGHT;
		} else if (threeOfAKind.isThreeOfAKind(cardsValues)) {
			handSequanceValue = HandSequanceValue.THREE_OF_A_KIND;
		} else if (twoPairs.isTwoPairs(cardsValues)) {
			handSequanceValue = HandSequanceValue.TWO_PAIRS;
		} else if (pair.isPair(cardsValues)) {
			handSequanceValue = HandSequanceValue.ONE_PAIR;
		} else if (highCard.isHighCard(cardsValues)) {
			handSequanceValue = HandSequanceValue.HIGH_CARD;
		}
		return handSequanceValue;
	}

}
