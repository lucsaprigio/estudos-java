package br.com.lucsaprigio.conhecendospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucsaprigio.conhecendospring.models.Diarista;

public interface DiaristaRepository extends JpaRepository<Diarista, Long>{
    
}
