
import java.io.IOException;

/**
 * УДАЧИ ТЕБЕ
 */
public class Main {
    public static void main(String[] args) throws IOException {
        CityMethodsImpl cityMethods = new CityMethodsImpl("city_ru.csv");
        System.out.println(cityMethods.readFile());
        cityMethods.printAllCities(cityMethods.readFile());
        cityMethods.groupByRegion(cityMethods.readFile());
        cityMethods.searchByName("Иркутская");


//        CityMethodsImpl cityMethods = new CityMethodsImpl("city.ru.csv");
//        System.out.println(cityMethods.readFile());
//       //cityMethods.printAllCities(cityMethods.readFile());
//        //cityMethods.groupByRegion(cityMethods.readFile());
//       cityMethods.searchByName("Иркутская");

//        List<City>cities=new ArrayList<>();
//        CityMethodsImpl cityMethods = new CityMethodsImpl("city_ru.csv");
//        cityMethods.readFile();
//        cityMethods.groupByRegion();
//        cities.add((City) cityMethods.readFile());
//        cityMethods.printAllCities(cities);
//        cityMethods.groupByRegion(cities);cities
    }
}

