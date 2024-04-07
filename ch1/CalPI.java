package ch1;

public class CalPI {
    public static void main(String[] args) {
        final int N = 4;
        int sign = 1;
        double sum = 0;
        for(int i = 1; i < 14; i+=2){
            sum += 1.0/(i * sign);
            sign *= -1;
        }
        sum *= N;
        System.out.println("Pi ≈ " + sum);
    }
}