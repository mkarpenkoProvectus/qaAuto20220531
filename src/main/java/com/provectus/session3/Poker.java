package com.provectus.session3;

import java.util.Random;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Poker {
  private static int noOfCards = 52;
  private static int noOfPlayers = 4;
  private static String[] deck = new String[noOfCards];

  public static void main(String[] args) {
    createDeck();
    shuffleDeck();
    serveCards();
  }

  private static void createDeck() {
    String[] suites = {"Hearts", "Clubs", "Diamonds", "Spades"};
    String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    int count = 0;
    for (String suit: suites) {
      for (String value : values) {
        deck[count++] = value + " of " + suit;
      }
    }
  }

  private static void shuffleDeck() {
    Random random = new Random();
    for (int i=0; i<100; i++) {
      int in = random.nextInt(noOfCards);
      int out = random.nextInt(noOfCards);

      String tmpCard = deck[in];
      deck[in] = deck[out];
      deck[out] = tmpCard;
    }
  }

  private static void serveCards() {
    int count = 0;
    for (int round=1; round<=5; round++) {
      System.out.println("=== ROUND " + round + " ===");
      for (int player=1; player<=noOfPlayers; player++) {
        System.out.printf("Player %d gets card: %s%n", player, deck[count++]);
      }
      System.out.println();
    }
  }
}
