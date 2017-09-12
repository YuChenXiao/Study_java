/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t091203;

import java.util.Scanner;

/**
 *
 * @author 305_15
 */
public class T091203 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
     
    int q;
    Scanner scanner = new Scanner(System.in);
    do
    {
        System.out.println("猜猜看一個數字:");
        q = scanner.nextInt();
    if (q>8) 
    {
        System.out.println("太小了");
    }
    else if(q<8)
    {
        System.out.println("太大了");
    }
    else 
    {
        System.out.println("答對了");
    }
    }while ( q != 8);
       
    }
    }

