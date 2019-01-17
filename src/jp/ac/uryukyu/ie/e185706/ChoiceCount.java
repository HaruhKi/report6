package jp.ac.uryukyu.ie.e185706;

public class ChoiceCount {

    private static int Acount = 0;
    private static int Bcount = 0;
    private static int Ccount = 0;

    public ChoiceCount(String choiceWord) {

        switch (choiceWord){
            case "a":
                System.out.println("^・ω・^ << a");
                Acount++;
                break;
            case "b":
                System.out.println("^・ω・^ << b");
                Bcount++;
                break;
            case "c":
                System.out.println("^・ω・^ << c!");
                Ccount++;
                break;

        }
    }

    public static int getAcount(){
        return Acount;
    }


    public static int getBcount(){
        return Bcount;
    }


    public static int getCcount(){
        return Ccount;
    }

}
