package com.pokergame.core;

public class Card {
	private ESuites suit;
	private ECardRank cardRank;

	public Card() {
		super();
	}

	public Card(ESuites suit, ECardRank cardRank) {
		super();
		this.suit = suit;
		this.cardRank = cardRank;
	}

	public ESuites getSuit() {
		return suit;
	}

	public void setSuit(ESuites suit) {
		this.suit = suit;
	}

	public ECardRank getCardRank() {
		return cardRank;
	}

	public void setCardRank(ECardRank cardRank) {
		this.cardRank = cardRank;
	}

}
