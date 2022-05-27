package AdapterPattern;

public class AdapterPattern {

    public static void main(String[] args) {

        IPhoneCharger iPhoneCharger = new IPhoneCharger();
        IPhone iPhoneX = new IPhoneX();
        iPhoneCharger.charge(iPhoneX);

        AndroidCharger androidCharger = new AndroidCharger();
        Android huaweiP30 = new HuaweiP30();
        androidCharger.charge(huaweiP30);

        MultifunctionalAdapter adapter = new MultifunctionalAdapter(huaweiP30);
        adapter.charge();

    }
}
