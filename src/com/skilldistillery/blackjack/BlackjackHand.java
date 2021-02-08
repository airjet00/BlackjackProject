package com.skilldistillery.blackjack;

import java.awt.List;

import com.skilldistillery.cards.*;

public class BlackjackHand extends Hand{
	//Deck deck = new Deck();
	//Hand hand = new BlackjackHand();
	//Card card = new Card();
	public BlackjackHand() {}
	
	public String getCard(List cards) {
		//Card card = deck.dealCard();
		
		return"";// card.toString();
	}
	public int getHandValue() {
		
		return 0;
	}
	
	public boolean isBlackjack(int count) {
		if(count == 21) {
			System.out.println("Winner");
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isBust(int Count) {
		if(Count > 21) {
			System.out.println("Bust");
			return true;
		}
		else {
			return false;
		}
	}

	// +isHard(): boolean  //optional
	// +isSoft(): boolean  //optional
}
