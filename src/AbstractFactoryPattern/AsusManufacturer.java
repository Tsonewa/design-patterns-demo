package AbstractFactoryPattern;

public class AsusManufacturer extends Factory{
    @Override
    public Cpu createGpu() {
        return new AsusCpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
