// Author Aathithyan Thavachselvan
// Created May 09 2025


import java.util.ArrayList;

public class DiscardPile {
    
    private ArrayList<Card> discardPile;

    public DiscardPile(Card[] cardArray) {
       
        discardPile = new ArrayList<>();
        
                            for (Card card : cardArray) {
                             if (card != null) {
                             discardPile.add(card);
            }
        }
    }

    public DiscardPile() {
            
        discardPile = new ArrayList<>();
    }

    public Card[] getDiscardPile() {
        
        return discardPile.toArray(new Card[0]);
    }

    public int size() {
        
        return discardPile.size();
    }

    public void addCard(Card card) {
       
        discardPile.add(card);
    }

    public Card removeCard(Card card) {
        
        if (discardPile.remove(card)) {
            
            return card;
        }
        
        return null;
    }

    public Card[] removeAll() {
        
        Card[] removedCards = discardPile.toArray(new Card[0]);
        
        discardPile.clear();
        return removedCards;
    }

 
    public String toString() {
                        if (discardPile.isEmpty()) {
                                         return "";
        }

        StringBuilder result = new StringBuilder();
                
        
        for (int i = 0; i < discardPile.size(); i++) {
          
          
            result.append(discardPile.get(i).toString());
            if (i < discardPile.size() - 1) {
                
                
                result.append(", ");
            } else {
                result.append(".");
            }
        }
        return result.toString();
    }
}
