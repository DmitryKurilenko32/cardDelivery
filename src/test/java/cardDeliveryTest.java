import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class cardDeliveryTest {
    @Test
    public void validTest(){

        open ( "http://localhost:9999/");
        $("[data-test-id= 'Брянск']");
        $("[name = 'name']").setValue("Иван Иванов");
        $("[name = 'phone']").setValue("89000000000");
        $("[data-test-id= 'agreement']").click();
        $("button").click();



    }
}
