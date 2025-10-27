package com.week5.BlackJack;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Hand playerHand = new Hand();
        Hand dealerHand = new Hand();

        // Initial deal: two cards each
        for (int i = 0; i < 2; i++) {
            Card playerCard = deck.deal();
            playerCard.flip();
            playerHand.addCard(playerCard);

            Card dealerCard = deck.deal();
            dealerCard.flip();
            dealerHand.addCard(dealerCard);
        }

        System.out.println("Player hand: " + playerHand + " (" + playerHand.getValue() + ")");
        System.out.println("Dealer hand: " + dealerHand + " (" + dealerHand.getValue() + ")");

        // Player strategy: hit until 17 or higher
        while (playerHand.getValue() < 17) {
            Card hit = deck.deal();
            hit.flip();
            playerHand.addCard(hit);
            System.out.println("Player hits: " + hit.getValue() + " of " + hit.getSuit());
            System.out.println("Player total: " + playerHand.getValue());
            if (playerHand.isBusted()) {
                System.out.println("Player busts! Dealer wins.");
                return;
            }
        }

        System.out.println("Player stands at: " + playerHand.getValue());

        // Dealer strategy: hit until 17 or higher
        while (dealerHand.getValue() < 17) {
            Card hit = deck.deal();
            hit.flip();
            dealerHand.addCard(hit);
            System.out.println("Dealer hits: " + hit.getValue() + " of " + hit.getSuit());
            System.out.println("Dealer total: " + dealerHand.getValue());
            if (dealerHand.isBusted()) {
                System.out.println("Dealer busts! Player wins.");
                return;
            }
        }

        System.out.println("Dealer stands at: " + dealerHand.getValue());

        int playerTotal = playerHand.getValue();
        int dealerTotal = dealerHand.getValue();

        if (playerTotal > dealerTotal) {
            System.out.println("Player wins!");
        } else if (dealerTotal > playerTotal) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("Push (tie).");
        }
    }
}

