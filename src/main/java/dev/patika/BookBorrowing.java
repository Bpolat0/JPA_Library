package dev.patika;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "book_borrowing")
public class BookBorrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "serial")
    private Long id;

    @Column(name ="borrower_name", nullable = false)
    private String borrower_name;

    @Temporal(TemporalType.DATE)
    @Column(name = "borrowing_on_date")
    private LocalDate onDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "borrowing_return_date")
    private LocalDate returnDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    public BookBorrowing() {
    }

    public BookBorrowing(Long id, String borrower_name, LocalDate onDate, LocalDate returnDate, Book book) {
        this.id = id;
        this.borrower_name = borrower_name;
        this.onDate = onDate;
        this.returnDate = returnDate;
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBorrower_name() {
        return borrower_name;
    }

    public void setBorrower_name(String borrower_name) {
        this.borrower_name = borrower_name;
    }

    public LocalDate getOnDate() {
        return onDate;
    }

    public void setOnDate(LocalDate onDate) {
        this.onDate = onDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookBorrowing{" +
                "id=" + id +
                ", borrower_name='" + borrower_name + '\'' +
                ", onDate=" + onDate +
                ", returnDate=" + returnDate +
                ", book=" + book.getId() +
                '}';
    }
}
