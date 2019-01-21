package jp.ac.uryukyu.ie.e185706;

public class Growth {

    private boolean Life = false;

    private ChoiceCount cc;
    private Creature ct;
    private int growLevel = 0;

    public void setCt(Creature ct) {
        this.ct = ct;
    }

    public Growth(ChoiceCount cc){
        this.cc = cc;
    }

    public boolean isLife() {
        return Life;
    }

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
