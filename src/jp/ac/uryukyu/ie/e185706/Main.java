
package jp.ac.uryukyu.ie.e185706;


public class Main {
    public static void main(String[] args) {


        System.out.println("\nはじめまして！あなたのお名前を教えてね！");

        User name = new User(Util.Scan());
        System.out.println( name.getName() + "って言うんだね！");


        KeyControl gw = new KeyControl("KeyControlWindow",5,5);
        gw.setVisible(true);
        



        while (true) {

            System.out.println(" 何する？\n" + "【1: エサをあげる　2:一緒に遊ぶ　3:寝る】");

/*            String ChoiceWord = Util.Scan();

            ChoiceCount aaa = new ChoiceCount(ChoiceWord);

            Growth hoge = new Growth(aaa,false);

            hoge.GrowthPrint(); */

            System.out.println("\n\n");

        }
    }

}
