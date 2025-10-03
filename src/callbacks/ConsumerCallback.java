package callbacks;

import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerCallback {

    public void processString(String input, Consumer<String> consumerCallback){

        consumerCallback.accept(input);
    }

    public  void numberOfChars( String input, Consumer<String> consumerCallback){

        consumerCallback.accept(input);
    }
}
