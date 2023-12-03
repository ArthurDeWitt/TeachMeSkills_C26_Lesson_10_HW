package com.teachmeskills.lesson10.hw.homework0.card;

public class Card {

    private String cardNumber;
    private int CVC;
    private double balanceOnCard;

    public Card(String cardNumber, int CVC, double balanceOnCard) {
        this.cardNumber = cardNumber;
        this.CVC = CVC;
        this.balanceOnCard = balanceOnCard;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getCVC() {
        return CVC;
    }

    public double getBalanceOnCard() {
        return balanceOnCard;
    }
}
