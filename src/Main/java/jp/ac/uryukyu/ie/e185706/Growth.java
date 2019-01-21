package jp.ac.uryukyu.ie.e185706;

public class Growth {

    private boolean Life = false;

    private ChoiceCount cc;
    private Creature ct;
    private int growLevel = 0;

    /**
     *
     * Growth -エモジの育成過程に関するクラス
     * Life,growLevelは共に分岐過程で必要になった変数
     * ccで選択肢の回数を取得しctでエモジの名前を取得している
     *
     */


    public void setCt(Creature ct) {
        this.ct = ct;
    }
    public boolean isLife() {
        return Life;
    }

    /**
     *
     * コンストラクタ
     * このクラスで使用するためのChoiceCount変数を取得するためのメソッド
     *
     * @param cc プレイヤーの選択肢が保存されている
     *
     */

    public Growth(ChoiceCount cc){
        this.cc = cc;
    }


    /**
     *
     * 一定数エモジを育てると成長を知らせるメソッド
     *
     */


    public void GrowthPrint(){

        if( cc.getCount("1") > 2 && cc.getCount("2") > 2 &&cc.getCount("3") > 1){

            System.out.println("\n\n\n△　おめでとう！" +"《" + ct.getName() +"》" + "は進化した！");
            System.out.println("\n"+
                    "    ∩  ∩      \n"+
                    "　( ・ω・ )ノ　＜今日から自由だ！\n"+
                    "    |  |     "+
                    "\n");
            this.Life = true;

        }
        if (growLevel == 0){

            if(cc.getCount("1") > 1 &&cc.getCount("2") > 1) {

            System.out.println("\n\n\n△　おめでとう！" +"《" + ct.getName() +"》" + "は進化した！");
            System.out.println("\n" +
                    "    ∩  ∩      \n" +
                    "　( ・ω・ )ノ　＜お世話してくれてありがとう！\n" +
                    "\n");

            this.growLevel = 1 ;

            }
        }
    }
}
