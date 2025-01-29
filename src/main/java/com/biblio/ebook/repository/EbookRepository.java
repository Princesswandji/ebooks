package com.biblio.ebook.repository;

import com.biblio.ebook.model.Ebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface pour les opérations de base de données liées aux eBooks.
 */
@Repository
public interface EbookRepository extends JpaRepository<Ebook, Long> {
}