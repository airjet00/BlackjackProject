package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<>();
	
	public Deck() {
		
		Suit[] suitArr = Suit.values();
		Rank[] rankArr = Rank.values();
		for (Suit suit : suitArr) {
			for (Rank rank : rankArr) {
				Card card= new Card(suit, rank);
				cards.add(card);
			}
		}
	}
	
	public int checkDeckSize() {
		return cards.size();
	}
	
	public Card dealCard() {
		return cards.remove(0);
	}
	
	public void shuffle() {
		Collections.shuffle(cards);;
	}
	//UML example has 
	// +cardsLeftInDect():int    ??? Unsure if this is needed
	// +dealCard(hand: Hand): void  
//	public void dealCard(Hand hand) {
//		
//	}
	
}
