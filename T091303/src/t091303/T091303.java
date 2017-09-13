package t091303;

import java.util.Scanner;

public class T091303 {
    public static void main(String[] args) {
      int i ;
      System.out.println("請輸入成績:");
      Scanner scanner = new Scanner(System.in);
      i = scanner.nextInt();
        switch(i/10){
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.println("丙");
                break;
            case 6:
                System.out.println("丙");
                break;
            case 7:
                System.out.println("乙");
                break;
            case 8:
                System.out.println("甲");
                break;
            case 9:
            case 10:
                System.out.println("優");
                break;
          
      }
    }
    
}
