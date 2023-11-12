package silva.betterbankingapp.web;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import silva.betterbankingapp.repository.TransactionRepository;
import silva.betterbankingapp.service.TransactionService;

public class TransactionComponentTest {
    private int port = 8080;
    @Mock
    private TransactionRepository transactionRepository;
    @Test
    public void testApplicationEndToEnd() {
        given().standaloneSetup(new TransactionController(new TransactionService(transactionRepository)))
                .when()
                .get(String.format("http://localhost:%s/api/v1/transactions/1234567", port))
                .then()
                .statusCode(Matchers.is(200));
    }
}
