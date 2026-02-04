package sale.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SaleComponentTest {
    @Test
    public void simpleSaleTest() {
        System.out.println("SIMPLE SALE COMPONENT TEST");
    }


    @Test
    public void simpleSaleTest2() {
        System.out.println("SIMPLE SALE COMPONENT TEST 2");
        Assertions.fail("Test failed");
    }
}
