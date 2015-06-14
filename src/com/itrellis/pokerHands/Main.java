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

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        class Hand {
            // Does this need to be a List or would an array work? Or is it better to use Collections on principle?
            List<String> cards = new ArrayList<String>();
            Map<String, Integer> suits = new HashMap<String, Integer>();
            Map<String, Integer> ranks = new HashMap<String, Integer>();

            public Hand(String[] playerHand){
                for (String card : playerHand) {
                    cards.add(card);
                    System.out.println(card);
                    suits.add(Char.toString(card.charAt(1))., suits[card[1]] == null? 0 : suits[card[1]] + 1);
//                    ranks.add()
                }
            }
        }
        // Take the hand of cards and go through it in a cycle, making lists<> of the suits, ranks, etc.
        // Then have rules regarding those lists.
        String[] firstRound = {"2H", "3D", "5D", "9C", "KD", "2C", "3H", "4S", "8C", "AH"};
        Hand player = new Hand(Arrays.copyOfRange(firstRound, 0, firstRound.length/2));
        Hand house = new Hand(Arrays.copyOfRange(firstRound, firstRound.length/2, firstRound.length - 1));

        // Build Deck -- not sure about this




//        Working with Strings and Characters
//        String shortString = "Jaime";
//        for (int j = 0; j < shortString.length(); j++) {
//            char piece = shortString.charAt(j);
//            System.out.println(Character.toString(piece));
//        }


        // Straight Flush: same suit, 5 consecutive cards, ranked by highest card

        // Four of a Kind: four cards, same rank, ranked by card rank

        // Full house: three of a kind, and a pair, ranked by the value of the three cards

        // Flush: five cards, same suit, any values, ranked using High Card rules

        // Straight: Hand contains five cars with consecutive values, ranked by highest card

        // Three of a kind, ranked by value of the three

        // Two pairs, ranked by highest, 2nd ranking 2nd paid, 3rd ranking single card

        // Pair, two cards with same value, ranked by value of pair, followed by remaining cards, starting w/ lowest

        // High Card: Single highest card, beat ties with values of remaining cards (starting with highest)
    }
}
