package jp.ac.uryukyu.ie.e175727;

public class Player {
    String name;
    int hand;

    public int play(){
        hand = (int)(Math.random()*3)+1;
        return hand;
    }
}
