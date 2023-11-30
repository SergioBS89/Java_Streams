package api_stream;

import api_stream.classes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {

        final CarList CAR_LIST = new CarList();

        List<String> names = new ArrayList<>();
        names.add("Luke Skywalker");
        names.add("Leia Morgana");
        names.add("Han Solo");
        names.add("Obi Kenoby");
        names.add("Darth Vader");

        /*
          Using Map to put all the names in UpperCase
         */
        List<String> starwarsToUpperCase = names.stream()
                .peek(System.out::println) //Print the list of names in lowercase
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        starwarsToUpperCase.forEach(System.out::println);

        /*
        Using Map to generate new objects of user from an array names
         */
        Random random = new Random();
        List<User> users = names.stream()
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .collect(Collectors.toList());
        users.forEach(user -> System.out.println("New Star Wars user called: " + user.getName().concat(" ").concat(user.getSurname())));

        /**
         * Using Map to get bankEmployee list
         */
        List<BankEmployee> listEmployees = CAR_LIST.getCarList().stream()
                .map(Car::getBankEmployee)
                .collect(Collectors.toList());
        listEmployees.forEach(System.out::println);
    }
}