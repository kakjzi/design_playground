package cafeModel.store;

public class CafeLatte extends Beverage {
    private String beverage;
    @Override
    public void makeBeverage() {
        System.out.println("주문하신 음료 " + beverage);
    }

    @Override
    public void setOption(String size, String temp) {
        this.beverage = Menu.selectOption("CAFELATTE", size, temp);
    }
}
