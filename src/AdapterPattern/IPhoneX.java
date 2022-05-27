package AdapterPattern;

public class IPhoneX implements IPhone{

    @Override
    public void charge() {
        System.out.println("Charge IPhoneX");
    }
}
