package com.kaiqueferraz.cursomc.dto;

import com.kaiqueferraz.cursomc.domain.Cliente;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class ClienteDTO implements Serializable {


    private static final long serialVersionUID = 1L;


    private Integer id;

    @NotEmpty(message = "Preenchimento Obrigatorio")
    @Length(min = 5, max = 150, message = "O tamanho deve ser entre 5 e 150 carac...")
    private String nome;

    @NotEmpty(message = "Preenchimento Obrigatorio")
    @Email@NotEmpty(message = "Email invalido")
    private String email;

    public ClienteDTO() {
    }

    public ClienteDTO(Cliente obj){
        id = obj.getId();
        nome= obj.getNome();
        email= obj.getEmail();
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
