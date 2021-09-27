package Pontoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {         //start of class

    static Scanner kboard = new Scanner(System.in);

    public static void main(String[] args) {     //start of main method

    Pontoon G1 = new Pontoon();
    G1.Start();
    G1.GetTwoCards();
    G1.getTotal();
    G1.carryOn();
    G1.endGameResult();

    }  //end of main method





}  //end of class