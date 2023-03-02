package com.projetointegradorODS1.model;

public class UsuarioLogin {

    private Long id;
    private String nome;
    private String usuario;
    private Long cpf_cnpj;
    private String senha;
    private String foto;
    private String token;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Long getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(Long cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
