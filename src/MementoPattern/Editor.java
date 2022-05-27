package MementoPattern;

public class Editor {

    private String content;

    public WordState createState(){
        return new WordState(content);
    }

    public void restore(WordState wordState){
        content = wordState.getCurrentState();
    }

    public Editor(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Editor setContent(String content) {
        this.content = content;
        return this;
    }
}
