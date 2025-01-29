package com.biblio.ebook;

import com.biblio.ebook.model.Ebook;
import com.biblio.ebook.repository.EbookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EbookApplication{

    public static void main(String[] args) {
        SpringApplication.run(EbookApplication.class, args);
    }

    @Autowired
    private EbookRepository ebookRepository;
    public void run(String... args) throws Exception {



    }
}
