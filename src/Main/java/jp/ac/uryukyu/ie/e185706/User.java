package jp.ac.uryukyu.ie.e185706;

public class User {

    /**
     * User　-エモジを育てるプレイヤー関してのクラス
     * 今回は名前の呼び出しに利用している
     *
     * @param name プレイヤーの名前
     *
     */
    private String username;

    /**
     *
     * Userクラスで使われている変数nameを設定するメソッド
     *
     * @param name 設定したいプレイヤーの名前
     *
     */
    public User(String name){
        this.username = name;
    }

    /**
     *
     * Userクラスで使われている変数nameを取得するためのメソッド
     *
     * @return name プレイヤーの名前
     *
     */

    public String getName() {
        return username;
    }
}
