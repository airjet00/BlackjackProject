package com.skilldistillery.blackjack;

import java.util.Scanner;

public class BlackjackApplication {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		BlackjackApplication bja = new BlackjackApplication();
		
		bja.play(kb);
	}

	private void play(Scanner kb) {
		
		/*
		 * 	Will deal the starting cards to player
		 *	dealer. two each, one at a time.
		 *  
		 *  Will check for black jack for player,

		 *  If player has bj then dealer check for
		 *  a tie, if no dealer bj then player wins
		 *  
		 *  If dealer has bj and play does not 
		 *  then dealer wins. 
		 *  
		 *  Compare value of player and dealer 
		 *  to determine winner.
		 */
		
	}
	
	public void player() {
		/*
		 * Will check value of cards and display
		 * cards/value with option to hit/stay
		 * 
		 * Can add another card to hand (hit)
		 * If added card makes total greater than 21
		 * then player bust and loses automatically
		 * 
		 * Can stay with current hand value
		 * If stay then move to dealer/next player
		 * move
		 * 
		 * return card value
		 */
		
		
	}
	
	public void dealer() {
		
		/*While less than 17
		 * The dealers decisions are fix logic
		 * If card total is greater than or 17, stay
		 * If card total is less than 17, hit
		 * If hit, add card and total to hand
		 * 
		 * return card value
		 */
	}

}
