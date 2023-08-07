package conditionalSentences;

import java.util.Set;

public class IfStateHandler {
    Set<IfStateInterface> ifStateInterface = Set.of(
            new HelloComponent(),
            new NameComponent(),
            new IsComponent()
    );

    public void handle(String state) {
        ifStateInterface.stream()
                .filter(ifState -> ifState.support(state))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No IfStateInterface found for state: " + state))
                .handle();
    }
}
