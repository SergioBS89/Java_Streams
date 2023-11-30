package api_stream;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class GenerateStream {
    public static void main(String[] args) {

        /**
         * Using the method generate to print hello world each 2 seconds 10 times
         */
        Stream.generate(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello world!";
        })
                .limit(10)
                .forEach(System.out::println);

        /**
         * Using generate and Atomic Integer to count 1 minute
         */
        AtomicInteger counter = new AtomicInteger();
        counter.set(60);
        Stream.generate(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return counter.decrementAndGet();
        })
                .limit(60)
                .forEach(System.out::println);
    }
}
