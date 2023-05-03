package com.bookcrossing.bookcrossing.models;
import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @OneToMany(fetch = FetchType.EAGER)
    @Column(name="bookedBooks")
    private List<Book> bookedBooks;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Comments> comments;
    public User(){
        //NOOP
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Book> getBookedBooks() {
        return bookedBooks;
    }

    public void setBookedBooks(List<Book> bookedBooks) {
        this.bookedBooks = bookedBooks;
    }

    public User(long id, String name, String surname, String username, String password, List<Book> bookedBooks) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.bookedBooks = bookedBooks;
    }
}
