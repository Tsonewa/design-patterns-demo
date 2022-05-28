package FilterPattern;

import java.util.List;
import java.util.stream.Collectors;

public class IBM implements Criteria{
    @Override
    public List<Laptop> meets(List<Laptop> laptops) {
        return laptops.stream().filter(l -> l.getHardDisk().equalsIgnoreCase("IBM")).collect(Collectors.toList());
    }
}
