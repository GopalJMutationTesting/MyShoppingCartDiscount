package github.gopal.service;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Author: Gopal
 */
public class DiscountPriceCalculationServiceTest {

    private DiscountPriceCalculationService service;

    @BeforeMethod
    public void initMethod() {
        service = new DiscountPriceCalculationService();
    }

    @Test
    public void testCalculateDiscountedPrice() {
        double result = service.calculateDiscountedPrice(200d);
        Assert.assertEquals(result, 160d);
    }
}