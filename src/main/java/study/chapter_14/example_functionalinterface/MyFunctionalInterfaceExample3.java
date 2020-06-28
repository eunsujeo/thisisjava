package study.chapter_14.example_functionalinterface;

import static java.lang.Integer.sum;

public class MyFunctionalInterfaceExample3 {
    public static void main(String[] args) {
        MyFunctionalInterface3 fi;

        fi = (x, y) -> {
          int result = x * y;
          return result;
        };

        System.out.println(fi.method(5, 5));

        fi = (x, y) -> { return x * y; };

        System.out.println(fi.method(5, 5));

        fi = (x, y) -> x * y;
        System.out.println(fi.method(5, 5));

        fi = (x, y) -> sum(x, y);
        System.out.println(fi.method(5, 5));
    }
}
