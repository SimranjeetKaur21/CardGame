/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */

/**
 * A CardTrick class models a "hand" of seven cards filled with random card objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. 
 * Name: SimranjeetKaur
 * StudentNumber : 991715949
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(generateRandomValue());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[generateRandomNumber(0,3)]);
            magicHand[i]=c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
       
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("pick the card value: ");
        int userValue = scanner.nextInt();
        System.out.print("Pick the card suit (0-3): ");
        int userSuit = scanner.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);
        
        boolean isCardInMagicHand = false;
        for (Card card : magicHand){
            if (card.equals(userCard)){
                isCardInMagicHand = true;
                break;
            }
        }
        
        if (isCardInMagicHand){
            System.out.println("congratulations! your card is in the magic hand.");
        }else{
            System.out.println("Sorry, your card is not in magic hand.");
        }
    }
    
    private static int generateRandomNumber(int min, int max){
        return (int)(Math.random() * (max-min + 1)+ min);
    }
    
    private static int generateRandomValue(){
        return generateRandomNumber(1, 13);
    }
    
    
}
