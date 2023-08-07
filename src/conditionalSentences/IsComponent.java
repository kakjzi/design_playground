package conditionalSentences;

public class IsComponent implements IfStateInterface {
    @Override
    public boolean support(String state) {
        return "C".equals(state);
    }

    public void handle() {
        System.out.println("입니다.");
    }
}

