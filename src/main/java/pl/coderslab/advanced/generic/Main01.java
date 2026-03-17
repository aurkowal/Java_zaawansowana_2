package pl.coderslab.advanced.generic;

public class Main01 {
    public static void main(String[] args) {
        System.out.println(compare(7, 6));
        System.out.println(compare("zebra", "stefan"));
    }

    public static <T extends Comparable<T>> T compare(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

}
