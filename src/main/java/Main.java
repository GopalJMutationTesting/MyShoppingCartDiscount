import github.gopal.service.DiscountPriceCalculationService;
import github.gopal.service.IDiscountPriceCalculationService;

/**
 * Author: Gopal
 */
public class Main {

    public static void main(String[] args) {
        IDiscountPriceCalculationService service = new DiscountPriceCalculationService();
        Double discountPrice = service.calculateDiscountedPrice(200d);
        System.out.println(discountPrice);
    }
}
