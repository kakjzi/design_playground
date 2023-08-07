package conditionalSentences;

public class IfState {
    private IfStateHandler ifStateFactory = new IfStateHandler();

    public void handle(String state) {
        ifStateFactory.handle(state);
    }
}
