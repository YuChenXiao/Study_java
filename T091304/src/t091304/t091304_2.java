/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t091304;

import java.util.Scanner;

/**
 *
 * @author 305_15
 */
public class t091304_2 {
//correct 答對數  sum總分 i使用者答案 ia使用者輸入題目數 t使用

    public static void main(String[] args) {
        int ia, i, ib, s, sum, t, tt, correct = 0, correctAns = 0;
        String op = " ";
        Scanner scanner = new Scanner(System.in);
        do {
            correct = 0;
            System.out.print("請問要做哪種測驗 1)加法 2)乘法 3)隨機 ?");
            t = scanner.nextInt();
            System.out.print("請問需要幾題題目:");
            ia = scanner.nextInt();

            for (s = 1; s <= ia; s++) {

                int qa = (int) (Math.random() * 10);
                int qb = (int) (Math.random() * 10);
                if (t == 3) {
                    tt = (int) (Math.random() * 2) + 1;
                } else {
                    tt = t;
                }
                switch (tt) {
                    case 1:
                        op = "+";
                        correctAns = qa + qb;
                        break;
                    case 2:
                        op = "x";
                        correctAns = qa * qb;
                        break;
                }

                System.out.print(qa + op + qb + "=");

                i = scanner.nextInt();

                if (correctAns == i) {
                    System.out.println("答對囉!");
                    correct = correct + 1;

                } else {

                    do {
                        System.out.println("答錯了!");
                        System.out.print(qa + op + qb + "=");
                        i = scanner.nextInt();
                    } while (i != correctAns);

                    System.out.println("答對囉!");
                }
            }
            sum = 100 / ia * correct;

            if (correct == ia) {
                sum = 100;
            }

            System.out.println("總分為:" + sum + "分");

            System.out.println("是否再來一次?1.(要) 2.(離開)");
            ib = scanner.nextInt();
        } while (ib == 1);
    }
}
