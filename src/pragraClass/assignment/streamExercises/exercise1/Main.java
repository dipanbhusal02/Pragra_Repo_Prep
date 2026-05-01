package pragraClass.assignment.streamExercises.exercise1;

import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        List<Book> books = List.of(
                new Book("The Great Gatsby", "Scott Fitzgerald", "FICTION", 180, 1925, true),
                new Book("1984", "George Orwell", "FICTION", 328, 1949, false),
                new Book("Dune", "Frank Herbert", "FICTION", 896, 1965, true),
                new Book("A Brief History of Time", "Arthur C. Clarke", "SCIENCE", 212, 1988, true),
                new Book("The Selfish Gene", "Arthur C. Clarke", "SCIENCE", 360, 1976, false),
                new Book("Clean Code", "Robert C. Martin", "TECHNOLOGY", 431, 2008, true),
                new Book("Refactoring", "Martin Fowler", "TECHNOLOGY", 448, 1999, false),
                new Book("Sapiens", "Harari", "HISTORY", 443, 2011, false),
                new Book("Guns Germs and Steel", "Harari", "HISTORY", 480, 1997, false)
        );

        // ─── TASK 1: Available book titles, sorted A→Z ────────────────────
        System.out.println("--- Task 1: Available Books (A→Z) ---");
        List<String> available = books.stream()
                .filter(Book::isAvailable)
                .map(Book::getTitle)
                .collect(Collectors.toList());   // keep this line
        System.out.println("hiiii");
        System.out.println(available);

        // ─── TASK 2: Distinct genres, sorted ─────────────────────────────
        System.out.println("\n--- Task 2: All Genres (distinct, sorted) ---");
        List<String> genres = books.stream()
                .map(Book::getGenre)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(genres);

        // ─── TASK 3: Top-3 longest books ─────────────────────────────────
        System.out.println("\n--- Task 3: Top 3 Longest Books ---");

        books.stream()
                .sorted(Comparator.comparing(Book::getPages).reversed())
                .limit(3)
                .forEach(b -> System.out.printf("%-20s → %d pages%n", b.getTitle(), b.getPages()));


        // ─── TASK 4: Group by genre ───────────────────────────────────────
        System.out.println("\n--- Task 4: Books by Genre ---");
        Map<String, List<Book>> byGenre = books.stream()
                .collect(Collectors.groupingBy(Book::getGenre));
        byGenre.forEach((genre, list) ->
                System.out.println(genre + " : " + list.size() + " books"));


        // ─── TASK 5: Partition by availability ───────────────────────────
        System.out.println("\n--- Task 5: Availability Partition ---");
        Map<Boolean, List<Book>> partitioned = books.stream()
                .collect(Collectors.groupingBy(Book::isAvailable));
        System.out.println("Available   : " + partitioned.get(true).size() + " books");
        System.out.println("Checked Out : " + partitioned.get(false).size() + " books");


        // ─── TASK 6: All authors joined into one string ───────────────────
        System.out.println("\n--- Task 6: All Authors (joined) ---");
        String authors = books.stream()
                .map(Book::getAuthor)
                .collect(Collectors.joining(", "));
        System.out.println(authors);
        // ─── TASK 7: Total pages of FICTION books ────────────────────────
        System.out.println("\n--- Task 7: Total pages in FICTION ---");
        int fictionPages = books.stream()
                .mapToInt(Book::getPages)
                .sum();
        System.out.println(fictionPages + " pages");

        // ─── TASK 8: First available SCIENCE book ────────────────────────
        System.out.println("\n--- Task 8: First available SCIENCE book ---");
        books.stream()
                .filter(b -> b.getGenre().equalsIgnoreCase("Science"))
                .filter(Book::isAvailable)
                .findFirst().ifPresentOrElse(book -> System.out.println(book.getTitle() + " is available"), () -> System.out.println("None available"));

        // ─── TASK 9 BONUS: Count per genre ───────────────────────────────
        System.out.println("\n--- Task 9 (BONUS): Count per genre ---");
        Map<String, Long> countByGenre = books.stream()
                .collect(Collectors.groupingByConcurrent(Book::getGenre, Collectors.counting()));


        System.out.println(countByGenre);

        //Task 10-. Average pages per genre
        System.out.println(" \n ---Task 10 - Average pages per game");
        Map<String, Double> avgPerGener= books.stream()
                .collect(Collectors.groupingBy(Book::getGenre, Collectors.averagingInt(Book::getPages)));

        System.out.println(avgPerGener);


        System.out.println("Gpt task -------- Available function book title ");
        List<String> function = books.stream()
                .filter(b -> b.getGenre().equalsIgnoreCase("FICTION"))
                .map(Book::getTitle).toList();

        System.out.println(function);

        System.out.println("Gpt task --------Distinct Author who have books available ");
        List<String> collect = books.stream()
                .filter(Book::isAvailable)
                .map(Book::getAuthor).distinct().toList();
        System.out.println(collect);


        System.out.println("Shortest books by pages:");
        List<Book> list = books.stream()
                .sorted(Comparator.comparing(Book::getPages))
                .limit(2)
            //    .collect(b->)
                .toList();
        System.out.println(list);
    }
}