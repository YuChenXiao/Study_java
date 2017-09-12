/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t091202;

import java.util.Scanner;

/**
 *
 * @author 305_15
 */
public class T091202 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //印出字元
       char a = 'f';
       System.out.println(a);
       
       int score;
       Scanner scanner = new Scanner(System.in);
       System.out.println("請輸入成績:");
       score = scanner.nextInt();
       if( score >60 )
       {
           System.out.println("及格");
       }
       else if (score == 60)
       {
           System.out.println("低空飛過");
       }
       else 
       {
           System.out.println("不及格");
         
       }
       
       
    }
    
}
