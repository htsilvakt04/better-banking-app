package silva.betterbankingapp.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import silva.betterbankingapp.entity.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {
  List<Transaction> findTransactionsByAccountNumber(Integer accountNumber);
}
