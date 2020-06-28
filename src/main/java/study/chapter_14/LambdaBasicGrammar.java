package study.chapter_14;

public class LambdaBasicGrammar {
    /*
        람다식 기본 문법
        함수적 스타일의 람다식을 작성하는 방법
        (타입 매개변수, ...) -> { 실행문; ... }
        (int a) -> { System.out.println(a); }

        > 매개 타입은 런타임시에 대입값에 따라 자동으로 인식하기 때문에 생략 가능
        (a) -> { System.out.println(a); }

        > 하나의 매개변수만 있을 경우에는 괄호() 생략 가능
        a -> { System.out.println(a); }

        > 하나의 실행문만 있다면 중괄호 { } 생략 가능
        a -> System.out.println(a)

        > 매개변수가 없다면 괄호 ()를 생략할 수 없음
        () -> { 실행문; ... }

        > 리턴 값이 있는 경우, return 문을 사용
        (x, y) -> { return x + y; };

        > 중괄호 {}에 return 문만 있을 경우, 중괄호를 생략 가능
        (x, y) -> x + y
     */
}






