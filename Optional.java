package api_stream;

import api_stream.classes.Car;
import api_stream.classes.CarList;

public class Optional {
    public static void main(String[] args) {
        /*The purpose of Optional in Java is to provide a more structured way to handle situations where a value might be absent,
         then mitigating the risk of NullPointerExceptions. Introduced in Java 8, Optional is a container object that may or may not contain a non-null value.*/

        final CarList CAR_LIST = new CarList();

        java.util.Optional<String> cheaperBrand = CAR_LIST.getCarList().stream()
                .filter(price -> price.getPrice() < 5000)
                .findFirst()
                .map(Car::getBrand);
        //Ways to manage Optional results
        System.out.println(cheaperBrand.orElse("Not exist a brand cheaper than 5000"));
        System.out.println(cheaperBrand.map("Brand car cheap: "::concat).orElse("Not exist a brand cheaper than 5000"));
        System.out.println(cheaperBrand.isEmpty() ? "Not exist a car with that price" : "What a crap...");
        System.out.println(cheaperBrand.isPresent() ? "What a crap..." : "Not exist a car with that price");
    }
}
