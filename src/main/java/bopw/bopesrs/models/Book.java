package bopw.bopesrs.models;

import javax.persistence.*;

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long book_id;
    private String book_name;
    private String book_baga;
    private int time;
    private Client client;


    public Book() {
    }
    public Book(String book_name, String book_baga, int time) {
        this.book_name = book_name;
        this.book_baga = book_baga;
        this.time = time;
    }

    public long getBook_id() {
        return book_id;
    }

    public void setbook_id(long book_id) {
        this.book_id = book_id;
    }

    public String getbook_name() {return book_name; }

    public void setbook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_baga() {
        return book_baga;
    }

    public void setBook_baga(String book_baga) {
        this.book_baga = book_baga;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @ManyToOne
    @JoinColumn(name = "id")
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

