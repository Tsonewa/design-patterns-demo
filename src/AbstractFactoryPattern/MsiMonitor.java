package AbstractFactoryPattern;

public class MsiMonitor implements Monitor{
    @Override
    public void assemble() {
        System.out.println("Create MSI monitor");
    }
}
