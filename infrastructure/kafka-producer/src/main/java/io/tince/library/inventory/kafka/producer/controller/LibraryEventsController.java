package io.tince.library.inventory.kafka.producer.controller;

import io.tince.library.inventory.kafka.producer.domain.LibraryEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1")
public class LibraryEventsController {

    @PostMapping("/libraryevent")
    public ResponseEntity<LibraryEvent> postLibraryEvent(@RequestBody LibraryEvent libraryEvent) {
        log.info("libraryEvent: {}", libraryEvent);
        // invoke the kafka producer

        return ResponseEntity.status(HttpStatus.CREATED).body(libraryEvent);
    }
}
