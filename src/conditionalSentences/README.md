## 상황

IfState 클래스의 handle() 내 아래와 같이 분기문이 존재합니다.

```java
public class IfState {
    
    public void handle(String state) {
        
       if("A".equals(state)){
           System.out.println("A");
       } else if("B".equals(state)) {
           System.out.println("B");
         } else if("C".equals(state)) {
           System.out.println("C");
         } else {
           throw new IllegalArgumentException("Invalid state: " + state);
       }
    }
}
```
요구사항이 생길 때마다 handle() 메서드에 계속 추가를 해야할까요?

그렇다면 handle() 메서드를 건들지 않고 어떻게 리팩토링할 수 있는 지 고민해봅시다.