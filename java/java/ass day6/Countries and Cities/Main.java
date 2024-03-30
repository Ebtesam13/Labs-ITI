import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating sample data
        ArrayList<Country> countries = new ArrayList<>();
        ArrayList<City> cities = new ArrayList<>();

        countries.add(new Country("ABW", "Aruba", "North America", 103000, 193, 828, 129));
        countries.add(new Country("AFG", "Afghanistan", "Asia", 22720000, 652090, 5976, 1));
        countries.add(new Country("AGO", "Angola", "Africa", 12878000, 1246700, 6648, 56));
        countries.add(new Country("AIA", "Anguilla", "North America", 8000, 96, 63.2, 62));
        countries.add(new Country("ALB", "Albania", "Europe", 3401200, 28748, 3205, 34));

        cities.add(new City(1, "Kabul", 1780000, "AFG"));
        cities.add(new City(2, "Qandahar", 237500, "AFG"));
        cities.add(new City(3, "Herat", 186800, "AFG"));
        cities.add(new City(4, "Mazar-e-Sharif", 127800, "AFG"));
        cities.add(new City(5, "Amsterdam", 731200, "NLD"));
        // Add more sample data...

        
        Map<String, City> highestPopulatedCities = new HashMap<>();
        for (City city : cities) {
            String countryCode = city.getCountryCode();
            if (!highestPopulatedCities.containsKey(countryCode) ||
                city.getPopulation() > highestPopulatedCities.get(countryCode).getPopulation()) {
                highestPopulatedCities.put(countryCode, city);
            }
        }
        System.out.println("Highest Populated Cities:");
        highestPopulatedCities.forEach((countryCode, city) ->
                System.out.println("Country: " + countryCode + ", City: " + city.getName() +
                        ", Population: " + city.getPopulation()));

        
        Map<String, Country> mostPopulatedCountries = new HashMap<>();
        for (Country country : countries) {
            String continent = country.getContinent();
            if (!mostPopulatedCountries.containsKey(continent) ||
                country.getPopulation() > mostPopulatedCountries.get(continent).getPopulation()) {
                mostPopulatedCountries.put(continent, country);
            }
        }
        System.out.println("\nMost Populated Countries by Continent:");
        mostPopulatedCountries.forEach((continent, country) ->
                System.out.println("Continent: " + continent + ", Country: " + country.getName() +
                        ", Population: " + country.getPopulation()));

        
        City highestPopulatedCapital = null;
        for (City city : cities) {
            if (city.getId() == 1 && (highestPopulatedCapital == null ||
                city.getPopulation() > highestPopulatedCapital.getPopulation())) {
                highestPopulatedCapital = city;
            }
        }
        System.out.println("\nHighest Populated Capital City:");
        if (highestPopulatedCapital != null) {
            System.out.println("City: " + highestPopulatedCapital.getName() +
                    ", Population: " + highestPopulatedCapital.getPopulation());
        }
    }
}
