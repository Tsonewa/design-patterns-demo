package MementoPattern;

import java.util.List;

public class WordState {

    private final String currentState;

    public WordState(String currentState) {
        this.currentState = currentState;
    }

    public String getCurrentState() {
        return currentState;
    }
}
