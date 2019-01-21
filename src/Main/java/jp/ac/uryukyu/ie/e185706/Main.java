
package jp.ac.uryukyu.ie.e185706;


public class Main {

    public static void main(String[] args) {


        System.out.println("\n▽　はじめまして！あなたのお名前を教えてね！");

        User name = new User(Util.Scan());
        System.out.println( "　《"+name.getName()+"》" + "って言うんだね！");

        System.out.println("\n"+ "　( ・ω・ )ノ　\n"+ "\n");

        System.out.println("△　今日から君はこの子を育てることになるよ！名前をつけてあげよう");
        Creature cname = new Creature(Util.Scan());
        System.out.println( "\n　《"+cname.getName()+"》" +"をお世話してあげよう！\n\n");

        ChoiceCount cc = new ChoiceCount();
        Growth gr = new Growth(cc);
        gr.setCt(cname);


        while (!gr.isLife()) {

            System.out.println("\n▽　なにをする？\n" + "【1: エサをあげる　2:一緒に遊ぶ　3:寝る】");

            String ChoiceWord = Util.Scan();
            cc.ChoiceCountSet(ChoiceWord);
            gr.GrowthPrint();

            System.out.println("\n\n");

        }

        System.out.println("\n　《"+cname.getName()+"》は独り立ちした！");

    }

}
