package com.week5.BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;
    
    public Hand() {
        cards = new ArrayList<>();
    }
    
    public void addCard(Card card) {
        cards.add(card);
    }
    
    public int getValue() {
        int value = 0;
        int aces = 0;
        
        for (Card card : cards) {
            if (card.isFaceUp()) {
                int cardValue = card.getPointValue();
                if (cardValue == 11) { // Ace
                    aces++;
                }
                value += cardValue;
            }
        }
        
        // Adjust for aces (convert from 11 to 1 if needed to avoid busting)
        while (value > 21 && aces > 0) {
            value -= 10;
            aces--;
        }
        
        return value;
    }
    
    public boolean isBusted() {
        return getValue() > 21;
    }
    
    public boolean isBlackjack() {
        return cards.size() == 2 && getValue() == 21;
    }
    
    public int getCardCount() {
        return cards.size();
    }
    
    public Card getCard(int index) {
        if (index >= 0 && index < cards.size()) {
            return cards.get(index);
        }
        return null;
    }
    
    public void clear() {
        cards.clear();
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cards.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Card card = cards.get(i);
            if (card.isFaceUp()) {
                sb.append(card.getValue()).append(" of ").append(card.getSuit());
            } else {
                sb.append("Hidden Card");
            }
        }
        return sb.toString();
    }
}
