package chenchen;

public class Person_action {

    public static void main(String args[]) {

        Person chen = new Person();
        chen.name = "宸";
        chen.age = 26;

        Person han = new Person();
        han.name = "翰";
        han.age = 25;

        System.out.println(chen.run() + "\n" + han.run());
    }

}
