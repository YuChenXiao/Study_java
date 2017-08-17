package nickw;

public class one {
    public static void main(String[] agrs) {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                for (int k = 1; k < 7; k++) {
                    for (int l = 1; l < 7; l++) {
                        if (i != j && j != k && k != l && l != i && i!=k && l!=j) {
                            System.out.printf("%d%d%d%d\n", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
