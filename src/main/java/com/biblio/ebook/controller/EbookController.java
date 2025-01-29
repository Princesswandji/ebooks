package com.biblio.ebook.controller;

import com.biblio.ebook.dto.EbookDto;
import com.biblio.ebook.model.Ebook;
import com.biblio.ebook.service.EbookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ebooks")
public class EbookController {

    @Autowired
    private EbookService service;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<EbookDto> getEbooks() {
        return service.getEbooks();
    }

    @GetMapping("/{ebookId}")
    public ResponseEntity<EbookDto> getEbookById(@PathVariable Long ebookId) {
        EbookDto ebookDto = service.getEbookById(ebookId);
        if (ebookDto != null) {
            return new ResponseEntity<>(ebookDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<EbookDto> addEbook(@RequestBody EbookDto ebookDto) {
        EbookDto ebook = service.addEbook(ebookDto);
        return new ResponseEntity<>(ebook, HttpStatus.CREATED);
    }

}
