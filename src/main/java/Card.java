//Made by Aathithyan Thavachselvan
// Created May 09 2025

// The suns will bloom, the sky will be colourful, life would be good, if i get a 80% in this

public class Card {
    private String name;
            private String suit;
        private int value;

    
    
        public Card(String names, String suits, int value) {
                names=this.names;
                 suits=this.suit;
             value=this.value;
    }

        public String getSuit() {
               
            return this.suit;
    }

    public String getName() {
           
        return this.name;
    }

    public int getValue() {
               
        return this.value;
    }

    
    public String toString() {
       
        return name + " of " + suit;
    }

   
    public boolean equals(Object obj) {
        Card card = (Card)obj;
        
        if (value == card.value && name.equals(card.name) && suit.equals(card.suit)) {
       
            return true;
      }
      return false;
    }
}