package StatePattern;

public class Brush implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Select brush icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a line");
    }
}
