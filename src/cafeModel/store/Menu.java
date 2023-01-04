package cafeModel.store;

import java.util.function.BiFunction;

public enum Menu {
    AMERICANO((size, temp) -> "아메리카노의 옵션:: 크기 - " + size + " 온도 - " + temp),
    CAFEMOCA((size, temp) -> "카페모카의 옵션:: 크기 - " + size + " 온도 - " + temp),
    CAFELATTE((size, temp) -> "카페라떼의 옵션:: 크기 - " + size + " 온도 - " + temp);
    private BiFunction<String, String, String> option;

    Menu(BiFunction<String, String, String> option) {
        this.option = option;
    }


    public static String selectOption(String inputSymbol, String size, String temp) {
        for (Menu menu : Menu.values()) {
            if (menu.match(inputSymbol)) {
                return menu.option.apply(size, temp);
            }
        }
        throw new IllegalArgumentException();
    }
    private boolean match(String inputSymbol) {
        return name().equals(inputSymbol);
    }

}
