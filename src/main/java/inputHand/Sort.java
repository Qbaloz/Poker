package inputHand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sort {

	public List<Integer> sortCardsValuesList(List<Integer> valuesList){
		
	    Map<Integer, Card> sameCards = new HashMap<>();
	    for(int i: valuesList){
	      Card card = sameCards.get(i);
	      if(card == null){
	        card = new Card(i);
	      }
	      card.count++;
	       sameCards.put(i,card);
	    }
	    List<Card> sameCardsList = new ArrayList<>(sameCards.values());
	    Collections.sort(sameCardsList);

	    List<Integer> sortedList = new ArrayList<>() ;
	    for(Card item: sameCardsList){
	       for(int i=0;i<item.count;i++){
	         sortedList.add(item.value);
	       }
	    }
	    return sortedList;
	}
	
	static class Card implements Comparable<Card>{
	    int value;
	    int count;
	    public Card(int cardValue) {
	      value=cardValue;
	    }
	    public int compareTo(Card number){
	      return (this.count == number.count) ? number.value - this.value : number.count-this.count;
	    }
	}	
}
