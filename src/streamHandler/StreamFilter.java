package streamHandler;

import Resources.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamFilter {

    public void filterEvenAddFive(){

        List<Integer> intList = new ArrayList<>( List.of(6,16,155,555,-56));

        // intermediate operations
        // explicitly nondeterministic (? can result in different outcomes for different streams)

        System.out.println("\nUppgift 3.\nFiltrera ut jämna tal och addera med 5: ");
        intList.stream().filter( (i) -> (i % 2) == 0 ).map( (x) -> {x += 5; return x; }).forEach(System.out::println);
    }

    public void filterAndSortPersons(){

        List<Person> pList = new ArrayList<>(List.of( new Person("Max", 222),
                new Person("Matilda", 21),
                new Person("Per",44),
                new Person("Bob", 5)
                ));

        //  The ordered collections store their elements in the order in which they are inserted
        //  i.e. it maintains the insertion order of elements.
        //  Whereas, the unordered collections such as Map and Set do not maintain any order

        System.out.println("\nUppgift 4.\nFiltrera och sortera personer: ");

        pList.stream().filter( (p) -> p.getAge() > 18 ).sorted( (o1, o2) -> {

                        return Integer.compare( o1.getAge(), o2.getAge());
                    })
                .map(Person::getName)
                .forEach(System.out::println);

                // lambda replaced with method reference Person::getName

    }

    public  void calculateTotalSum(){

        List<Double> listWithPrices = new ArrayList<>(List.of( 99.90, 199.90, 0.20 ));


        Double sum = listWithPrices.stream()
                .reduce(0.0, (total, element) -> total + element);

        System.out.println("\nUppgift 5");
        System.out.printf("Price sum is: %.2f%n", sum);
    }

    public  void findMaximumPrice(){

        List<Double> listWithPrices = new ArrayList<>(List.of( 299.90, 199.90, 0.20 ));


        Double max = listWithPrices.stream().reduce(Double::max).orElse(0.0);

        System.out.printf("Maximum price is: %.2f%n", max);
    }
}
