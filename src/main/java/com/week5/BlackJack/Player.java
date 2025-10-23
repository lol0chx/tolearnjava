package com.week5.BlackJack;

public class Player {
    private String name;
    private Hand hand;
    
    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }
    
    public String getName() {

        return name;
    }
    
    public Hand getHand() {

        return hand;
    }
    
    public void addCard(Card card) {

        hand.addCard(card);
    }
    
    public int getScore() {

        return hand.getValue();
    }
    
    public boolean isBusted() {

        return hand.isBusted();
    }
    
    public void clearHand() {

        hand.clear();
    }
    
    @Override
    public String toString() {

        return name + ": " + hand.toString() + " (Score: " + getScore() + ")";
    }
}
