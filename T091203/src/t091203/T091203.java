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
        System.out.println("�q�q�ݤ@�ӼƦr:");
        q = scanner.nextInt();
    if (q>8) 
    {
        System.out.println("�Ӥp�F");
    }
    else if(q<8)
    {
        System.out.println("�Ӥj�F");
    }
    else 
    {
        System.out.println("����F");
    }
    }while ( q != 8);
       
    }
    }

