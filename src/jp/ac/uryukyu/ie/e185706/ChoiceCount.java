package jp.ac.uryukyu.ie.e185706;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ChoiceCount {


    private Map<String, Integer> count;

    public ChoiceCount(){

        this.count = new HashMap<>(){
            {
                put("A",0);
                put("B",0);
                put("C",0);

            }
        };


    }

    public ChoiceCount(String choiceWord) {

        switch (choiceWord){
            case "a":
                System.out.println("^・ω・^ << a");
                this.count.put("A", this.count.get("A")+1);
                break;
            case "b":
                System.out.println(

                        "  　　 ∧＿∧ \n" +
                        "　　　(´･ω･) \n" +
                        "　　　(　つ┳⊃ \n" +
                        "　　　ε(_)へ⌒ヽﾌ \n" +
                        "　　 (　　(〃･з･) \n" +
                        "≡≡　◎―◎ ⊃ ⊃");

                this.count.put("B", this.count.get("B")+1);;
                break;
            case "c":
                System.out.println("^・ω・^ << c!");
                this.count.put("C", this.count.get("C")+1);
                break;

        }
    }


    public int getCount(String key){return this.count.get(key); }

    public Set<String> getCountKeys(){ return this.count.keySet();}

}
