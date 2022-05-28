package FilterPattern;

import java.util.List;
import java.util.stream.Collectors;

public class Ryzen implements Criteria{
    @Override
    public List<Laptop> meets(List<Laptop> laptops) {
        return laptops.stream().filter(l -> l.getHardDisk().equals("Ryzen")).collect(Collectors.toList());
    }
}
