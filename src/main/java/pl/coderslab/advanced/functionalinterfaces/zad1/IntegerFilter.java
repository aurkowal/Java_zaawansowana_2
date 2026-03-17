package pl.coderslab.advanced.functionalinterfaces.zad1;

public class IntegerFilter implements Filter<Integer>{
    public boolean check(Integer v) {
        return v < 20;
    }

}
