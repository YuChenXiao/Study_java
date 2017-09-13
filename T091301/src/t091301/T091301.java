/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t091301;

public class T091301{
    public static void main(String[] args) {
       int i,j,k;
        for(i=1;i<=9;i++)
        {
            for(j=2;j<=9;j++)
            {
           k = i* j;
        System.out.print(j +"x"+ i + "=" + k +"\t");
    }
            System.out.println();
        }
}
}