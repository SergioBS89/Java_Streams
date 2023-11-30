package api_stream;

import api_stream.classes.Car;
import api_stream.classes.CarList;

public class AnyMatcher_Count {
    public static void main(String[] args) {

        final CarList CAR_LIST = new CarList();

        /**
         * Using AnyMatch to check if exist a salesman called John
         */
        boolean existJohn = CAR_LIST.getCarList().stream()
                .map(Car::getSalesman)
                .anyMatch(john -> john.getName().equals("John"));
        System.out.println(existJohn);

        /**
         * Using Count to know how many blue cars are there
         */
        long numberBlueCars = CAR_LIST.getCarList().stream()
                .map(car -> car.getColor())
                .filter(color -> color.equals("Blue"))
                .count();
        System.out.println(numberBlueCars);
    }
}
