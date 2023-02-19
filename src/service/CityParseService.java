package service;

import model.City;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityParseService {

    public static List<City> getCities(){
        List<City> cities = new ArrayList<>();
        try{
            Scanner cityScanner = new Scanner
                    (new File("/Users/egorsverchkov/IdeaProjects/sber/src/resourses/city_ru.csv"));
            while (cityScanner.hasNextLine()){
                cities.add(parseLine(cityScanner.nextLine()));
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return cities;
    }

    public static City parseLine(String cityLine){
        Scanner scanner = new Scanner(cityLine);
        scanner.useDelimiter(";");
        City city = new City();
        scanner.next();
        city.setName(scanner.next());
        city.setRegion(scanner.next());
        city.setDistrict(scanner.next());
        city.setPopulation(scanner.nextInt());
        if(scanner.hasNext()){
            city.setFoundation(scanner.next());
        }
        return city;
    }
}
