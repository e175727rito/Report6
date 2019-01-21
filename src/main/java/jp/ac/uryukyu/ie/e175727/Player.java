package jp.ac.uryukyu.ie.e175727;

public class Player {
    private String name;
    private int hand;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHand(){
        return hand;
    }

    public void setHand(int hand){
        this.hand = hand;
    }

    public int play(){
        hand = (int)(Math.random()*3)+1;
        return hand;
    }
}
