package handsComparing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HandsComparatorTest {

	private HandsComparator handsComparator;
	private List<String> playerOne = new ArrayList<>();
	private List<String> playerTwo = new ArrayList<>();

	@Before
	public void initialize() {
		handsComparator = new HandsComparator();
	}

	private void makeHandListForEachPlayer(List<String> cardsList) {
		playerOne.clear();
		playerTwo.clear();
		for (int i = 0; i < 5; i++) {
			playerOne.add(cardsList.get(i));
			playerTwo.add(cardsList.get(i+5));
		}
	}
	
	@Test
	public void shouldHandleThreeOfAKindVsPair() {
		// given
		List<String> CardsList = Arrays.asList("5H", "5C", "5S", "8S", "9D", "2C", "3S", "8S", "8D", "TD");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerOneWin);
	}
	
	@Test
	public void shouldHandleFourOfAKindVsPair() {
		// given
		List<String> CardsList = Arrays.asList("5H", "5C", "6S", "8S", "9D", "2C", "2S", "2S", "2D", "TD");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerTwoWin);
	}
	
	@Test
	public void shouldHandleFourOfAKindVsHighCard() {
		// given
		List<String> CardsList = Arrays.asList("5H", "6C", "7S", "8S", "TD", "2C", "2S", "2S", "2D", "TD");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerTwoWin);
	}
	
	@Test
	public void shouldHandleStraightVsThreeOfAKind() {
		// given
		List<String> CardsList = Arrays.asList("5H", "6C", "7S", "8S", "9D", "2C", "2S", "2S", "8D", "TD");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerOneWin);
	}
	
	@Test
	public void shouldHandleStraightVsColor() {
		// given
		List<String> CardsList = Arrays.asList("5H", "6C", "7S", "8S", "9D", "2C", "2C", "2C", "8C", "TC");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerTwoWin);
	}
	
	@Test
	public void shouldHandleFourOfAKindVsFullHouse() {
		// given
		List<String> CardsList = Arrays.asList("5H", "5C", "5S", "5S", "9D", "2C", "2C", "2C", "8C", "8C");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerOneWin);
	}
	
	@Test
	public void shouldHandleRoyalFlushVsStraightFlush() {
		// given
		List<String> CardsList = Arrays.asList("5S", "6S", "7S", "8S", "9S", "TC", "JC", "QC", "KC", "AC");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerTwoWin);
	}
	
	@Test
	public void shouldHandlePairVsPair() {
		// given
		List<String> CardsList = Arrays.asList("5H", "5C", "6S", "7S", "KD", "2C", "3S", "8S", "8D", "TD");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerTwoWin);
	}
	
	@Test
	public void shouldHandleHighCardVsHighCard() {
		// given
		List<String> CardsList = Arrays.asList("5D", "8C", "9S", "JS", "AC", "2C", "5C", "7D", "8S", "QH");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerOneWin);
	}
	
	@Test
	public void shouldHandlePairofQueensVsPairofQueens() {
		// given
		List<String> CardsList = Arrays.asList("4D", "6S", "9H", "QH", "QC", "3D", "6D", "7H", "QD", "QS");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerOneWin);
	}
	
	@Test
	public void shouldHandleFullHouseVsFullHouse() {
		// given
		List<String> CardsList = Arrays.asList("2H", "2D", "4C", "4D", "4S", "3C", "3D", "3S", "9S", "9D");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerOneWin);
	}
	
	@Test
	public void shouldHandleStraighFromAceVsStraighFromTwo() {
		// given
		List<String> CardsList = Arrays.asList("AH", "2D", "3C", "4D", "5S", "2C", "3D", "4S", "5S", "6D");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerTwoWin);
	}
	
	@Test
	public void shouldHandlePairOfFivesVsPairOfNines() {
		// given
		List<String> CardsList = Arrays.asList("5H", "KS", "9C", "7D", "9H", "8D", "3S", "5D", "5C", "AH");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerOneWin);
	}
	
	@Test
	public void shouldHandleHighCardKVsHighCardA() {
		// given
		List<String> CardsList = Arrays.asList("8C", "TS", "KC", "9H", "4S", "7D", "2S", "5D", "3S", "AC");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerTwoWin);
	}
	
	@Test
	public void shouldHandleHighCardAVsHighCardQ() {
		// given
		List<String> CardsList = Arrays.asList("AS", "KD", "3D", "JD", "8H", "7C", "8C", "5C", "QD", "6C");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerOneWin);
	}
	
	@Test
	public void shouldHandleColorVsColor() {
		// given
		List<String> CardsList = Arrays.asList("AS", "KS", "3S", "JS", "8S", "7C", "8C", "5C", "QC", "6C");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerOneWin);
	}
	
	@Test
	public void shouldHandlePokerVsRoyalPoker() {
		// given
		List<String> CardsList = Arrays.asList("AS", "2S", "3S", "4S", "5S", "TC", "JC", "QC", "KC", "AC");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerTwoWin);
	}
	
	@Test
	public void shouldHandleHighCardKVsPairOfA() {
		// given
		List<String> CardsList = Arrays.asList("6C", "7S", "KC", "9H", "TS", "AD", "2S", "5D", "3S", "AC");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerTwoWin);
	}
	
	@Test
	public void shouldHandlePairOfSevensVsPairOfJacks() {
		// given
		List<String> CardsList = Arrays.asList("6C", "4D", "7S", "7H", "5S", "JC", "6S", "9H", "4H", "JH");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerTwoWin);
	}
	
	@Test
	public void shouldHandlePairOfKingsVsPairOfAces() {
		// given
		List<String> CardsList = Arrays.asList("QD", "KH", "JS", "KS", "9S", "QC", "8D", "AH", "3C", "AC");
		makeHandListForEachPlayer(CardsList);
		// when
		handsComparator.compareHands(playerOne, playerTwo);
		// then
		Assert.assertEquals(true, handsComparator.playerTwoWin);
	}
	
	@Test
	public void shouldHandleHandsFromFile() throws FileNotFoundException {
		int firstPlayerScore = 0;
		Scanner s = new Scanner(new File("poker.txt"));
		List<String> cardsList = new ArrayList<String>();
		while (s.hasNextLine()){
		    for(int i = 0; i < 10; i++){
		    	cardsList.add(s.next());
		    }
		    makeHandListForEachPlayer(cardsList);
		    handsComparator = new HandsComparator();
		    handsComparator.compareHands(playerOne, playerTwo);
		    if(handsComparator.playerOneWin){
		    	firstPlayerScore++;
		    }
			cardsList.clear();
			playerOne.clear();
			playerTwo.clear();
		}
		s.close();
		Assert.assertEquals(376, firstPlayerScore);
	}
	
}
