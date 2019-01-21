package jp.ac.uryukyu.ie.e185706;

import java.util.Scanner;

public class Util {

    /**
     *
     * Util -外部入力の処理に関するクラス
     *
     */

    public static String Scan() {
        Scanner scan = new Scanner(System.in);
        String TheChoice = scan.next();
        return  TheChoice;
    }

}

