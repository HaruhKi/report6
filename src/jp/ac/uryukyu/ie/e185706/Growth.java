package jp.ac.uryukyu.ie.e185706;

public class Growth {

    private boolean Life;
    private ChoiceCount cc;

    public Growth(ChoiceCount cc, boolean Life){
        this.Life = Life;
        this.cc = cc;
    }

    public void GrowthPrint(){

        if(cc.getCount("A")== 2 && cc.getCount("B")== 1){

            System.out.println("\n"+
                    "~~~~~~~~~~~~~~~\n"+
                    "　　  ∧___∧\n" +
                    "　　 ( ˘ω˘ )　　\n" +
                    "　 　|　⊃ ⊃\n" +
                    "　　 └-⊃～⊃\n" +
                    "　　　\n" +
                    "　　　｜｜　　　　　　　　\n" +
                    "　 ＿ _　　／(＿＿_\n" +
                    "／　 (＿＿＿_／　／"+"\n" +
                    "~~~~~~~~~~~~~~~");
        }



    }


}
