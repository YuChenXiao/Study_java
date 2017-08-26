package homeword;

public class Factory {
    public static Product getProduct(){
        System.out.printf("Do something");
        return new Product();
    }
}
