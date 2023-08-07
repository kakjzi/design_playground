package conditionalSentences;

public class NameComponent implements IfStateInterface {
    @Override
    public boolean support(String state) {
        return "B".equals(state);
    }

    public void handle() {
        System.out.println("신지우");
    }
}
