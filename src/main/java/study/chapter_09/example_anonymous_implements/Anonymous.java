package study.chapter_09.example_anonymous_implements;

public class Anonymous {
    RemoteControl remoteControl = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    void method1() {
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Audio 를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("Audio 를 끕니다.");
            }
        };
        localVar.turnOn();
        localVar.turnOff();
    }
    void method2(RemoteControl rc) {
        rc.turnOff();
        rc.turnOn();
    }
}
