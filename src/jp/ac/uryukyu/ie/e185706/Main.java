
package jp.ac.uryukyu.ie.e185706;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        System.out.println("\n^・ω・^");

        while (true) {

            System.out.println("【☆a　☆b　☆c】");

            String ChoiceWord = InputWord.Scan();

            new ChoiceCount(ChoiceWord);

            Growth.Growth();

            System.out.println("\n\n");

        }
    }
}
