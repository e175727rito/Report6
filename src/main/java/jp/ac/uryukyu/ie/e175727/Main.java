package jp.ac.uryukyu.ie.e175727;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player user = new Player();
        Player cpu = new Player();
        Judgement judge = new Judgement();

        int count = 0;
        while (true) {
            System.out.println("じゃんけんをしましょう!\nじゃんけんで出す手を番号で選んで下さい!\n1.グー\n2.チョキ\n3.パー");

            judge.judgement(user, cpu);
            
        }
    }
}