package inputHand;

import java.util.ArrayList;
import java.util.List;

import handType.CardValues;

public class InputHand {

	private Sort sort = new Sort();
	private List<String> cardsValues = new ArrayList<>();
	private List<String> cardsColors = new ArrayList<>();
	private List<Integer> unsortedCardsValues = new ArrayList<>();
	private List<Integer> sortedCardsValues = new ArrayList<>();
	
	public List<Integer> getCardsValuesList(List<String> CardsList){
		
		for(int i = 0; i < CardsList.size(); i++){
			cardsValues.add(CardsList.get(i).substring(0, 1));
			convertEveryCardToValue();
		}
		
		convertStringListToIntegersList();

		sortedCardsValues = sort.sortCardsValuesList(unsortedCardsValues);
		
		return sortedCardsValues;
	}

	private void convertStringListToIntegersList() {
		for(String s : cardsValues) unsortedCardsValues.add(Integer.valueOf(s));
	}

	public List<String> getCardsColorsList(List<String> CardsList){
		
		for(int i = 0; i < CardsList.size(); i++){
			cardsColors.add(CardsList.get(i).substring(1, 2));
		}
		
		return cardsColors;
	}

	private void convertEveryCardToValue() {
		if(cardsValues.contains("T")){
			cardsValues.set(cardsValues.indexOf("T"), CardValues.T.asString());
		}
		
		if(cardsValues.contains("J")){
			cardsValues.set(cardsValues.indexOf("J"), CardValues.J.asString());
		}
		
		if(cardsValues.contains("Q")){
			cardsValues.set(cardsValues.indexOf("Q"), CardValues.Q.asString());
		}
		
		if(cardsValues.contains("K")){
			cardsValues.set(cardsValues.indexOf("K"), CardValues.K.asString());
		}
		
		if(cardsValues.contains("A")){
			cardsValues.set(cardsValues.indexOf("A"), CardValues.A.asString());
		}
	}
	
}
