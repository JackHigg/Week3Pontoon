package Pontoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Pontoon {

    static Scanner kboard = new Scanner(System.in);

    private ArrayList<card> AllCardsDrawn = new ArrayList<card>();
    private int total = 0;
    private card show;  // create object card to store variable in to be used for showing array value etc
    private boolean busted;
    //private String choice;

    public void Start() {

        System.out.println("\n----------------------------");
        System.out.println("\nCommencing game");

        System.out.println("\nDrawing 2 cards\n");

    }

    public void GetTwoCards(){



        for(int i=0; i<2;i++){

            AllCardsDrawn.add(new card());                      //store new generated card in AllCardDrawn array

        }


        for(int i=0; i<AllCardsDrawn.size();i++){                  //for value in array loop



            show = AllCardsDrawn.get(i);                           //set show object to array value
            show.displayCard();                                    //show object

        }


    }

    public void getTotal(){
        for(int i=0; i<AllCardsDrawn.size();i++){            //loop through allCardsDrawn array

            show = AllCardsDrawn.get(i);                     //set show object to array value
            total = total+show.value;                        //set total to total + show.value to get total value of all values in array
            //System.out.println(total);
        }
    }

    public void carryOn(){

        String choice;

        System.out.println("\nDo you wish to draw another card? y/n");        //asks user if they wish to draw another card
        choice = kboard.next();

        busted=busted(total);                                         // check if value is over 21


        while (choice.equalsIgnoreCase("y")  && !busted) {

            AllCardsDrawn.add(new card());                      //Generate card and store new card in AllCardsDrawn Array


            show = AllCardsDrawn.get(AllCardsDrawn.size()-1);                     //set show object to array value
            show.displayCard();

            total = total+show.value;                                             //set total to total plus new card value

            //System.out.println(total);

            busted=busted(total);                                                 //check if value is over 21 by calling busted method

            if (!busted) {
                System.out.println("\nDo you wish to draw another card? y/n");        //asks user if they wish to draw another card if !busted is not true
                choice = kboard.next();
            }


        }



    }

    private boolean busted(int total){

        return ( total >21 ? true : false);          // ternary operator in return to shorten code

    }

    public void endGameResult(){

        boolean result = GetResult(total);

        String BustTxt = "\nBusted your cards total " + total + " which is over 21";
        String WinTxt = "\nYou have won with " + total;
        String LostTxt = "\nYou have lost with " + total;

        String GameMessage = busted ? BustTxt : (result ? WinTxt : LostTxt);
        System.out.println(GameMessage);
    }

    private boolean GetResult(int total) {

        return (total > 19 && total <= 21 ? true : false);      // ternary operator in return to shorten code
    }


}
