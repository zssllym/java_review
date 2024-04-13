package ch10;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class TestBigNumber {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("3.0");
        BigDecimal bigDecimal2 = new BigDecimal(9);
        BigDecimal bigDecimal3 = bigDecimal1.divide(bigDecimal2, 100, RoundingMode.HALF_EVEN); 
        System.out.println(bigDecimal3);
        BigInteger bigInteger1 = new BigInteger(String.valueOf(123));
        System.out.println(bigInteger1);
        BigDecimal bigDecimal4 = new BigDecimal(0.1);
        System.out.println(bigDecimal4);
    }
}
