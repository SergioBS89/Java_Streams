package api_stream;

import api_stream.classes.BankEmployee;
import api_stream.classes.Car;
import api_stream.classes.CarList;
import java.util.Comparator;
import java.util.Optional;

public class FlatMap {
    public static void main(String[] args) {

        final CarList CAR_LIST = new CarList();

        /**
         * Using Flap Map to change the flux, returning a car for the bankemployee with more experience years
         */
        Optional<Car> moreExp = CAR_LIST.getCarList().stream()
                .map(Car::getBankEmployee)
                .max(Comparator.comparingInt(BankEmployee::getExperienceYears))
                .flatMap(maxExp -> {
                    System.out.println(maxExp.getName());
                    System.out.println(maxExp.getLastName());
                    Car owner = new Car(maxExp.getName().concat(" ").concat(maxExp.getLastName()));
                    return Optional.of(owner);
                });
        moreExp.ifPresent(car -> System.out.println("This car is a present for the worker with more experience" + car));
    }
}
