package com.provectus.oop.poker;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Deck {
  private Card[] deck;

  public Deck() {
    String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
    String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    deck = new Card[52];
    int count = 0;
    for (String suit: suits) {
      for (String value : values) {
        Card card = new Card();
        card.setSuit(suit);
        card.setValue(value);
        deck[count++] = card;
      }
    }
  }

  public Card getCard(int cardIndex) {
    return deck[cardIndex];
  }

  public void setCard(Card card, int cardIndex) {
    deck[cardIndex] = card;
  }
}
