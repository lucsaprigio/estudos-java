package br.com.lucasaprigio.ediaristas.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucasaprigio.ediaristas.core.models.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
    // 25:48
}
