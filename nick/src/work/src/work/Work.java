package work;

public class Work {
    public static void main(String[] args){
        Person i = new Person();
        Dog d = new Dog();
        d.name ="來西";
        i.name="Nick";
        System.out.print(i.name +"和"+d.name);
        System.out.print(d.run()+i.run());



    }
}
