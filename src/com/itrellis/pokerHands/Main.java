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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Build Deck -- not sure about this
        List<String> suits = new ArrayList<String>();
        suits.add("H");
        suits.add("D");
        suits.add("S");
        suits.add("C");

        String[] firstRound = {"2H", "3D", "5D", "9C", "KD", "2C", "3H", "4S", "8C", "AH"};

        String[] playerHand = Arrays.copyOfRange(firstRound, 0, firstRound.length / 2);
        String[] houseHand = Arrays.copyOfRange(firstRound, firstRound.length/2 + 1, firstRound.length - 1);

        Arrays.sort(playerHand);
        Arrays.sort(houseHand);

        // Straight Flush: same suit, 5 consecutive cards, ranked by highest card
        String lastCard = playerHand[0];

        for(int i = 1; i < playerHand.length; i++) {
            System.out.println(card);
            if(lastCard[1] == playerHand[i][1]){
                
            }
        }

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
