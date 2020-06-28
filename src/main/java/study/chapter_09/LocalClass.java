package study.chapter_09;

public class LocalClass {

    /*
        로컬 클래스에서 사용 제한
        final 매개변수와 로컬 변수는 로컬 클래스의 메소드의 로컬변수로 복사된다. (final 을 붙이지 않으면 컴파일 오류 발생)

        메소드는 실행이 완료되면 메소드안에서 선언된 매개변수, 로컬변수는 스택 메모리에서 제거된다.
        그렇기 때문에 로컬클래스가 객체가 생성이 되어서 heap에 만들어 질텐데 heap 에서는 메소드의 종료와 별도로 계속 메소드를 실행 할 수 있다.

        예를 들면
        메소드가 종료가 되어도 로컬클래스의 메소드에 루프가 계속 실행되는 상황에서 로컬클래스의 객체는 heap 계속 남아 있다.
        그래서 계속 매개변수, 지역변수를 계속 이용할 수 있다. 메소드가 종료되면 매개변수, 지역변수가 stack 메모리에서 사라지게 되기 때문에 문제가 된다.
        그래서 매개변수, 지역변수에 final 를 붙여서 로컬 클래스의 메소드의 로컬변수로 복사된다. (컴파일러가 해줌)
        자바 8부터는 붙이지 않아도 FINAL 특성을 가지고 있음을 주목해야 한다.
        - 매개변수와 로컬 변수는 final 특성을 가지며, 로컬 클래스의 필드로 복사된다.
     */
    void method() {
        /*
            로컬 클래스
        */
        class D {
            D() {}
            int field;
            //static int field2;
            void method1() {}
//             static void method2() {}
        }

        D d = new D();
        d.field = 3;
        d.method1();

        /*
            메소드를 실행하면 메인 쓰레드와 다른 작업 쓰레드를 생성하여 처리 할 때 사용된다.
         */
        class DownloadThread extends Thread {
            @Override
            public void run() {
                super.run();
            }
        }

        DownloadThread thread = new DownloadThread();
        thread.start();
    }
}
