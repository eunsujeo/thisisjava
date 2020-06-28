package study.chapter_09.example_nestedclass_object;

public class A {
    A() {
        System.out.println("A 객체가 생성될 때 출력");
    }

    class B {
        int field1;
        B() {
            System.out.println("B 객체가 생성될 때 출력");
        }
        void method1(){}

    }
    static class C {
        int field1;
        static int field2;
        C() {
            System.out.println("C 객체가 생성될 때 출력");
        }
        void method1() {};
        static void method2() {};
    }

    void method() {
        class D {
            int field1;
            D() {
                System.out.println("D 객체가 생성될 때 출력");
            }
            void method() {}
        }

        D d = new D();
        d.field1 = 3;
        d.method();
    }
}
