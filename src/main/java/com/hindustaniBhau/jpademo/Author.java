package com.hindustaniBhau.jpademo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;

    private String nameofAuthor;
    private int no_of_books;

    public Author(){
        // for beans
    }

    public Author(int authorId, String nameofAuthor, int no_of_books) {
        this.authorId = authorId;
        this.nameofAuthor = nameofAuthor;
        this.no_of_books = no_of_books;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getNameofAuthor() {
        return nameofAuthor;
    }

    public void setNameofAuthor(String nameofAuthor) {
        this.nameofAuthor = nameofAuthor;
    }

    public int getNo_of_books() {
        return no_of_books;
    }

    public void setNo_of_books(int no_of_books) {
        this.no_of_books = no_of_books;
    }
}
