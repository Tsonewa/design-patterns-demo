package AbstractFactoryPattern;

public class AsusCpu implements Cpu{

    @Override
    public void assemble() {
        System.out.println("Create Asus Cpu");
    }
}
