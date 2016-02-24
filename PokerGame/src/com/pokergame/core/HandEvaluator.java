package com.pokergame.core;

public interface HandEvaluator {

	boolean isStraightFlush(Hand hand);

	boolean isFlush(Hand hand);

	boolean isStraight(Hand hand);

	boolean isOnePair(Card card);
}
