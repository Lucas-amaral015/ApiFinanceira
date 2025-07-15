package domain.transaction;


import domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity(name = "transactions") //uma classe que também é uma entidade
//transaction é uma palavra reservada do banco de dados SQL, por isso coloquei o nome de transactions
@Table(name = "transactions")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //identificador único de um objeto
    private BigDecimal amount; //Qual o valor da transição, o quanto foi transferido de um usuário/outro
                               //BigDecimal = números decimais de alta precisão
                               //amount = variável para representar valor de transação,preço,etc.

    @ManyToOne//muitos objetos dessa classe(Transaction) podem estar relacionadas a um único objeto da classe user
    @JoinColumn(name = "sender_id")
    private User sender; //Usuário que enviou a transação.
                         //Está relacionado com a tabela de usuários no banco de dados
                         //O relacionamento fica salvo como uma chave estrangeira no banco.

    @ManyToOne
    @JoinColumn(name = "receiver_id")//Usado no JPA para mapear relacionamento entre entidades no banco
                                     //Indicando qual coluna na tabela atual será usada como chave estrangeira para referenciar outra tabela
    private User receiver; //Usuário que recebeu a transação
                           //Também é @ManyToMany, porque o mesmo usuário pode receber várias transações
                           //Relação de tabelas de usuários padrão em SQL, muitos para um

    private LocalDateTime timestamp; //Quando foi realizado a transação

}
