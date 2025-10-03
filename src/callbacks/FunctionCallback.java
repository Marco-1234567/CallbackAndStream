package callbacks;

import java.util.function.Function;

public class FunctionCallback {

    public void twoTimesNumber(int number, Function<Integer, Integer> functionCallback){

        System.out.println("Value before applying: " + number);
        int result = functionCallback.apply(number);
        System.out.printf("Result: Two times number is: %d%n%n", result);
    }

    public void powerOfTwo(int number, Function<Integer, Integer> functionCallback){

        System.out.println("Value before applying: " + number);
        int result = functionCallback.apply(number);
        System.out.printf("Result: Power of two is: %d%n%n", result);
    }

    public void addTTenToNumber(int number, Function<Integer, Integer> functionCallback){

        System.out.println("Value before applying: " + number);
        int result = functionCallback.apply(number);
        System.out.printf("Result: Added 10 to number: %d%n%n", result);
    }
}
