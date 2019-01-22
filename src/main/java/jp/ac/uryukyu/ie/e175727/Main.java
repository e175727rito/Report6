package jp.ac.uryukyu.ie.e175727;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player user = new Player();
        Player cpu = new Player();
        Judgement judge = new Judgement();

        user.setName("あなた");
        cpu.setName("コンピュータ");

        int count = 0;
        while (true) {
            System.out.println("じゃんけんをしましょう!\nじゃんけんで出す手を番号で選んで下さい!\n1.グー\n2.チョキ\n3.パー");
            cpu.play();

            judge.select(user,cpu);
            judge.judgement(user, cpu);

            System.out.println("続ける場合は1を終了する場合は2を押して下さい.");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            count++;

            if (num == 2) {
                break;
            }
        }
        System.out.println("今回は" + count + "回対戦しました.");

    }
}