package com.teachmeskills.lesson10.hw.homework0.client;

import com.teachmeskills.lesson10.hw.homework0.card.Card;

public class Client {
    private Card[] cards;

    public Client(String cardNumber, int cvc, double balanceOnCard) {
    }

    public Client(Card[] cards) {
        this.cards = cards;
    }

    int countDuplicateCards = 0;

    public int getCountDuplicateCards() {
        if (cards.length == 0) {
            System.out.println("There are no duplicates");
            return 0;
        }

        for (int i = 0; i < cards.length - 1; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].getCVC() == cards[j].getCVC() &&
                        cards[i].getCardNumber().equals(cards[j].getCardNumber())) {
                    countDuplicateCards++;
                    break;
                }
            }
        }

        if (countDuplicateCards == 0) {
            System.out.println("There are no duplicates");
        } else {
            System.out.println("Client has " + countDuplicateCards + " duplicate cards");
        }
        return countDuplicateCards;
    }
}