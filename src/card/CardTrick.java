/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;

/**
 * A CardTrick class that fills a magic hand of seven cards with random card objects
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
        
        // add one luckcard hard code 2,clubs
        Card luckyCard = new Card();
        luckyCard.setValue(10);
        luckyCard.setSuit(Card.SUITS[2]);
        magicHand[magicHand.length - 1]=luckyCard;

        //insert code to ask the user for Card value and suit, create their card
        Scanner scanner = new Scanner(System.in);
        System.out.print("pick the card value: ");
        int userValue = scanner.nextInt();
        System.out.print("Pick the card suit (0-3): ");
        int userSuit = scanner.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);
        
        // and search magicHand here
        boolean isCardInMagicHand = false;
        for (Card card : magicHand){
            if (card.equals(userCard)){
                isCardInMagicHand = true;
                break;
            }
        }
        //Then report the result here
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
