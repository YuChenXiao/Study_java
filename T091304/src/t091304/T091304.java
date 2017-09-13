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
public class T091304 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j, s, g = 0;
        for (s = 1; s <= 5; s++) {

            int qa = (int) (Math.random() * 10);
            int qb = (int) (Math.random() * 10);

            System.out.print(qa + "+" + qb + "=");
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();
            j = qa + qb;
            if (i == j) {
                System.out.println("答對囉!");
                g = g + 20;

            } else {
                System.out.println("答錯了!");
            }
        }

        System.out.println("總分為:" + g + "分");
    }
}

