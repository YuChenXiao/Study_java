/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t091206;

import java.util.Scanner;

/**
 *
 * @author 305_15
 */
public class T091206 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        int sun = 0;
        int j;
        System.out.println("請問你要加幾次");
        Scanner scanner = new Scanner(System.in);
        j = scanner.nextInt();
       
        for(i=1;i<=j;i++){
            sun = sun+i;
        }System.out.println("1+2+3+4+...+"+ j +"="+sun);
    }}
       