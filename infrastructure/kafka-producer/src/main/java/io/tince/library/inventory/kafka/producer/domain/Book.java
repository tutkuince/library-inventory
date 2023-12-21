package io.tince.library.inventory.kafka.producer.domain;

public record Book(
        Integer bookId,
        String bookName,
        String bookAuthor
) {
}
