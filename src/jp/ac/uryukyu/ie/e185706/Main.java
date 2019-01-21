
package jp.ac.uryukyu.ie.e185706;

import java.util.*;


public class Main {
    public static void main(String[] args) {


        System.out.println("\nはじめまして！あなたのお名前を教えてね！");

        Username name = new Username(Util.Scan());

        System.out.println( name.getName() + "って言うんだね！");

        //System.out.println("早速だけど今日から君はこの子の育て親になってね！");




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
