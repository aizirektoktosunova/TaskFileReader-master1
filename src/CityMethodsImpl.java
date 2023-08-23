// TODO: 19.08.2023
//  Реализовать readFile(). Логика проста...
//  Вытащить данные из текстового файла и записать их к объекту класса City.
//  Небольшая подсказказка можно использовать метод .split() класса String.

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;


// TODO: 19.08.2023
//  После того как ты закончил предыдущий метод можешь приступить к следуещему.
//  Вся суть printAllCities() заключается в том, что надо вывести все города на консоль.
public class CityMethodsImpl implements CityMethods {
    private String name;

    public CityMethodsImpl(String name) {
        this.name = name;
    }

    @Override
    public List<City> readFile() throws FileNotFoundException {
        FileReader reader = new FileReader(name);
        Scanner scanner = new Scanner(reader);
        List<City> cities = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String words = scanner.nextLine();
            List<String> cityList = List.of(words.split(";"));
            System.out.println(cityList);
            City city = new City();
            city.setId(Integer.parseInt(cityList.get(0)));
            city.setName(cityList.get(1));
            city.setRegion(cityList.get(2));
            city.setDistrict(cityList.get(3));
            city.setPopulation(Integer.parseInt(cityList.get(4)));
            try {
                city.setFoundation((cityList.get(5)));


            } catch (ArrayIndexOutOfBoundsException a) {
                city.setFoundation(null);
            }
            cities.add(city);
        }
        return cities;
    }

    @Override
    public void printAllCities(List<City> cities) {
        for (City city : cities) {
            System.out.println(city);
        }
    }

    @Override
    public void groupByRegion(List<City> cities) throws FileNotFoundException {
        cities = new LinkedList<>(readFile());
        Map<String, Integer> hashMap = new TreeMap<>();
        int count = 0;
        for (int i = 1; i < cities.size(); i++) {
            if (!cities.get(i - 1).getRegion().equals(cities.get(i).getRegion())) {
                hashMap.put(cities.get(i - 1).getRegion(), count + 1);
                count = 0;
            } else {
                count++;
            }
        }
        for (String s : hashMap.keySet()) {
            System.out.println(s + hashMap.get(s));
        }
    }


//        System.out.println(cities.get(0).getRegion());
//        for (int i = 1; i < cities.size(); i++) {        System.out.println(" City: " +
//                " ID" + cities.get(0).getId() + "NAME=[" + cities.get(0).getName() +
//                "  DISTRICT " + cities.get(0).getDistrict() + "  POPULATION " + cities.get(0).getPopulation() +
//                "  FOUNDATION " + cities.get(0).getFoundation());
//
//            if (!cities.get(i - 1).getRegion().equals(cities.get(i).getRegion())) {
//                System.out.println(cities.get(i).getRegion());
//                System.out.println(" City: " +
//                        "ID " + cities.get(i).getId() + "NAME" + cities.get(i).getName() +
//                        "     DISTRICT " + cities.get(i).getDistrict() + " POPULATION" + cities.get(i).getPopulation() +
//                        "FOUNDATION" + cities.get(i).getFoundation());
//            } else {
//                System.out.println(" City: " +
//                        "ID" + cities.get(i).getId() + " NAME" + cities.get(i).getName() +
//                        "  DISTRICT " + cities.get(i).getDistrict() + "   POPULATION " + cities.get(i).getPopulation() +
//                        " FOUNDATION" + cities.get(i).getFoundation());
//            }
//        }


    @Override
    public void searchByName(String name) {
        List<City> cities;
        try {
            cities = readFile();
        } catch (FileNotFoundException a) {
            throw new RuntimeException(a);
        }
        for (City city : cities) {
            if (city.getName().equals(name)) {
                System.out.println(city);
            }
        }
    }
}
//        }
//        for (int i = 0; i < cities.size(); i++)
//            if (readFile().get(i).getName().equals(name)) {
//                System.out.println(readFile().get(i));
//            }
//    }
//}
