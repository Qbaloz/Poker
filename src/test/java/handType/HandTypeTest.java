package handType;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HandTypeTest {
	
	private HandType handType;
	private HandSequanceValue expectedStatus;

	@Before
	public void initialize() {
		handType = new HandType();
	}
	
	@Test
	public void shouldHandleHighCard() {
		// given
		List<String> CardsList = Arrays.asList("AC", "6D", "7C", "8H", "9S");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.HIGH_CARD, expectedStatus);	
	}
	
	@Test
	public void shouldHandleOnePair() {
		// given
		List<String> CardsList = Arrays.asList("8C", "8D", "9C", "JH", "AS");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.ONE_PAIR, expectedStatus);	
	}
	
	@Test
	public void shouldHandleTwoPair() {
		// given
		List<String> CardsList = Arrays.asList("8C", "8D", "9C", "9H", "AS");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.TWO_PAIRS, expectedStatus);	
	}
	
	@Test
	public void shouldHandleThreeOfAKindPair() {
		// given
		List<String> CardsList = Arrays.asList("8C", "8D", "9C", "8H", "AS");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.THREE_OF_A_KIND, expectedStatus);	
	}
	
	@Test
	public void shouldHandleStraight() {
		// given
		List<String> CardsList = Arrays.asList("9C", "KD", "QC", "JH", "TS");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.STRAIGHT, expectedStatus);	
	}
	
	@Test
	public void shouldHandleStraightFromTenToAce() {
		// given
		List<String> CardsList = Arrays.asList("TD", "JS", "AD", "QC", "KC");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.STRAIGHT, expectedStatus);	
	}
	
	@Test
	public void shouldHandleColor() {
		// given
		List<String> CardsList = Arrays.asList("AC", "4C", "JC", "8C", "5C");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.FLUSH, expectedStatus);	
	}
	
	@Test
	public void shouldHandleFullHouse() {
		// given
		List<String> CardsList = Arrays.asList("TD", "TC", "TS", "8C", "8D");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.FULL_HOUSE, expectedStatus);	
	}
	
	@Test
	public void shouldHandleFourOfAKind() {
		// given
		List<String> CardsList = Arrays.asList("TD", "TC", "TS", "TC", "8D");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.FOUR_OF_A_KIND, expectedStatus);	
	}
	
	@Test
	public void shouldHandleStraightFlush() {
		// given
		List<String> CardsList = Arrays.asList("7C", "JC", "8C", "9C", "TC");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.STRAIGHT_FLUSH, expectedStatus);	
	}
	
	@Test
	public void shouldHandleRoyalFlush() {
		// given
		List<String> CardsList = Arrays.asList("TC", "JC", "AC", "QC", "KC");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.STRAIGHT_FLUSH, expectedStatus);	
	}
	
	@Test
	public void shouldHandlePairOfFives() {
		// given
		List<String> CardsList = Arrays.asList("5H", "5C", "6S", "7S", "KD");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.ONE_PAIR, expectedStatus);	
	}
	
	@Test
	public void shouldHandlePairOfEights() {
		// given
		List<String> CardsList = Arrays.asList("2C", "3S", "8S", "8D", "TD");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.ONE_PAIR, expectedStatus);	
	}
	
	@Test
	public void shouldHandleHighCardAce() {
		// given
		List<String> CardsList = Arrays.asList("5D", "8C", "9S", "JS", "AC");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.HIGH_CARD, expectedStatus);	
	}
	
	@Test
	public void shouldHandleHighCardQueen() {
		// given
		List<String> CardsList = Arrays.asList("2C", "5C", "7D", "8S", "QH");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.HIGH_CARD, expectedStatus);	
	}
	
	@Test
	public void shouldHandleThreeAces() {
		// given
		List<String> CardsList = Arrays.asList("2D", "9C", "AS", "AH", "AC");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.THREE_OF_A_KIND, expectedStatus);	
	}
	
	@Test
	public void shouldHandleFlushWithDiamonds() {
		// given
		List<String> CardsList = Arrays.asList("3D", "6D", "7D", "TD", "QD");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.FLUSH, expectedStatus);	
	}
	
	@Test
	public void shouldHandlePairOfQueens() {
		// given
		List<String> CardsList = Arrays.asList("4D", "6S", "9H", "QH", "QC");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.ONE_PAIR, expectedStatus);	
	}
	
	@Test
	public void shouldHandlePairOfQueens2() {
		// given
		List<String> CardsList = Arrays.asList("3D", "6D", "7H", "QD", "QS");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.ONE_PAIR, expectedStatus);	
	}
	
	@Test
	public void shouldHandleFullHouseWithThreeFours() {
		// given
		List<String> CardsList = Arrays.asList("2H", "2D", "4C", "4D", "4S");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.FULL_HOUSE, expectedStatus);	
	}
	
	@Test
	public void shouldHandleFullHouseWithThreeThrees() {
		// given
		List<String> CardsList = Arrays.asList("3C", "3D", "3S", "9S", "9D");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.FULL_HOUSE, expectedStatus);	
	}
	
	@Test
	public void shouldHandleThreeOfAkind() {
		// given
		List<String> CardsList = Arrays.asList("5H", "5C", "5S", "8S", "9D");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.THREE_OF_A_KIND, expectedStatus);	
	}
	
	@Test
	public void shouldHandlePairOfKings() {
		// given
		List<String> CardsList = Arrays.asList("QD", "KH", "JS", "KS", "9S");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.ONE_PAIR, expectedStatus);	
	}
	
	@Test
	public void shouldHandlePairOfAces() {
		// given
		List<String> CardsList = Arrays.asList("QC", "8D", "AH", "3C", "AC");
		// when
		expectedStatus = handType.checkHandType(CardsList);
		// then
		Assert.assertEquals(HandSequanceValue.ONE_PAIR, expectedStatus);	
	}

}
