package com.biblio.ebook.controller;

import com.biblio.ebook.model.Ebook;
import com.biblio.ebook.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EbookController {

    @Autowired
    EbookService service;

    @GetMapping("/ebooks")
    public List<Ebook> getEbooks() {
        return service.getEbooks();
    }


    @GetMapping("ebooks/{ebookId}")
    public Ebook getEbookById(@PathVariable int ebookId) {
        EbookService Service = new EbookService();
        return Service.getEbookById(ebookId);
    }

    @PostMapping("/ebooks")
    public void addEbook(@RequestBody Ebook ebook) {
        service.addEbook(ebook);
    }
}
