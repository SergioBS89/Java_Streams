package api_stream;

import api_stream.classes.BankEmployee;
import api_stream.classes.Car;
import api_stream.classes.CarList;
import api_stream.classes.Salesman;

import java.util.*;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercises {
    public static void main(String[] args) {

        final CarList CAR_LIST = new CarList();

        /**
         * Get the sum of all cars' prices
         */
        double sumPrices = CAR_LIST.getCarList().stream()
                .map(Car::getPrice)
                .reduce(0.0, Double::sum);
        System.out.println(sumPrices);

        /**
         * Sort Z-A the list of departments from salesman
         */
        CAR_LIST.getCarList().stream()
                .map(Car::getSalesman)
                .map(Salesman::getDepartment)
                .sorted(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder()))
                .forEach(System.out::println);

        /**
         * Filter cars by color white and year less than 2021
         */
        CAR_LIST.getCarList().stream()
                .filter(car -> car.getColor().equalsIgnoreCase("White"))
                .filter(year -> Integer.parseInt(year.getYear()) <= 2021)
                .forEach(System.out::println);


        /*Mapping Operations:
        Sort salesmen or bank employees by their salaries or experience.
        */
        CAR_LIST.getCarList().stream()
                .map(Car::getSalesman)
                .sorted(Comparator.comparing(sal -> sal.getSalary()))
                .flatMap(worker -> {
                    return Stream.of(worker.getName().concat("Salary: ").concat(String.valueOf(worker.getSalary())));
                })
                .distinct()
                .forEach(System.out::println);

        /*Calculate the average salary of salesmen or bank employees.*/
        double average = CAR_LIST.getCarList().stream()
                .mapToDouble(car -> car.getBankEmployee().getSalary())
                .average()
                .orElse(0.0);
        System.out.println(("Average bank employees: " + String.format("%.2f", average)).concat("$"));

        /*Use flatMap() to extract specific details from nested objects like Salesman or BankEmployee.*/
        CAR_LIST.getCarList().stream()
                .flatMap(car -> {
                    if (car.getSalesman().isActive()) {
                        return Stream.of("Salesman is active in this location: " + car.getSalesman().getAddress());
                    } else {
                        return Stream.of("Send an email to this address instead talking with the salesman: " + car.getBankEmployee().getEmail());
                    }
                })
                .forEach(System.out::println);

        /*Group cars by year.*/
        Map<String, List<Car>> carsByYear = CAR_LIST.getCarList().stream()
                .collect(Collectors.groupingBy(Car::getYear));
        carsByYear.forEach((year, listCars) -> {
            System.out.println("Cars in year " + year + ":");
            listCars.forEach(car -> System.out.println("- " + car.getBrand() + " " + car.getModel()));
        });

        /*Partition bank employees based on salary range*/
        double lowerRange = 20000.0;
        double upperRange = 40000.0;
        Map<Boolean, List<BankEmployee>> partitionedEmployees = CAR_LIST.getCarList().stream()
                .map(Car::getBankEmployee)
                .collect(Collectors.partitioningBy(employee -> employee.getSalary() >= lowerRange && employee.getSalary() <= upperRange));

        // Print employees in each partition
        System.out.println("Employees with salary in range [" + lowerRange + " - " + upperRange + "]:");
        List<BankEmployee> withinRange = partitionedEmployees.get(true);
        withinRange.forEach(employee -> System.out.println("Salary: " + employee.getSalary()));
        System.out.println("No employees in the specified range.");

        System.out.println("\nEmployees with salary out of range:");
        List<BankEmployee> outOfRange = partitionedEmployees.get(false);
        outOfRange.forEach(employee -> System.out.println("Salary: " + employee.getSalary()));

        /*Limit the number of cars displayed based on top 5 expensive cars*/
        List<Car> top5 = CAR_LIST.getCarList().stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .limit(5)
                .collect(Collectors.toList());
        top5.forEach(System.out::println);

        /*Skip the first 3 elements in the list Salesman */
        int toSkip = 10;
        AtomicInteger numberOfSalesmanToSkip = new AtomicInteger(toSkip);
        List<Salesman> filteredEmployees = CAR_LIST.getCarList().stream()
                .map(Car::getSalesman)
                .filter(employee -> numberOfSalesmanToSkip.getAndDecrement() <= 0)
                .collect(Collectors.toList());
        System.out.println("Employees after skipping the first " + toSkip + " salesman:");
        filteredEmployees.forEach(employee -> System.out.println(employee.getName()));

        /*Handling errors with Streams.*/
        Stream<Object> listCarsOk = CAR_LIST.getCarList().stream()
                .flatMap(car -> {
                    if (car.getId() <= 0) {
                        return Stream.of(car);
                    } else {
                        throw new IllegalArgumentException("Car model cannot be null");
                    }
                });
    }
}



