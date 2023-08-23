import java.io.FileNotFoundException;
import java.util.List;

public interface CityMethods {
    List<City> readFile() throws FileNotFoundException;

    void printAllCities(List<City> cities);

    void groupByRegion(List<City> cities) throws FileNotFoundException;

    void searchByName(String name) throws FileNotFoundException;
}
