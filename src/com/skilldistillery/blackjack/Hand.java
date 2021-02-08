package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.*;

public abstract class Hand {


	protected List<Card> cards = new ArrayList<>();

	public Hand() {				//constructor
	}
	
	public Hand(List<Card> cards) {
		this.cards = cards;
	}

	public void addCard(Card card) {
		cards.add(card);		//working
	}

	public void clear() {
		cards.clear();			//working
	}

	public abstract int getHandValue(); // abstract

	@Override
	public String toString() {
		String result = "";
		
		for (Card card : cards) {
			result += card +"\n";
			//System.out.println(card);
		}
		return result +"\nCard value is: ";
	}
}
