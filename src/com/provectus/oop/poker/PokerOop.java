package com.provectus.oop.poker;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class PokerOop {
  public static void main(String[] args) {
    PokerMachine pokerMachine = new PokerMachine();
    Deck deck = pokerMachine.createDeck();

    pokerMachine.shuffleDeck(deck);


    Deck deck2 = pokerMachine.createDeck();
    pokerMachine.shuffleDeck(deck2);
    pokerMachine.serveCardToPlayers(deck, 4);

    System.out.println("done");

  }
}
