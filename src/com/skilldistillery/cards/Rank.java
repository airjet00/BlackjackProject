package com.skilldistillery.cards;

public enum Rank {
	TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), 
	NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10), ACE(11);
	
	private int value; 
	
	Rank(int value){
		this.value = value;
	}
	
	public int getValue() {
		if(value == JACK.value) {
			return (value +2);
		}
		else if(value == QUEEN.value) {
			return (value +3);
		}
		else if(value == KING.value) {
			return (value +4);
		}
		else {
			return value;
		}
	}
	
	@Override
	public String toString() {
		if(value == TEN.value) {
			return "10";
		}
		else if(value == JACK.value) {
			return "Jack";
		}
		else if(value == QUEEN.value) {
			return "Queen";
		}
		else if(value == KING.value) {
			return "King";
		}
		else {
			return "" + value;
		}
	}
}
