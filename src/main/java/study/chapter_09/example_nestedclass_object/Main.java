package study.chapter_09.example_nestedclass_object;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();

        b.method1();

        A.C c = new A.C();
        c.method1();

        A.C.field2 = 3;
        A.C.method2();

        a.method();
    }
}
