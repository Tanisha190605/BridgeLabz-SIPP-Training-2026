interface CouponValidator {
    boolean validateCoupon(String code);
    static boolean isLengthValid(String code) {
        return code.length() >= 5 && code.length() <= 10;
    }
}
class ShoppingCart implements CouponValidator {
    @Override
    public boolean validateCoupon(String code) {
        if (!CouponValidator.isLengthValid(code)) {
            return false;
        }
        if (!code.startsWith("SAVE")) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String[] coupons = {
                "SAVE10",
                "SAVE100",
                "DISCOUNT",
                "SAVE",
                "SAVE50",
                "ABC123",
                "SAVE9999"
        };
        ShoppingCart cart = new ShoppingCart();
        for (String coupon : coupons) {
            if (cart.validateCoupon(coupon)) {
                System.out.println(coupon + " -> Valid Coupon");
            } else {
                System.out.println(coupon + " -> Invalid Coupon");
            }
        }
    }
}