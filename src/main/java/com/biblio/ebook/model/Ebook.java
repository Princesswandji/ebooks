package com.biblio.ebook.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ebook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ebookId;

    private String title;
    private String author;
    private String imageUrl;
    private LocalDate publicationDate;
    private String fileFormat;
    private String description;

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
