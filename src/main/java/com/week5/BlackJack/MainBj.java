package com.week5.BlackJack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get number of players
        System.out.print("How many players? ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        // Create players
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter player " + (i + 1) + " name: ");
            String playerName = scanner.nextLine();
            players.add(new Player(playerName));
        }
        
        // Create and shuffle deck
        Deck deck = new Deck();
        System.out.println("\nDeck shuffled and ready!");
        
        // Deal 2 cards to each player
        System.out.println("\nDealing cards...");
        for (int round = 0; round < 2; round++) {
            for (Player player : players) {
                Card card = deck.deal();
                card.flip(); // Make card face up
                player.addCard(card);
            }
        }
        
        // Display each player's hand
        System.out.println("\n=== PLAYER HANDS ===");
        for (Player player : players) {
            System.out.println(player);
        }
        
        // Determine winner
        Player winner = determineWinner(players);
        
        if (winner != null) {
            System.out.println("\n🎉 WINNER: " + winner.getName() + " with " + winner.getScore() + " points!");
        } else {
            System.out.println("\n🤝 It's a tie! No winner this round.");
        }
        
        scanner.close();
    }
    
    private static Player determineWinner(List<Player> players) {
        Player winner = null;
        int bestScore = 0;
        
        for (Player player : players) {
            int score = player.getScore();
            
            // Skip busted players
            if (player.isBusted()) {
                System.out.println(player.getName() + " busted with " + score + " points!");
                continue;
            }
            
            // Check if this player has a better score
            if (score > bestScore && score <= 21) {
                bestScore = score;
                winner = player;
            }
        }
        
        // Check for ties
        int tieCount = 0;
        for (Player player : players) {
            if (!player.isBusted() && player.getScore() == bestScore) {
                tieCount++;
            }
        }
        
        // If there's a tie, return null
        if (tieCount > 1) {
            return null;
        }
        
        return winner;
    }
}
