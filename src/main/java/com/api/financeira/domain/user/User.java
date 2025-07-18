package com.api.financeira.domain.user;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity(name = "users") //entidades do pacote domain.user, classe user. OBS: usei "users" pq user é palavra reservada do SQL
@Table(name = "users") // nome da tabela que a entidade ta representando
@Getter //do lombok
@Setter// do lombok
@AllArgsConstructor // cria construtores de todos os parametros da classe
@EqualsAndHashCode(of = "id") //chave primária da entidade criada aqui e dessa tabela

public class User {//AQUI DENTRO TERÁ OS CAMPOS DO USUARIO

    @Id //
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //aqui vai gerar automaticamente o ID do usuario sem precisar mexer/ GenerationType.IDENTITY (GERA DE FORMA AUTOMATICA COM INICIO DE SEQUENCIA 1,2,3...)
    //ESSA NAO É A FORMA MAIS SEGURA
    private String firstName; //primeiro nome

    private String lastName; //segundo nome

    @Column(unique = true) //Aqui foi criado uma coluna para dizer que o document é o cpf que so pode ser unico para aquela pessoa
    private  String document;

    @Column(unique = true)
    private String email;

    private  String password; //aqui vai a senha(autenticação usuario)

    private BigDecimal balance; //decimal grande,valor do usario disponivel de saldo

    @Enumerated(EnumType.STRING) //Serve para dizer que esse campo representa ou MERCHANT OU COMMOM.
    private UserType userType;

}

