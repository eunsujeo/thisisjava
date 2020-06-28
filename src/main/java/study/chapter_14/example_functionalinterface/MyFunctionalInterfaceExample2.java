package study.chapter_14.example_functionalinterface;

public class MyFunctionalInterfaceExample2 {
    public static void main(String[] args) {
        MyFunctionalInterface2 fi;

        fi = (x) -> {
            int result = x + 5;
            System.out.println(result);
        };

        fi.method(10);

        fi = (x) -> {
            System.out.println(x*5);
        };

        fi.method(5);

        fi = x -> System.out.println(x*5);

        fi.method(10);
    }
}
