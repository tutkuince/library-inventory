package io.tince.library.inventory.kafka.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryEventsProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryEventsProducerApplication.class, args);
    }
}
