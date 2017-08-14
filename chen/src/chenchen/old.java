package chenchen;

import java.util.Calendar;

public class old {
    public static void main(String[] args) {
        int cold = 21;
        int reold = 65;

        Calendar calendar = Calendar.getInstance();
        int cyear = calendar.get(Calendar.YEAR);

        int reyear = (reold - cold) + cyear;

        System.out.println(reyear);


    }

}
