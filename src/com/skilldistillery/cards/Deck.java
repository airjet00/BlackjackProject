package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.skilldistillery.enums.drills.cards.Rank;
import com.skilldistillery.enums.drills.cards.Suit;

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
	
}
