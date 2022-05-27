package AdapterPattern;

public class MultifunctionalAdapter implements IPhone{

    private Android android;

    public MultifunctionalAdapter(Android android) {
        this.android = android;
    }

    public Android getAndroid() {
        return android;
    }

    public MultifunctionalAdapter setAndroid(Android android) {
        this.android = android;
        return this;
    }

    @Override
    public void charge() {
       android.charge();
    }
}
