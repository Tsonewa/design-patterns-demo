package FilterPattern;

import java.util.List;
import java.util.stream.Collectors;

public class i5Processor implements Criteria{
    @Override
    public List<Laptop> meets(List<Laptop> laptops) {
        return laptops.stream().filter(l -> l.getProcessor().equals("i5")).collect(Collectors.toList());
    }
}
