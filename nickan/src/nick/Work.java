package nick;

public class Work  {
    public static void main(String[] args){
        Animal i = new Animal("來西");
        Animal j = new Animal("nick");

        System.out.print( i.name+"和"+j.name);

        System.out.print(j.run()+i.run());
    }
}
