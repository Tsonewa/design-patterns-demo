package MementoPattern;

public class MementoPattern {

    public static void main(String[] args) {

        Editor editor = new Editor("a");
        History history = new History();
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.restore(history.pop());

    }
}
