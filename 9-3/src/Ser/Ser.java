package Set;

import java.util.HashSet;
import java.util.Set;
public class Ser {
    public static void main(String[] args){
        Set <String> set = new HashSet<String>();
        set.add("test1");
        set.add("test2");
        set.add("test3");



        //set.remove("test2");
        for (String s: set){

            System.out.println(s);
            //下面是顯示有幾個值
            //System.out.println(set.size());
        }

    }
}
