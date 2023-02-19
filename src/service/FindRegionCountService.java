package service;

import model.City;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindRegionCountService {
    private static final Integer ONE = 1;

    public static void find(List<City> citiesList){
        Map<String,Integer> result = new HashMap<>();

        citiesList.forEach(city -> {
            if(result.containsKey(city.getRegion())){
                result.put(city.getRegion(),result.get(city.getRegion()) + ONE);
            } else {
                result.put(city.getRegion(), ONE);
            }
        });

        result.forEach((region, count) -> {
            System.out.println(region + " - " + count);
        });
    }
}
