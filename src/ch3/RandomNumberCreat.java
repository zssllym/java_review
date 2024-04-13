package ch3;

public class RandomNumberCreat {
    public static void main(String[] args) {
        long realReturnedNumber = System.currentTimeMillis();
        int number1 = (int)(realReturnedNumber % 10);
        System.out.println("System.currentTimeMillis(): " + realReturnedNumber);
        System.out.println("number1(~ % 10) = " + number1);
        double number2 = Math.random();
        System.out.println("Math.random(): " + number2);
    }
}
