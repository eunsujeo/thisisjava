package study.chapter_09.example_field_method_access;

public class A {
    int field1;
    void method1(){}

    static int field2;
    static void method2(){}

    // 부모클래스와 밀접한 관련이 있을 때 이렇게 사용한다.
    class B {
        void method() {
            field1 = 10;
            method1();

            field2 = 10;
            method2();
        }
    }

    static class C {
        void method() {
            // 인스턴스 필드와 메소드는 접근할 수 없다.
//            field1 = 10;
//            method1();

            field2 = 10;
            method2();
        }
    }
}
