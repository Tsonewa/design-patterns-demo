package StatePattern;

public class StatePattern {

    public static void main(String[] args) {

        Canvas canvas = new Canvas(new Eraser());

        canvas.getCurrentTool().mouseDown();
        canvas.getCurrentTool().mouseUp();
    }
}
