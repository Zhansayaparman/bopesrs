package bopw.bopesrs.models;

import javax.persistence.*;
import java.util.Set;

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    private String firstName ;
    private String lastName ;
    private String email ;
    private String address ;
    private Set<Book> books;




    public Client(){}

    public Client(String firstName, String lastName, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address =address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        String result = String.format("Category[id=%d, firstName='%s', lastName='%a', email='%e']%n", id, firstName, lastName, email);
        if (books != null) {
            for(Book book : books) {
                result += String.format("Book[book_id=%d, book_name='%s', book_baga='%g',time='%y']%n", book.getBook_id(), book.getbook_name(), book.getBook_baga(), book.getTime());
            }
        }

        return result;
    }
}



