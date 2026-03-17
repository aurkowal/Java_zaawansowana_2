package pl.coderslab.advanced.functionalinterfaces.zad2;

public class IntegerTransform implements Transform<Integer, Integer> {
    @Override
    public Integer transform(Integer s) {
        return s == null ? null : s - 1;
    }

}
