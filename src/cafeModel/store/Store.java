package cafeModel.store;

public class Store {
    public Beverage getBeverage(Menu menu){
        switch (menu){
            case AMERICANO:
                return new Americano();
            case CAFELATTE:
                return new CafeLatte();
            case CAFEMOCA:
                return new CafeMoca();
            default:
                throw new IllegalArgumentException("메뉴가 없습니다.");
        }
    }
}
