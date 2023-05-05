package com.bookcrossing.bookcrossing.models;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @Column(name = "id")
    private long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    Book book;

    private LocalDateTime dateTaken;
    private LocalDateTime dateGiven;

    public Booking(){
        //NOOP
    }

    public Booking(long id, User user, Book book, LocalDateTime dateTaken, LocalDateTime dateGiven) {
        this.id = id;
        this.user = user;
        this.book = book;
        this.dateTaken = dateTaken;
        this.dateGiven = dateGiven;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDateTime getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(LocalDateTime dateTaken) {
        this.dateTaken = dateTaken;
    }

    public LocalDateTime getDateGiven() {
        return dateGiven;
    }

    public void setDateGiven(LocalDateTime dateGiven) {
        this.dateGiven = dateGiven;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", user=" + user +
                ", book=" + book +
                ", dateTaken=" + dateTaken +
                ", dateGiven=" + dateGiven +
                '}';
    }
}
