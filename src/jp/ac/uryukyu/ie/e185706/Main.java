
package jp.ac.uryukyu.ie.e185706;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        System.out.println("\n^・ω・^");

        while (true) {

            System.out.println("【☆a　☆b　☆c】");

            String ChoiceWord = Util.Scan();

            ChoiceCount aaa = new ChoiceCount(ChoiceWord);

            Growth hoge = new Growth(aaa,false);

            hoge.GrowthPrint();

            System.out.println("\n\n");

        }
    }

}
