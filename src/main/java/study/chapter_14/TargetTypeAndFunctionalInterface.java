package study.chapter_14;

public class TargetTypeAndFunctionalInterface {
    /*
        타겟 타입(target type)
        > 람다식이 대입되는 인터페이스를 말한다.
        > 익명 구현 객체를 만들 때 사용할 인터페이스이다.

        인터페이스(타겟타입) 변수 = 람다식;

        함수적 인터페이스(functional interface)
        모든 인터페이스는 람다식의 타겟 타입이 될 수 없다.
        > 람다식은 하나의 메소드를 정의하기 때문에 하나의 추상 메소드만 선언된 인터페이스만 타겟 타입이 될 수 있음.
        > 함수적 인터페이스
            - 하나의 추상 메소드만 선언된 인터페이스를 말한다.
        > @FunctionalInterface 어노테이션
            - 하나의 추상 메소드만을 가지는지 컴파일러가 체크하도록 함
            - 두 개 이상의 추상 메소드가 선언되더 있으면 컴파일 오류 발생

        매개변수와 리턴 값이 없는 람다식
        @FunctionalInterface
        public interface MyFunctionalInterface {
            public void method;
        }

        MyFunctionalInterface fi = () -> { ... }
        fi.method();

     */
}






