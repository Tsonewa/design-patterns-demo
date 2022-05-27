package MementoPattern;

import java.util.ArrayDeque;
import java.util.Stack;

public class History {

    private ArrayDeque<WordState> states = new ArrayDeque<WordState>();

    public void push(WordState wordState){
        this.states.push(wordState);
    }

    public WordState pop(){
        System.out.println(this.states.peek().getCurrentState());
        return this.states.pop();
    }
}
