package dev.patika;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        Book b1 = entityManager.find(Book.class,1);
        System.out.println(b1);

//        Author author = new Author();
//        author.setName("Victor Hugo");
//        author.setBirthDate(LocalDate.of(1802, 2, 26));
//        author.setCountry("France");
//        entityManager.persist(author);
//
//        Publisher publisher = new Publisher();
//        publisher.setName("Can Yayınları");
//        publisher.setEstablishmentYear(1996);
//        publisher.setAddress("İstanbul");
//        entityManager.persist(publisher);
//
//        Book book = new Book();
//        book.setName("Sefiller");
//        book.setStock(10);
//        book.setPublicationYear(1862);
//        book.setAuthor(author);
//        book.setPublisher(publisher);
//        entityManager.persist(book);
//
//        Category category = new Category();
//        category.setName("Roman");
//        category.setDescription("Romanlar");
//        entityManager.persist(category);

//        BookBorrowing bookBorrowing = new BookBorrowing();
//        bookBorrowing.setBorrower_name("Ahmet");
//        bookBorrowing.setOnDate(LocalDate.now());
//        bookBorrowing.setReturnDate(null);
//        bookBorrowing.setBook(b1);
//        entityManager.persist(bookBorrowing);

//        Book bookcat = entityManager.find(Book.class, book.getId());
//        List<Category> categories = new ArrayList<>();
//        categories.add(category);
//        book.setCategories(categories);



        transaction.commit();


    }
}
