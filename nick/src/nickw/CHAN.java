package nickw;

public class CHAN {

    //若使用private只能在本身class使用

    int age;

    void speak()
    {
        System.out.printf("你幾歲? 我"+age+"歲");
    }
}
class Demo{

    public static void main(String[] args) {
        CHAN i = new CHAN();
        i.age = 22;
        i.speak();
    }
}