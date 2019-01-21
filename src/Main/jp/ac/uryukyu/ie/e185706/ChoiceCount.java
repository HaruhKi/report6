package jp.ac.uryukyu.ie.e185706;

import java.util.HashMap;
import java.util.Map;

public class ChoiceCount {


    private Map<String, Integer> count;

    public ChoiceCount(){

        this.count = new HashMap<>(){
            {
                put("1",0);
                put("2",0);
                put("3",0);

            }
        };
    }

    public void ChoiceCountSet(String choiceWord) {

        switch (choiceWord){
            case "1":
                System.out.println("　( ・ω・ )つ-□-▷○　＜おいしい！　");
                this.count.put("1", this.count.get("1")+1);
                break;
            case "2":
                System.out.println("　（　　・ω）y-o0０OＯ○(シャボン玉)");

                this.count.put("2", this.count.get("2")+1);;
                break;
            case "3":
                System.out.println("　zzz...（¦[▓▓]）　");
                this.count.put("3", this.count.get("3")+1);
                break;
            default:
                System.out.println("半角数字で選択肢から選ぼう");
                break;

        }
    }


    public int getCount(String key){return this.count.get(key); }

}