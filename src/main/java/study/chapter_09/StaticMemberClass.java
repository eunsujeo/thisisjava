package study.chapter_09;

public class StaticMemberClass {
    /*
        정적 멤버 클래스
        부모 클래스로 바로 접근할 수 있는 B 중첩 클래스
     */
    static class C {
        C() {
        }

        int field1;
        static int field2;
        void method1(){};

        static void method2() {
        }
    }
}
