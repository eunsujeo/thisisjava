package study.chapter_09;

public class Anonymous {
    /*
        익명 객체 : 이름이 없는 객체
        > 익명 객체는 단독으로 생성할 수 없다.
         - 클래스를 상속하거나 인터페이스를 구현해야만 생성할 수 있다.
        > 사용 위치
         - 필드의 초기값, 로컬 변수의 초기값, 매개변수의 매개값으로 주로 대입된다.
         - UI 이벤트 처리 객체나, 스레드 객체를 간편하게 생성할 목적으로 주로 활용된다.

        익명 자식 객체 생성
        부모클래스 [필드|변수] = new 부모클래스(매개값, ... ) {
            //필드
            //메소드
        }

        > 익명 객체에 새롭게 정의된 필드와 메소드
         - 익명 객체 내부에서만 사용된다.
         - 외부에서는 익명 객체의 필드와 메소드에 접근할 수 없다.
          이유 : 익명 객체는 부모 타입 변수에 대입되므로 부모 타입에 선언된 것만 사용할 수 있다.

        익명 구현 객체 생성
        인터페이스 [필드|변수] = new 인터페이스() {
            // 인터페이스에 선언된 추상 메소드의 실체 메소드 선언
            // 필드
            // 메소드
        }
     */
}
