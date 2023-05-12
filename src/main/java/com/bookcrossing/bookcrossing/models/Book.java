package com.bookcrossing.bookcrossing.models;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @Column(name="id")
    private long id;
    @Column(name="title")
    private String title;
    @Column(name="descripnion")
    private String description;
    @Column(name="booked")
    private boolean booked;
    @Column(name="rent")
    private short rent;
    @OneToMany(mappedBy = "book")
    private List<Booking> booking;

    public Book(){
        //NOOP
    }
    public Book(String title, String description, boolean booked, short rent) {
        this.title = title;
        this.description = description;
        this.booked = booked;
        this.rent = rent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public short getRent() {
        return rent;
    }

    public void setRent(short rent) {
        this.rent = rent;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", booked=" + booked +
                ", rent=" + rent +
                ", booking=" + booking +
                '}';
    }
}

