package br.com.lucasaprigio.ediaristas.core.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import br.com.lucasaprigio.ediaristas.core.enums.Icone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // Entidade que vai ser convertida em uma tabela no banco de dados
@Data // Gera os getters para todos os campos, o toString, o hashCode e equals, e os setters - dessa forma o código fica mais limpo 
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // o Equals e hashCode, vai ser informado de forma explicita
@ToString(onlyExplicitlyIncluded = true)
public class Servico {

    @EqualsAndHashCode.Include // Já cria o equals e hashCode
    @ToString.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String nome;

    @Column(name = "valor_minimo", nullable = false)
    private BigDecimal valorMinimo; // BigDecimal melhor para utilizar para valores monetários - cálculos mais
                                    // precisos

    @Column(name = "qtd_horas", nullable = false)
    private Integer qtdHoras;

    @Column(name = "porcentagem_comissao", nullable = false)
    private BigDecimal porcentagemComissao;

    @Column(name = "horas_quarto", nullable = false)
    private Integer horasQuarto;

    @Column(name = "valor_quarto", nullable = false)
    private BigDecimal valorQuarto;

    @Column(name = "horas_sala", nullable = false)
    private Integer horasSala;

    @Column(name = "valor_sala", nullable = false)
    private BigDecimal valorSala;

    @Column(name = "horas_banheiro", nullable = false)
    private Integer horasBanheiro;

    @Column(name = "valor_banheiro", nullable = false)
    private BigDecimal valorBanheiro;

    @Column(name = "horas_cozinha", nullable = false)
    private Integer horasCozinha;

    @Column(name = "valor_cozinha", nullable = false)
    private BigDecimal valorCozinha;

    @Column(name = "horas_quintal", nullable = false)
    private Integer horasQuintal;

    @Column(name = "valor_quintal", nullable = false)
    private BigDecimal valorQuintal;

    @Column(name = "horas_outros", nullable = false)
    private Integer horasOutros;

    @Column(name = "valor_outros", nullable = false)
    private BigDecimal valorOutros;

    @Column(nullable = false, length = 14)
    @Enumerated(EnumType.STRING)
    private Icone icone;

    @Column(nullable = false)
    private Integer posicao;

}
