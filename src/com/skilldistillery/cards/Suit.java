package com.skilldistillery.cards;

public enum Suit {

	HEART("Heart"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");
	
	final private String name;
	
	
	Suit(String name){
		this.name = name;
	}
	
	@Override
	public String toString(){
		
		return name;
	}
}
