package over;

public class overlo {
    public static void main(String[] args) {
        overlo p = new overlo();

        System.out.println(p.fbi(8,2));
        System.out.println(p.fbi(2,4,2,2));
    }

    public int fbi(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int fbi(int q,int w) {
        return q + w ;
    }

}