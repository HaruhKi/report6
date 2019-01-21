package jp.ac.uryukyu.ie.e185706;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    public ChoiceCount(String choiceWord) {

        switch (choiceWord){
            case "1":
                System.out.println("");
                this.count.put("1", this.count.get("1")+1);
                break;
            case "2":
                System.out.println(

                        "  　　 ∧＿∧ \n" +
                        "　　　(´･ω･) \n" +
                        "　　　(　つ┳⊃ \n" +
                        "　　　ε(_)へ⌒ヽﾌ \n" +
                        "　　 (　　(〃･з･) \n" +
                        "≡≡　◎―◎ ⊃ ⊃");

                this.count.put("2", this.count.get("2")+1);;
                break;
            case "3":
                System.out.println("^・ω・^ << c!");
                this.count.put("3", this.count.get("3")+1);
                break;

        }
    }


    public int getCount(String key){return this.count.get(key); }

    public Set<String> getCountKeys(){ return this.count.keySet();}

}
