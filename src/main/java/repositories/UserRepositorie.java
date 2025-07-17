package repositories;

import domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositorie extends JpaRepository<User, Long> { // Aqui fica o repositório do Usuario
                                                                     // Aqui o JPA recebe dois tipos de tabelas
                                                                     // User da classe User,package user do domain
                                                                     // recebe o tipo Long por conta que declaramos o ID do tipo long na classe User

    Optional<User> findUserByDocument(String document); // findUserByDocument = MÉT.
                                                        // String document = parâmetro
                                                        // Optional<User> = Retorno do Mét. porém não é sempre que vai retornar usuario, por isso Optional
                                                        // Com esse padrão de sintaxe, o JPA consegue criar uma query automática na tabela no banco de dados em run time.
                                                        // query = consultar

    Optional<User> findUserById(Long Id);

}
