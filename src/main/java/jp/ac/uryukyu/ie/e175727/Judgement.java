package jp.ac.uryukyu.ie.e175727;
import java.util.Scanner;

public class Judgement {
    public void judgement(Player user1, Player user2) {
        Scanner sc = new Scanner(System.in);
        int hand_num = sc.nextInt();
        switch(hand_num){
            case 1:
                System.out.println("あなたはグーを選びました.");
                break;

            case 2:
                System.out.println("あなたはチョキを選びました.");
                break;

            case 3:
                System.out.println("あなたはパーを選びました.");
                break;
        }
    }
}