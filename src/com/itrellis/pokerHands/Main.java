package com.itrellis.pokerHands;

// Da Rules
//
//        Sample Input
//        2H 3D 5S 9C KD 2C 3H 4S 8C AH
//        2H 4S 4C 2D 4H 2S 8S AS QS 3S
//        2H 3D 5S 9C KD 2C 3H 4S 8C KH
//        2H 3D 5S 9C KD 2D 3H 5C 9S KH
//
//        Sample Output
//
//        White wins.
//        Black wins.
//        Black wins.
//        Tie.

// String Test:
//if (card instanceof String) {
//        System.out.println("Yes, it's a string");
//        }
//        else {
//        System.out.println("Nope. Try again.");
//        }

import java.util.*;

class Card {
    private String fullCard = "";
    private String rank = "";
    private String suit = "";

    public Card(String card) {
        System.out.println("Creating Card: " + card);

        this.fullCard = card;
        this.rank = Character.toString(card.charAt(0));
        this.suit = Character.toString(card.charAt(1));

        System.out.println("Creating Card: " + rank + " " + suit);
    }

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return this.rank;
    }
    public String getSuit() {
        return this.suit;
    }
}

class Hand {
    // Does this need to be a List or would an array work? Or is it better to use Collections on principle?
    private List<Card> cards = new ArrayList<Card>();

    public Hand() {

    }
    public Hand(List<Card> cards) {

    }

    public String toString() {
        String result = "[";
        for (Card card : this.cards) {
            result += "" + card.getRank() + card.getSuit() + " ";
        }
        result += "]";

        return result;
    }

    public Card getCard(int which) {
        return cards.get(which);
    }
    public void addCard(Card card) {
        cards.add(card);
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here


        // Take the list, make Cards and then two Hands out of the cards
        String firstRound = "2H 3D 5S 9C KD 2C 3H 4S 8C AH";
        String[] cardArray = new String[10];
        cardArray = firstRound.split(" ");
        Hand playerHand = new Hand();
        Hand houseHand = new Hand();

        int cardCount = 0;
        for (String card : cardArray) {
            Card cardX = new Card(card);
            if (cardCount < 5) {
                playerHand.addCard(cardX);
            }
            else {
                houseHand.addCard(cardX);
            }

            cardCount++;
        }

        System.out.println(playerHand);
        System.out.println(houseHand);

        // Straight Flush: same suit, 5 consecutive cards, ranked by highest card

        // Four of a Kind: four cards, same rank, ranked by card rank
        //if (player.ranks.size() == 2) {  // this won't work --
          //  System.out.println("Four of a kind!!");
            // no real way to retrieve value
            // test for rank of fifth card

        //}

        // Full house: three of a kind, and a pair, ranked by the value of the three cards

        // Flush: five cards, same suit, any values, ranked using High Card rules

        // Straight: Hand contains five cars with consecutive values, ranked by highest card

        // Three of a kind, ranked by value of the three

        // Two pairs, ranked by highest, 2nd ranking 2nd paid, 3rd ranking single card

        // Pair, two cards with same value, ranked by value of pair, followed by remaining cards, starting w/ lowest

        // High Card: Single highest card, beat ties with values of remaining cards (starting with highest)
    }
}
