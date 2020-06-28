package study.chapter_09.example_member_class.access;

public class Outter {
    //자바 7이전
    public void method1(final int arg) {
        final int localVariable = 1;

        class Inner {
//            int arg = 10;
//            int localVariable = 1;
            public void method() {
                int result = arg + localVariable;
            }
        }
    }

    // 자바 8이후
    public void method2(int arg) {
        int localVariable = 1;
        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
    }
}
