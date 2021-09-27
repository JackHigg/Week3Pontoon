package Pontoon;

public class card {

    public int value;
    String suit;

    card(){

        this.getCardValue();
        this.getSuit();

    }


    public void getCardValue(){

        value = (int) (Math.random() * 13) +1;

    }

    public void getSuit(){

        int Generate = (int) (Math.random() * 4) +1;

        suit = (Generate == 1)? "Hearts" : (Generate == 2)? "Clubs" : (Generate == 3)? "Diamonds" : "Spades";

    }

    public void displayCard(){
        System.out.println("You have drawn: "+value+ " of "+suit);
    }





}

