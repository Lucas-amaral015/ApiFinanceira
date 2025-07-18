package repositories;

import domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
//interface é uma janela para abrirmos e olharmos e pegar oque precisamos e sair.
//extends vem da herança de uma INTERFACE específica.
//diferença de classe e interface: - Classe eu crio e manipulo objeto (molde)
//interface não se cria objeto.
//interface usa void(mét)  para nao retornar e nao usa codigo tambem as vezes.
//interface são maleáveis, prefira usar ela ao inves de classe.
}
