package FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class FilterPattern {

    public static void main(String[] args) {

    List<Laptop> laptops = new ArrayList<>(List.of(new Laptop("IBM", "i5"),
            new Laptop("Ryzen", "i5"),
            new Laptop("IBM", "i5"),
            new Laptop("Ryzen", "i7")));

        SearchCriteria searchCriteria = new SearchCriteria(new i5Processor(), new Ryzen());
        List<Laptop> filteredLaptops = searchCriteria.meets(laptops);

        System.out.println(filteredLaptops.size());
    }
}
