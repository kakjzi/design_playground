package conditionalSentences;

public class HelloComponent implements IfStateInterface {

    @Override
    public boolean support(String state) {
        return "A".equals(state);
    }

    public void handle() {
        System.out.println("안녕하세요");
    }
}
