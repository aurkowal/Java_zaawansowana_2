package pl.coderslab.advanced.generic;

import java.util.Objects;

public class Main02 {
    public static void main(String[] args) {
        System.out.println(countElements(new Integer[]{1, 2, 3, 4, 5, 4, 7, 4, 2, 4, 7, 9}, 4));
        System.out.println(countElements(new String[]{"Ala", "Ola","Ula","Ola","Ela","A"}, "Ola"));
        System.out.println(countElements(new String[]{"Ala", null,"Ula","Ola","Ela","A"}, null));
    }

    public static <T> int countElements(T[] array, T element) {
        int count = 0;
        for (T e : array) {
            if ((element == null && e == null) || e.equals(element)) {
                count++;
            }
        }
        return count;
    }


}
