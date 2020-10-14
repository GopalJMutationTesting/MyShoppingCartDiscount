package github.gopal.service;

/**
 * Author: Gopal
 */
public class DiscountPriceCalculationService
    implements IDiscountPriceCalculationService {

    private static final double DISCOUNT_QUOTIENT = 0.2;

    private static final double DISCOUNT_ELIGIBLE_PRICE = 50.0;

    @Override
    public Double calculateDiscountedPrice(Double originalPrice) {
        Double discountedPrice = originalPrice;
        if(originalPrice > DISCOUNT_ELIGIBLE_PRICE) {
            double discount = originalPrice * DISCOUNT_QUOTIENT;
            discountedPrice = originalPrice - discount;
        }
        return discountedPrice;
    }
}
