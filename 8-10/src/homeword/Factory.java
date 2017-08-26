package homeword;

public class Factory {
    public static Product getProduct(){
        Product p = new Product();

        return p;
    }
    public static A getA() {
        return new A();
    }
}
