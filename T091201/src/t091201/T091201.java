/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t091201;

import java.util.Scanner;

/**
 *
 * @author 305_15
 */
public class T091201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,k,Q;
        double w;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入第一個數字:");
        i = scanner.nextInt();
        System.out.println("請輸入第二個數字:");
        j = scanner.nextInt();
        
        //float
        float s = 2.5F;
        System.out.println(s+"s");
        float f2,f3;
        f2 = 2.5F;
        f3 =s+f2;
        System.out.println(f3+"f3");
        
        w = (double)i/j;
        k = i+j;
        Q = i-j;
                
        System.out.println(w+"w");
        System.out.println(i+"i");
        System.out.println(j+"j");
        System.out.println(i+"-"+j+"=" +Q);
        System.out.println(i+ " + " +j+ " = " +k);     
        System.out.println(k+"k");
       
    }
}
//請輸入第一個數字:
//5
//2
//2.5s
//4.5f3
//2.5w
//5i
//2j
//5-2=3
//5 + 2 = 7
//7k