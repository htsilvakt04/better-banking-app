package silva.betterbankingapp.web.dto;


import java.util.Date;
import lombok.Builder;
import lombok.Data;
import silva.betterbankingapp.entity.Transaction;

@Data
@Builder
public class TransactionDto {
  private Long id;
  private String type;
  private Date date;
  private Integer accountNumber;
  private String currency;
  private Double amount;
  private String merchantName;
  private String merchantLogo;

  public static TransactionDto apply(final Transaction tr) {
    TransactionDto txnDto = new TransactionDtoBuilder()
        .id(tr.getId())
        .type(tr.getType())
        .accountNumber(tr.getAccountNumber())
        .currency(tr.getCurrency())
        .amount(tr.getAmount())
        .merchantName(tr.getMerchantName())
        .merchantLogo(tr.getMerchantLogo())
        .build();

    return txnDto;
  }
}
