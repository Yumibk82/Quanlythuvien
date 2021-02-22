package Behaviors;

import Entities.Card;

import java.util.ArrayList;

public class CardManagement {
    ArrayList<Card> cards = new ArrayList<Card>();

    public void showCardInfo(){
        for (Card eCard: cards) {
            System.out.println(eCard.toString());
        }
    }
    public void addCard(Card card){
        cards.add(card);
    }
}
