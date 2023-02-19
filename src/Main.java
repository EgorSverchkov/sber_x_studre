import model.City;
import service.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<City> cities = CityParseService.getCities();
        long start = System.currentTimeMillis();
        //1 задние
        //cities.forEach(System.out::println);

        //2 задание
        //CitySortService.sortCityByName(cities).forEach(System.out::println);
        //CitySortService.sortCityByDistrictAndName(cities).forEach(System.out::println);

        //3 задание
        //System.out.println(FindMaxPopulationCityService.findMax(cities));
        
        //4 задание
        FindRegionCountService.find(cities);
        System.out.println(System.currentTimeMillis() - start);
    }
}