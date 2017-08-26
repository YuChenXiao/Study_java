package Testt;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args){
        String str1 = "test1";
        String str2 = "test2";
        String str3 = "test3";
        String str4 = "test4";

        List<String>list = new ArrayList<String>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);

        //刪除一個值
        //list.remove(test2);
        //單純娶一個值
        //System.out.println(list.get(2));↓
        //依序取值
        for (String s : list){
            System.out.println(s);
        }
    }
}