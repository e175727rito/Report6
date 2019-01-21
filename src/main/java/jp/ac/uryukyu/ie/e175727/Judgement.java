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

        if(hand_num <= 3) {

            System.out.println("player1[" + user1.getName() + "] = " + hand_num);
            System.out.println("player2[" + user2.getName() + "] = " + user2.getHand());

            if (hand_num == 1 && user2.getHand() == 2) {
                System.out.println("勝ったのは..." + user1.getName() + "です!");

            } else if (hand_num == 2 && user2.getHand() == 3) {
                System.out.println("勝ったのは..." + user1.getName() + "です！");

            } else if (hand_num == 3 && user2.getHand() == 1) {
                System.out.println("勝ったのは..." + user1.getName() + "です！");

            } else if (hand_num == user2.getHand()) {
                System.out.println("引き分けでーす!");

            } else {
                System.out.println("勝ったのは..." + user2.getName() + "です！");
            }


        }else{
            System.out.println("1~3までの数字のどれかを選んで下さい.");
        }

    }
}