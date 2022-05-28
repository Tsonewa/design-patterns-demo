package FilterPattern;

import java.util.List;

public class SearchCriteria implements Criteria{

    private Criteria[] criterias;

    public SearchCriteria(Criteria... criterias) {
        this.criterias = criterias;
    }
    @Override
    public List<Laptop> meets(List<Laptop> laptops) {
        List<Laptop> filteredLaptops = laptops;

        for (Criteria criteria : criterias) {
            filteredLaptops = criteria.meets(filteredLaptops);
        }

        return filteredLaptops;
    }
}
