package silva.betterbankingapp.web;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import silva.betterbankingapp.service.TransactionService;
import silva.betterbankingapp.web.dto.TransactionDto;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {

    public TransactionController(final TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/{accountNumber}")
    public List<TransactionDto> findAllByAccountNumber(@PathVariable("accountNumber") final Integer accountNumber) {
        return transactionService.findAllByAccountNumber(accountNumber);
    }

    private final TransactionService transactionService;
}
