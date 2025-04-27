import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Ivan", List.of(
                        new Book("War and Peace", 1200, 1869),
                        new Book("Anna Karenina", 800, 1877),
                        new Book("The Hunger Games", 384, 2010),
                        new Book("The Da Vinci Code", 544, 2014),
                        new Book("Eugene Onegin", 500, 1833)
                )),
                new Student("Alexey", List.of(
                        new Book("Twenty Thousand Leagues Under the Seas", 354, 1872),
                        new Book("Anna Karenina", 800, 1877),
                        new Book("1984", 350, 1949),
                        new Book("The Master", 366, 2004),
                        new Book("The Picture of Dorian Gray", 300, 1890)
                )),
                new Student("Dmitry", List.of(
                        new Book("The Great Gatsby", 200, 1925),
                        new Book("1984", 350, 1949),
                        new Book("Home", 400, 2008),
                        new Book("Frankenstein", 250, 1818),
                        new Book("Dracula", 600, 1897)
                ))
        );

        students.stream()
                .peek(student -> System.out.println("1. Студент: " + student))
                .flatMap(student -> {
                    System.out.println("2. Книги студента: " + student.getBooks());
                    return student.getBooks().stream();
                })
                .distinct()
                .peek(book -> System.out.println("3. Уникальная: " + book))
                .sorted(Comparator.comparingInt(Book::getPages))
                .peek(book -> System.out.println("4. Сортировка: " + book))
                .filter(book -> book.getYear() > 2000)
                .peek(book -> System.out.println("5. После 2000: " + book))
                .limit(3)
                .peek(book -> System.out.println("6. Ограниченные до 3: " + book))
                .map(Book::getYear)
                .peek(year -> System.out.println("7. Год выпуска: " + year))
                .findFirst() // находим первую книгу
                .ifPresentOrElse(
                        year -> System.out.println("\n8. Результат: Найдена книга, изданная в: " + year),
                        () -> System.out.println("Книга после 2000 года не найдена")
                );
    }
}