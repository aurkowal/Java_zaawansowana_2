package pl.coderslab.advanced.lambda.zad4;

public interface MathOperation <N extends Number> {
    N apply(N n);
}
