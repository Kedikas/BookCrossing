package com.bookcrossing.bookcrossing.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Comments")
public class Comments {
    @Id
    @Column(name="id")
    private long id;
    @Column(name="content")
    private String content;

    @Column(name="date")
    private Date date;
    private long userId;

    public  Comments(){
        //NOOP
    }
    public Comments(long id, String content, Date date, long userId) {
        this.id = id;
        this.content = content;
        this.date = date;
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", userId=" + userId +
                '}';
    }
}

