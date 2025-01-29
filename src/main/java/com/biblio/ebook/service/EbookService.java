package com.biblio.ebook.service;

import com.biblio.ebook.model.Ebook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {
    List<Ebook> ebooks = new ArrayList<>(List.of());

    public List<Ebook> getEbooks() {
        return ebooks;
    }

    public Ebook getEbookById(int ebookId) {
        return ebooks.stream()
                .filter(e -> e.getEbookId() == ebookId)
                .findFirst().orElse(new Ebook("no items"));
    }

    public void addEbook(Ebook ebook) {
        ebooks.add(ebook);
    }

}
