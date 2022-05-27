package AbstractFactoryPattern;

public class AbstractFactoryPattern {

    public static void main(String[] args) {

        Factory factory = new AsusManufacturer();
        factory.assembleGpu();
        factory.assembleMonitor();

        Factory msiFactory = new MsiManufacturer();
        msiFactory.assembleGpu();
        msiFactory.assembleMonitor();

    }
}
