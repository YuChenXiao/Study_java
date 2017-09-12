/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t091204;

import java.util.Scanner;

/**
 *
 * @author 305Teacher
 */
public class T091204 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int q;
        int ans = (int)(Math.random() * 10);
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.print("請猜一個數字:");        
            q = scanner.nextInt();
            if (q > ans)
            {
                System.out.println("太大了");
            }
            else if (q < ans)
            {
                System.out.println("太小了");
            }
            else
            {
                System.out.println("答對了");
            }    
        } while (q != ans);
        
            
    }
    
}
