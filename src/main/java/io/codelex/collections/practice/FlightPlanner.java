package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset CHARSET = Charset.defaultCharset();
    private static final String FILE = "/collections/flights.txt";
    private static final Map<String, List<String>> FLIGHTS = new LinkedHashMap<>();
    private static final List<String> ROUTE = new ArrayList<>();


    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner input = new Scanner(System.in);
        getFlights();
        System.out.println("What would you like to do: ");
        System.out.println("To display list of cities press 1");
        System.out.println("To exit program press #");
        boolean outerLoop = true;
        while (outerLoop) {
            String choice = input.nextLine();
            if (choice.equals("#")) {
                break;
            } else if (!choice.equals("1")) {
                System.out.println("Try again!");
            } else {
                getCityList().forEach(System.out::println);
                System.out.println("Select city you want to fly from: ");
                String startCity = input.nextLine();
                String currentCity = startCity;
                if (!getCityList().contains(currentCity)) {
                    System.out.println("Try again!");
                } else {
                    FLIGHTS.get(currentCity).forEach(System.out::println);
                    ROUTE.add(currentCity);
                    while (true) {
                        System.out.println("Enter City you want to go to: ");
                        String nextCity = input.nextLine();
                        if (!FLIGHTS.get(currentCity).contains(nextCity)) {
                            System.out.println("Try again!");
                        } else {
                            if (startCity.equals(nextCity)) {
                                ROUTE.add(nextCity);
                                ROUTE.forEach(System.out::println);
                                outerLoop = false;
                                break;
                            }
                            FLIGHTS.get(nextCity).forEach(System.out::println);
                            ROUTE.add(nextCity);
                            currentCity = nextCity;
                        }
                    }
                }
            }
        }
    }

    private static void getFlights() throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(FILE).toURI());
        List<String> text = Files.readAllLines(path, CHARSET);

        for (String lines : text) {
            String[] splitText = lines.split("\\->");
            String fromCity = splitText[0].trim();
            String toCity = splitText[1].trim();
            FLIGHTS.computeIfAbsent(fromCity, d -> new ArrayList<>()).add(toCity);
        }
    }

    private static Set<String> getCityList() {
        return FLIGHTS.keySet();
    }
    
}
