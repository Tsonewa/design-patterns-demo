package AbstractFactoryPattern;

public class MsiManufacturer extends Factory{

    @Override
    public Cpu createGpu() {
        return new MsiCpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
