package com.biblio.ebook.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EbookDto {
    private Long ebookId;
    private String title;
    private String author;
    private String imageUrl;
    private LocalDate publicationDate;
    private String fileFormat;
    private String description;

    public EbookDto() {
    }

    public EbookDto(Long ebookId, String title, String author, String imageUrl, LocalDate publicationDate, String fileFormat, String description) {
        this.ebookId = ebookId;
        this.title = title;
        this.author = author;
        this.imageUrl = imageUrl;
        this.publicationDate = publicationDate;
        this.fileFormat = fileFormat;
        this.description = description;
    }
}
