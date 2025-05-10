// Author Aathithyan Thavachselvan
// Created May 09 2025


import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;

   
    public Deck() {
        cards = new ArrayList<Card>();
        
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};

        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        
        for (String suit : suits) {
                for (String value : values) {
                
                    int cardValue = getCardValue(value); 
                cards.add(new Card(value, suit, cardValue)); 
            }
        }
    }

    
         public Deck(ArrayList<Card> newCards) {
        
        this.cards = newCards;
    }

    
         public int size() {
        
        return cards.size();
    }

    
    public Card draw() {
                if (cards.isEmpty()) {
            return null; 
        }
        return cards.remove(0); 
    }

  
    public void shuffle() {
        Random rand = new Random();
        
        for (int i = cards.size() - 1; i > 0; i--) {
                int j = rand.nextInt(i + 1);
          
            Card temp = cards.get(i);
                cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    
    private int getCardValue(String value) {
        switch (value) {
            
                case "Ace": return 1;
           
             case "Jack":
            
             case "Queen":
           
             case "King": return 10;
            
            default: return Integer.parseInt(value);
        }
    }

   
    public void addCard(Card card) {
        cards.add(card);
    }
}
