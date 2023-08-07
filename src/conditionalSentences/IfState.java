package conditionalSentences;

public class IfState {
    public void handle(String state) {
        IfStateEnum ifStateEnum = IfStateEnum.of(state);
        ifStateEnum.handle();
    }

    enum IfStateEnum {
        A {
            @Override
            public void handle() {
                System.out.println("안녕하세요");
            }
        }, B {
            @Override
            public void handle() {
                System.out.println("신지우");
            }
        }, C {
            @Override
            public void handle() {
                System.out.println("입니다.");
            }
        },
        ;

        public static IfStateEnum of(String state) {
            for (IfStateEnum ifStateEnum : IfStateEnum.values()) {
                if (ifStateEnum.name().equals(state)) {
                    return ifStateEnum;
                }
            }
            throw new IllegalArgumentException("Invalid state: " + state);
        }

        public abstract void handle();
    }
}
