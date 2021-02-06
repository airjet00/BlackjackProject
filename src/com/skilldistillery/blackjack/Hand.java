package com.skilldistillery.blackjack;

import java.util.List;

import com.skilldistillery.cards.Card;

public abstract class Hand {

	protected List<Card> cards;

	public Hand() {				//constructor
	}

	public void addCard(Card card) {

	}

	public void clear() {

	}

	public int getHandValue() { // abstract
		return 0;
	}

	@Override
	public String toString() {
		return "Hand toString";
	}
}
