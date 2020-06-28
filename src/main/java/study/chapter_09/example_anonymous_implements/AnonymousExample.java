package study.chapter_09.example_anonymous_implements;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        anonymous.remoteControl.turnOn();
        anonymous.remoteControl.turnOff();

        anonymous.method1();

        anonymous.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Smart TV를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("Smart TV를 끕니다.");
            }
        });
    }
}
