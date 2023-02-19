package service;

import model.City;

import java.util.Comparator;
import java.util.List;

public class CitySortService {
    public static List<City> sortCityByName(List<City> citiesBeforeSort){
        citiesBeforeSort.sort((((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()))));
        return citiesBeforeSort;
    }

    public static List<City> sortCityByDistrictAndName(List<City> citiesBeforeSort){
        citiesBeforeSort.sort(Comparator
                .comparing(City::getDistrict)
                .thenComparing(City::getName));
        return citiesBeforeSort;
    }
}
