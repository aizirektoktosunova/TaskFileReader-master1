import java.io.FileReader;
import java.util.Scanner;

// TODO: 19.08.2023
//  надо создать класс City с полями:
//  ID, NAME, REGION, DISTRICT, POPULATION, FOUNDATION.
//  Класс должен отвечать принципу инкапсуляции и иметь метод toString().
public class City {
    private int id;
    private String name;
    private String region;
    private String district; //район
    private int population;  //население
    private String foundation; //основание


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String NAME) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String DISTRICT) {
        this.district = DISTRICT;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int POPULATION) {
        this.population = POPULATION;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String FOUNDATION) {
        this.foundation = FOUNDATION;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation=" + foundation +
                '}';

    }
}
