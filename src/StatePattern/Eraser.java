package StatePattern;

public class Eraser implements Tool{

    @Override
    public void mouseUp() {
        System.out.println("Show eraser icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erase line");
    }
}
