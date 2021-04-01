package factoryMethod;

public class Test {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new VIVOFactory();
        phoneFactory.createPhone();
    }
}
