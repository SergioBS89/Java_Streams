package api_stream;

import api_stream.classes.BankEmployee;
import api_stream.classes.Car;
import api_stream.classes.CarList;
import api_stream.classes.Salesman;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {

        final CarList CAR_LIST = new CarList();

        /**
         * Filtering cars by Red and Black color
         */
        List<Car> carsRedBlack = CAR_LIST.getCarList().stream()
                .filter(color -> color.getColor().equals("Red") || color.getColor().equals("Black"))
                .collect(Collectors.toList());
        carsRedBlack.forEach(System.out::println);

        /**
         * Filtering by salesman's salary over 3000
         */
        List<Salesman> salesmanWithSalary3000 = CAR_LIST.getCarList().stream()
                .map(Car::getSalesman)
                .filter(salary -> salary.getSalary() > 3000)
                .collect(Collectors.toList());
        salesmanWithSalary3000.forEach(s-> System.out.println(s.getName().concat(" " + s.getLastName()) + " " + s.getSalary()));

        /**
         * Searching the first person available and full time in BankManagement
         */
        BankEmployee employee = CAR_LIST.getCarList().stream()
                .map(Car::getBankEmployee)
                .filter(BankEmployee::isFullTime)
                .filter(BankEmployee::isActive)
                .findFirst().get();
        System.out.println(employee);
    }
}
