package study.chapter_09.example_button_event;

public class Window {
    Button button = new Button();
    Button button2 = new Button();

    // 필드 초기 값으로 대입
    Button.OnClickListener listener = new Button.OnClickListener() {
        @Override
        public void onClick() {
            System.out.println("전화를 겁니다.");
        }
    };

    Window() {
        button.setOnClickListener(listener);

        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("메세지를 보냅니다.");
            }
        });
    }
}
