package com.biblio.ebook.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@Entity
public class Ebook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ebookId;

    private String title;
    private String author;
    private String imageUrl;
    private LocalDate publicationDate;
    private String fileFormat;
    private String description;


    public Ebook(int ebookId, String title, String author, String imageUrl, String fileFormat, String description) {
        this.ebookId = ebookId;
        this.title = title;
        this.author = author;
        this.imageUrl = imageUrl;
        this.fileFormat = fileFormat;
        this.description = description;

    }

    public Ebook() {

    }

    public Ebook(String noItems) {
    }

    @Override
    public String toString() {
        return "Ebook{" +
                "ebookId=" + ebookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", publicationDate=" + publicationDate +
                ", fileFormat='" + fileFormat + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


}