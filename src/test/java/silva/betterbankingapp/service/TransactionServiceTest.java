package silva.betterbankingapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import silva.betterbankingapp.repository.TransactionRepository;

class TransactionServiceTest {
    @Mock
    private TransactionRepository transactionRepository;

    TransactionService transactionService = new TransactionService(transactionRepository);

    @Test
    public void testTransactionCount() {
        assertEquals(1, transactionService.findAllByAccountNumber(1234567).size());
    }
}