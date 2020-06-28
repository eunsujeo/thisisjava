package study.chapter_09;

public class InstanceMemberClass {
    /**
     * 인스턴스 멤버 클래스
     * 부모 객체를 생성해야만 사용할 수 있는 B 중첩 클래스
     */
    class B {
        B() {}
        int field1;
//        static int field2;    -- 정적 필드 (x)
        void method1() {}
//        static void method2() {} -- 정적 메소드(x)
    }
}
