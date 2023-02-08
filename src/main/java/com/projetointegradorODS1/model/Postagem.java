package com.projetointegradorODS1.model;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_postagens")
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo título é Obrigatório!")
    @Size(min = 5, max = 100, message = "O atributo título deve conter no mínimo 05 e no máximo 100 caracteres")
    private String titulo;

    @NotBlank(message = "O atributo mensagem é Obrigatório!")
    @Size(min = 10, max = 1000, message = "O atributo mensagem deve conter no mínimo 10 e no máximo 1000 caracteres")
    private String mensagem;

    @UpdateTimestamp
    private LocalDateTime data;

    @NotBlank(message = "O atributo compartilhamento é Obrigatório!")
    private Boolean compartilhamento;

    @NotBlank(message = "O atributo aceita_comentario é Obrigatório!")
    private Boolean aceita_comentario;

    @ManyToOne(cascade = CascadeType.REMOVE, optional = false)
    @JoinColumn(name = "tema_id", nullable = false)
    private Tema tema;

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Boolean getCompartilhamento() {
        return compartilhamento;
    }

    public void setCompartilhamento(Boolean compartilhamento) {
        this.compartilhamento = compartilhamento;
    }

    public Boolean getAceita_comentario() {
        return aceita_comentario;
    }

    public void setAceita_comentario(Boolean aceita_comentario) {
        this.aceita_comentario = aceita_comentario;
    }
}