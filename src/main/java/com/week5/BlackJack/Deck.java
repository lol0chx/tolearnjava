package com.week5.BlackJack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    String[] suits = {"Hearts","Spades","Diamonds","Clubs"};
    String[] values = {"2","3","4","5","6","7","8",
            "9","10","J","Q","K","A"};
    private ArrayList<Card> cards;
    public Deck(){
        cards = new ArrayList<>();

// these loops create all the cards in the deck
// and add them to the ArrayList
        for(String suit: suits){
            for(String value: values){
                Card card = new Card(suit, value);
                cards.add(card);
            }
        }
        shuffle(); // Shuffle the deck after creating it
    }
    public void shuffle(){
        Collections.shuffle(cards);
    }
    public Card deal(){
// deal the top card (if there are any cards left
        if(cards.size() > 0){
            Card card = cards.remove(0);
            return card;
        } else {
            // If deck is empty, create a new shuffled deck
            System.out.println("Deck is empty! Creating new deck...");
            cards = new ArrayList<>();

            for(String suit: suits){
                for(String value: values){
                    Card newCard = new Card(suit, value);
                    cards.add(newCard);
                }
            }
            shuffle();
            return cards.remove(0);
        }
    }
    public int getSize(){
        return cards.size();
    }
}
