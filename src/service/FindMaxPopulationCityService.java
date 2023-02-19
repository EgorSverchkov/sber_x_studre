package service;

import model.City;

import java.util.List;

public class FindMaxPopulationCityService {
    public static String findMax(List<City> citiesList){
        City[] citiesArray = new City[citiesList.size()];
        citiesList.toArray(citiesArray);

        Integer maxNumOfPopulation = 0;
        int position = 0;
        for(int count = 0; count < citiesArray.length ; count++){
            if(maxNumOfPopulation < citiesArray[count].getPopulation()){
                maxNumOfPopulation = citiesArray[count].getPopulation();
                position = count;
            }
        }
        return "[" + position + "] = " + maxNumOfPopulation;
    }
}
