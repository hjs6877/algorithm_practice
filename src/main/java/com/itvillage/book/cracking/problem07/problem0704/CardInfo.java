package com.itvillage.book.cracking.problem07.problem0704;

public class CardInfo {
    private CardType cardType;
    private String cardNumber;

    public enum CardType {
        CREDIT_CARD,
        CHECK_CARD,
        GIFT_CARD
    }
}
