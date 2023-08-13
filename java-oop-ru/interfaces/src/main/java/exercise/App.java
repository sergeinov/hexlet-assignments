package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {

    public static List<String> buildApartmentsList(List<Home> homes, int countReturnedElements) {
        return homes.stream()
                .sorted(Comparator.comparingDouble(home -> {
                    if (home instanceof Flat) {
                        return home.getArea();
                    } else if (home instanceof Cottage) {
                        return home.getArea();
                    }
                    return 0.0;
                }))
                .limit(countReturnedElements)
                .map(home -> {
                    if (home instanceof Flat flat) {
                        return "Квартира площадью " + flat.getArea() + " метров на " + flat.getFloor() + " этаже";
                    } else if (home instanceof Cottage cottage) {
                        return cottage.getFloor() + " этажный коттедж площадью " + cottage.getArea() + " метров";
                    }
                    return "";
                })
                .collect(Collectors.toList());
    }
}
// END
