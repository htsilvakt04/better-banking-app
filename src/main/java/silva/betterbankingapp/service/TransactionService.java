package silva.betterbankingapp.service;


import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import silva.betterbankingapp.entity.Transaction;
import silva.betterbankingapp.repository.TransactionRepository;
import silva.betterbankingapp.web.dto.TransactionDto;

@Service
public class TransactionService {
  private final TransactionRepository transactionRepository;

  public TransactionService(TransactionRepository transactionRepository) {
    this.transactionRepository = transactionRepository;
  }

  public List<TransactionDto> findAllByAccountNumber(final Integer accountNumber) {
    return transactionRepository.findTransactionsByAccountNumber(accountNumber).stream()
        .map(this::map)
        .collect(Collectors.toList());
  }

  private TransactionDto map(final Transaction tr) {
    return TransactionDto.apply(tr);
  }
}
