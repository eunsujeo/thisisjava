package study.chapter_14;

public class ClassVarAndLocalVar {
    /*
        클래스의 멤버 사용
        > 람다식 실행 블록에는 클래스의 멤버인 필드와 메소드를 제약 없이 사용할 수 있다.
        > 람다식 실행 블록내에서 this는 람다식을 실행한 객체의 참조이다.

        public class ThisExample {
            public int outterField = 10;

            class Inner {
                int innerField = 20;

                void method() {
                    // 람다식
                    MyFunctionalInterface fi = () -> {
                        System.out.println("outterField: " + outterField);
                        System.out.println("outterField: " + ThisExample.this.outterField);

                        System.out.println("innerField: " + this.innerField);
                    }
                }
            }
        }

        로컬 변수의 사용
        > 람다식은 함수적 인터페이스의 익명 구현 객체를 생성한다.
        > 람다식에서 사용하는 외부 로컬 변수를 final 특성을 갖는다.(why? 람다식은 익명 구현 객체를 생성하기 때문이다.)
     */
}
