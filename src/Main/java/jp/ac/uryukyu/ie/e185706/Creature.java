package jp.ac.uryukyu.ie.e185706;

public class Creature {

    /**
     * Creature　-育てるエモジに関してのクラス
     * 今回は名前の呼び出しに利用している
     *
     * @param name 育てるエモジの名前
     *
     */

    private String name;

    /**
     *
     * Creatureクラスで使われている変数nameを設定するメソッド
     *
     * @param name 設定したいエモジの名前
     *
     */

    public Creature(String name){
        this.name = name;
    }


    /**
     *
     * Creatureクラスで使われている変数nameを取得するためのメソッド
     *
     * @return name エモジの名前
     *
     */
    public String getName() {
        return name;
    }

}
