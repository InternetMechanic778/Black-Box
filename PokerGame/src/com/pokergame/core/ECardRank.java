package com.pokergame.core;

public enum ECardRank {
	ONE(1), TWO(2), THREE(3), FOUR(4), KING(13);

	private final int value;

	private ECardRank(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static ECardRank fromInt(int rank) {
		for (ECardRank cardRank : ECardRank.values()) {
			if (cardRank.equals(rank)) {
				return cardRank;
			}
		}
		return null;
	}

}
