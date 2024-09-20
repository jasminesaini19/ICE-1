/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 *  CardTrick.java
 *
 * Created by: Jasmine Saini
 * Student Number: 991754208
 * 
 * Modifier: Jasmine Saini
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
import java.util.Scanner;
import java.util.Random;

public class CardTrick {
    
    public static void main(String[] args) {
        // Array to hold the "magic hand" of 7 random cards
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        // Generate 7 random cards for the magic hand
        for (int i = 0; i < magicHand.length; i++) {
            magicHand[i] = new Card();
            magicHand[i].setValue(random.nextInt(13) + 1); // Random value 1-13
            magicHand[i].setSuit(Card.SUITS[random.nextInt(4)]); // Random suit
            System.out.println(magicHand[i].toString());
        }
        
        // User input for a card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int userValue = scanner.nextInt();
        
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int suitChoice = scanner.nextInt();
        String userSuit = Card.SUITS[suitChoice];

        // Check if the user's card is in the magic hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equals(userSuit)) {
                found = true;
                break;
            }
        }
        
        // Output result
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
}