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
            System.out.print("�в");
            q = scanner.nextInt();
            if (q > ans)
            {
                System.out.println("�Ӥj�F");
            }
            else if (q < ans)
            {
                System.out.println("�Ӥp�F");
            }
            else
            {
                System.out.println("����F");
            }    
        } while (q != ans);
        
            
    }
    
}
