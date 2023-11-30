package api_stream;

import api_stream.classes.Car;
import api_stream.classes.CarList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {

        final CarList CAR_LIST = new CarList();

        /**
         * Using Reduce to print workers' names with less salary
         */
        String peopleLessSalary = CAR_LIST.getCarList().stream()
                .sorted(Comparator.comparingDouble(s -> s.getSalesman().getSalary())) // Sort by salary ascending
                .peek(System.out::println)
                .limit(2) // Take the first two persons with the lowest salaries
                .map(Car::getSalesman) // Map each Person to their name
                .map(c -> c.getName().concat(" " + c.getLastName()).concat(" " + c.getSalary()))
                .reduce("People with less salary: ", (name1, name2) -> name1 + "-" + name2);
        System.out.println(peopleLessSalary);

        /**
         * Using Reduce to sum all numbers in an array
         */
        Integer[] numbers = {12, 45, 55, 34, 210};

        Integer number = Stream.of(numbers)
                .reduce(0, Integer::sum);
        System.out.println(number);
    }
}
