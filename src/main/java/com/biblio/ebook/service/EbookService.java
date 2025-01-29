package com.biblio.ebook.service;

import com.biblio.ebook.dto.EbookDto;
import com.biblio.ebook.model.Ebook;
import com.biblio.ebook.repository.EbookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EbookService {

    @Autowired
    private EbookRepository ebookRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<EbookDto> getEbooks() {
        return ebookRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public EbookDto getEbookById(Long ebookId) {
        Ebook ebook = ebookRepository.findById(ebookId)
                .orElseThrow(() -> new RuntimeException("Ebook not found"));
        return convertToDto(ebook);
    }

    public EbookDto addEbook(EbookDto ebookDto) {
        Ebook ebook = convertToEntity(ebookDto);
        return convertToDto(ebookRepository.save(ebook));
    }

    private EbookDto convertToDto(Ebook ebook) {
        return modelMapper.map(ebook, EbookDto.class);
    }

    private Ebook convertToEntity(EbookDto ebookDto) {
        return modelMapper.map(ebookDto, Ebook.class);
    }
}
