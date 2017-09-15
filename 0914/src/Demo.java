import com.sun.xml.internal.fastinfoset.util.QualifiedNameArray;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        int i, qa = 0, qb = 0, k, j, correct, x = 0, sum = 0, xb;
        Scanner scanner = new Scanner(System.in);
        do {
            correct = 0;
            System.out.print("請問要出幾題?");
            x = scanner.nextInt();
            for (i = 1; i <= x; i++) {
                qa = (int) (Math.random() * 10);
                qb = (int) (Math.random() * 10);
                System.out.print(qa + "+" + qb + "=");
                k = scanner.nextInt();
                j = qa + qb;
                if (k == j) {
                    System.out.println("答對了!!");
                    correct = correct + 1;
                } else {
                    do {
                        System.out.println("答錯了");
                        System.out.print(qa + "+" + qb + "=");
                        k = scanner.nextInt();
                    } while (j != k);
                }
            }
                sum = 100 / x * correct;
                System.out.println("分數為" + sum);

                System.out.println("還要再一次嗎? (1)要 (2)不要");
                xb = scanner.nextInt();
        }while (xb == 1) ;
    }
}