package factoryMethod;

public class VIVOFactory implements PhoneFactory{
    @Override
    public Phone createPhone() {
        return new VIVOPhone();
    }
}
