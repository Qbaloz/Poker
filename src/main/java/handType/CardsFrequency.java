package handType;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CardsFrequency {

	public boolean frequeancyOfElementsInStringList(List<String> cardsColors, int frequencyOfSameElement) {
		boolean status = false;
		Set<String> unique = new HashSet<String>(cardsColors);
		for (String key : unique) {

			if (Collections.frequency(cardsColors, key) == frequencyOfSameElement) {
				status = true;
			}

		}
		return status;
	}

	public boolean frequeancyOfElementsInIntegerList(List<Integer> cardsValues, int frequencyOfSameElement) {
		boolean status = false;
		Set<Integer> unique = new HashSet<Integer>(cardsValues);
		for (Integer key : unique) {

			if (Collections.frequency(cardsValues, key) == frequencyOfSameElement) {
				status = true;
			}

		}
		return status;
	}
	
	public int numberOfDifferentTypesInList(List<Integer> cardsValues, int frequencyOfSameElement) {
		int numberOfDifferentTypes = 0;
		Set<Integer> unique = new HashSet<Integer>(cardsValues);
		for (Integer key : unique) {

			if (Collections.frequency(cardsValues, key) == frequencyOfSameElement) {
				numberOfDifferentTypes++;
			}

		}
		return numberOfDifferentTypes;
	}

}
