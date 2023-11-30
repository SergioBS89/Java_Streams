package api_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Luke Skywalker");
        names.add("Luke Skywalker");
        names.add("Luke Skywalker");
        names.add("Darth Vader");
        names.add("Darth Vader");
        names.add("Darth Vader");

        /**
         * Using Distinct to return non repeated names
         */
        List<String> nonRepeatNames = names.stream()
                .distinct()
                .collect(Collectors.toList());
        nonRepeatNames.forEach(System.out::println);
    }
}
