package com.provectus.oop.poker;

import java.util.Random;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class PokerMachine {
  public Deck createDeck() {
    return new Deck();
  }

  public void shuffleDeck(Deck deck) {
    Random random = new Random();
    for (int i=0; i<100; i++) {
      int in = random.nextInt(52);
      int out = random.nextInt(52);

      Card tmpCard = deck.getCard(in);
      deck.setCard(deck.getCard(out), in);
      deck.setCard(tmpCard, out);
    }
  }

  public void serveCardToPlayers(Deck deck, int players) {
    int count = 0;
    for (int round=1; round<=5; round++) {
      System.out.println("=== ROUND " + round + " ===");
      for (int player=1; player<=players; player++) {
        System.out.printf("Player %d gets card: %s%n", player, deck.getCard(count++));
      }
      System.out.println();
    }
  }
}
