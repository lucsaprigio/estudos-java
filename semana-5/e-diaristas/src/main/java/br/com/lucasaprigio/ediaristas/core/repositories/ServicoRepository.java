package br.com.lucasaprigio.ediaristas.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucasaprigio.ediaristas.core.models.Servico;

// Uma interface que vai fazer de fato as nossas "queries" no banco
public interface ServicoRepository extends JpaRepository<Servico, Long> {
    
}
