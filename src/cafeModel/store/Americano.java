package cafeModel.store;

public class Americano extends Beverage {

    private String beverage;
    @Override
    public void makeBeverage() {
        System.out.println("주문하신 음료 " + beverage);
    }

    @Override
    public void setOption(String size, String temp) {
        this.beverage = Menu.selectOption("AMERICANO", size, temp);
    }
}
