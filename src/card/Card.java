/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package card;

/**
 * Created by: Jasmine Saini
 * Student Number: 991754208
 * 
 * Modifier: Jasmine Saini
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author srinivsi
 */
public class Card {
    // Constants for suit names
    public static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    
    // Properties of the card
    private int value; // 1-13, where 1 is Ace, 11 is Jack, etc.
    private String suit; // Suit of the card (Hearts, Diamonds, Clubs, Spades)

    // Getter for value
    public int getValue() {
        return value;
    }

    // Setter for value
    public void setValue(int value) {
        this.value = value;
    }

    // Getter for suit
    public String getSuit() {
        return suit;
    }

    // Setter for suit
    public void setSuit(String suit) {
        this.suit = suit;
    }

    // To display the card as a string (e.g., "Ace of Hearts")
    @Override
    public String toString() {
        return value + " of " + suit;
    }
}