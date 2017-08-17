package nickw;

public class two {
    public static void main(String[] agrs) {
            for (int i = 1; i < 7; i++) {
                for (int j = 1; j < 7; j++) {
                    if (i==j){continue;}
                    for (int k = 1; k < 7; k++) {
                        for (int l = 1; l < 7; l++) {
                          if (k==l || k==i || k==j ||i==l || j==l){continue;}
                                System.out.printf("%d%d%d%d\n", i, j, k, l);
                            }
                        }
                    }
                }
            }
        }
