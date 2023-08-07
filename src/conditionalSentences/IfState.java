package conditionalSentences;

public class IfState {
    public void handle(String state) {
       if("A".equals(state)){
           System.out.println("안녕하세요");
       } else if("B".equals(state)) {
              System.out.println("신지우");
         } else if("C".equals(state)) {
              System.out.println("입니다");
         } else {
              throw new IllegalArgumentException("Invalid state: " + state);
       }
    }
}
