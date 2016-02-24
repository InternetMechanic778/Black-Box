package com.pokergame.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.pokergame.core.AnalyzeHand;
import com.pokergame.core.Card;
import com.pokergame.core.EHandType;
import com.pokergame.core.ESuites;
import com.pokergame.core.Hand;
import com.pokergame.core.HandEvaluator;

public class HandEvaluatorImpl implements AnalyzeHand, HandEvaluator {

	@Override
	public EHandType findHighestRank(Hand hand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EHandType findLowestRank(Hand hand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EHandType findRank(Hand hand) {
		return null;
	}

	@Override
	public boolean isOnePair(Card card) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isStraightFlush(Hand hand) {
		if (isFlush(hand) && isStraight(hand))
			return true;
		else
			return false;
	}

	@Override
	public boolean isFlush(Hand hand) {
		if (getSameSuit(hand.getCards()).size() == hand.getCards().size())
			return true;
		else
			return false;
	}

	@Override
	public boolean isStraight(Hand hand) {
		// TODO Auto-generated method stub
		return false;
	}

	private List<Card> getSameSuit(List<Card> cards) {
		Map<ESuites, List<Card>> suitCount = new HashMap<>();
		List<Card> mostOcurr = new ArrayList<>();

		for (Card card : cards) {
			if (suitCount.containsKey(card.getSuit()))
				suitCount.get(card.getSuit()).add(card);
			else
				suitCount.put(card.getSuit(),
						new ArrayList<Card>(Arrays.asList(card)));
		}
		for (Entry<ESuites, List<Card>> entry : suitCount.entrySet()) {
			if (entry.getValue().size() >= mostOcurr.size())
				mostOcurr = entry.getValue();
		}

		return mostOcurr;
	}

	private List<Card> getSameCards(Hand hand) {
		List<Card> sameCards = new ArrayList<>();
		
		
		return sameCards;
	}

}
