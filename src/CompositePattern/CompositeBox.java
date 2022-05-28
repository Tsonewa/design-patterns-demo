package CompositePattern;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box {

    private List<Box> innerBoxes = new ArrayList<Box>();

    public CompositeBox(Box... boxes) {
        innerBoxes.addAll(Arrays.asList(boxes));
    }

    @Override
    public double totalPrice() {
        return innerBoxes.stream().mapToDouble(Box::totalPrice).sum();
    }
}
