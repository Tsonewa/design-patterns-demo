package AbstractFactoryPattern;

public class MsiCpu implements Cpu{

    @Override
    public void assemble() {
        System.out.println("Produce MSI cpu");
    }
}
