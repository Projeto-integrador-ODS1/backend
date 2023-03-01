package com.projetointegradorODS1.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tb_postagens")
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O Atributo título é Obrigatório!")
    @Size(min = 5, max = 200, message = "O Atributo título deve conter no mínimo 05 e no máximo 100 caracteres")
    private String titulo;

    @NotBlank(message = "O Atributo mensagem é Obrigatório!")
    @Size(min = 10, max = 500, message = "O Atributo mensagem deve conter no mínimo 10 e no máximo 1000 caracteres")
    private String mensagem;

    @UpdateTimestamp
    private LocalDateTime data_postagem;

    @JsonProperty("compartilhamento")
    private boolean compartilhamento;

    @JsonProperty("aceita_comentario")
    private boolean aceita_comentario;

    @ManyToOne
    @JsonIgnoreProperties("postagem")
    private Tema tema;

    @ManyToOne
    @JsonIgnoreProperties("postagem")
    private Usuario usuario;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getData_postagem() {
        return data_postagem;
    }

    public void setData_postagem(LocalDateTime data_postagem) {
        this.data_postagem = data_postagem;
    }

    public boolean isCompartilhamento() {
        return compartilhamento;
    }

    public void setCompartilhamento(boolean compartilhamento) {
        this.compartilhamento = compartilhamento;
    }

    public boolean isAceita_comentario() {
        return aceita_comentario;
    }

    public void setAceita_comentario(boolean aceita_comentario) {
        this.aceita_comentario = aceita_comentario;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Tema getTema() {
        return this.tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}