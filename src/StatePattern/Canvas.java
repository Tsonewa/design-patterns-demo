package StatePattern;

public class Canvas {

    private Tool currentTool;

    public Canvas(Tool currentTool) {
        this.currentTool = currentTool;
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public Canvas setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
        return this;
    }
}
