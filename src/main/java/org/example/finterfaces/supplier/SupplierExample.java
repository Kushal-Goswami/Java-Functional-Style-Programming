package org.example.finterfaces.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<String>supplierString=() -> "Hello";

        String string = supplierString.get();
        System.out.println(string);

        Supplier<LocalDateTime>localDateTimeSupplier = () -> LocalDateTime.now();

        LocalDateTime currentDateTime = localDateTimeSupplier.get();
        System.out.println(currentDateTime);
    }
}
