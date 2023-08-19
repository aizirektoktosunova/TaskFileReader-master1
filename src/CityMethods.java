import java.util.List;

public interface CityMethods {
    List<City> readFile();

    void printAllCities(List<City> cities);

    void groupByRegion(List<City> cities);

    void searchByName(String name);
}
