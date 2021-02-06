package com.skilldistillery.cards;

public enum Suit {

	//Suit for cards 
	HEART("Heart"), SPADES("Spades"), 
	CLUBS("Clubs"), DIAMONDS("Diamonds");
	
	//Declare variable for name
	final private String name;

	//constructor to assign name
	Suit(String name){
		this.name = name;
	}
	
	//toString overriding default toString
	@Override
	public String toString(){
		
		return name;
	}
}
