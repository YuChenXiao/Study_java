package homework;

import java.util.ArrayList;

import java.util.List;

public class homework {

    public static void main(String[] args){
        double dob1 =123;
        double dob2 =231;
        double dob3 =312;
        double dob4 =321;
        List<Double>list = new ArrayList<Double>();

        list.add(dob1);
        list.add(dob2);
        list.add(dob3);
        list.add(dob4);

        for (double d :list){
            //把小數點去掉+(int)
            System.out.println((int)d);
        }

    }
}
