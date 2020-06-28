package study.chapter_09.example_nestedinterface;

public class Button {

    /*
        중첩 인터페이스를 사용하는 이유는
        1. Outter Class와 밀접한 관련이 있는 인터페이스;
        2. 외부에서는 사용하지 않고 Button 안에서만 사용한다.
      */

    OnClickListener listener;

    /*
        다양한 구현객체가 올 수 있다. (다형성)
     */
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        // 구현 객체의 onClick() 메소드 호출
        listener.onClick();
    }

    interface OnClickListener {
        void onClick();
    }
}
