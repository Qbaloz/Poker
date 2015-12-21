package handType;

import java.util.List;

public class StraightFlush {

	private boolean isStraigh = false;
	private boolean isFlush = false;
	private boolean isStraighFlush = false;
	private Straight straight = new Straight();
	private Flush flush = new Flush();

	public boolean isStraighFlush(List<Integer> cardsValues, List<String> cardsColors) {

		if (flush.isFlush(cardsColors) == true) {
			isFlush = true;
		}
		if (straight.isStraight(cardsValues) == true) {
			isStraigh = true;
		}

		if (isFlush && isStraigh) {
			isStraighFlush = true;
		}

		return isStraighFlush;
	}

}
