package br.com.sistemaescolar.genix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Alunos {
    

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long id;
    private String nome;
    private String icone;
    private long rm;
    private String cpf;
    private String telefone;
    private String email;
    private String responsavel;


    public Alunos(long id, String nome, String icone, long rm, String cpf, String telefone, String email,
            String responsavel) {
        this.id = id;
        this.nome = nome;
        this.icone = icone;
        this.rm = rm;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.responsavel = responsavel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    public long getRm() {
        return rm;
    }

    public void setRm(long rm) {
        this.rm = rm;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Object id() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'id'");
    }

   

}
