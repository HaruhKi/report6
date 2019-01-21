package jp.ac.uryukyu.ie.e185706;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ChoiceCountTest {

    @Test
    void choiceCountSet() {

        Map<String, Integer> map = new HashMap<>(){
            {
                put("1",2);
                put("2",1);
                put("3",1);

            }
        };

        ChoiceCount cc = new ChoiceCount();
        cc.ChoiceCountSet("1");
        cc.ChoiceCountSet("1");
        cc.ChoiceCountSet("2");
        cc.ChoiceCountSet("3");

        assertEquals(map.get("1"),cc.getCount("1"));

    }
}