import callbacks.ConsumerCallback;
import callbacks.FunctionCallback;
import streamHandler.StreamFilter;

public class ApplicationDriver {

    public ApplicationDriver() {
    }

    public void run(){

        ConsumerCallback cc = new ConsumerCallback();

        // Uppgift 1a
        cc.processString("touppercase", (s) -> System.out.println(s.toUpperCase()));
        // alt style for just out print
        //cc.processString("nottouppercase", System.out::println );

        // Uppgift 1b
        cc.numberOfChars("howManyChars", (s) -> {
            System.out.println("Number of chars: " + s.length());
        });

        //cc.numberOfChars("InUpperCase", (i) -> System.out.println(i));

        // Uppgift 2
        FunctionCallback fc = new FunctionCallback();
        int number = 6;

        // expression lambda
        fc.twoTimesNumber(number, (i) -> i * 2);

        // statement lambda
//        fc.twoTimesNumber(number, (i) -> {
//            return i * 2;
//        });

        //2b
        fc.powerOfTwo(number, (i) -> i * i );
        //2c
        fc.addTTenToNumber(number, (i) -> i + 10);

        // Uppgift 3
        StreamFilter sf = new StreamFilter();
        sf.filterEvenAddFive();

        // Uppgift 4
        sf.filterAndSortPersons();

        // Uppgift 5
        sf.calculateTotalSum();
        sf.findMaximumPrice();

        // () -> {      }
    }
}
