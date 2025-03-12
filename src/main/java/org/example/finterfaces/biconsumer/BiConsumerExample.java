package org.example.finterfaces.biconsumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        BiConsumer<String, String> credentials=(email, password) ->
                System.out.print("Email: "+email + " " + " Password: "+password);

        credentials.accept("goswa@gmail.com", "kus4587");
    }
}
