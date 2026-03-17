package pl.coderslab.advanced.lambda.zad4;

public class Main04 {
    public static void main(String[] args) {
        MathOperation <Double> sqrt = n -> Math.sqrt(n);
        System.out.println(sqrt.apply(144.0));
        MathOperation <Double> square = n -> n * n;
        System.out.println(square.apply(2.5));
        MathOperation <Integer> factorial = n -> {
            int step = 1;
            for (int i = 1; i <= n; i++) {
                step *= i;
            }
            return step;
        };

        System.out.println(factorial.apply(14));


    }
}
