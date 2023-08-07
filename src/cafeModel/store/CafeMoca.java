package cafeModel.store;

public class CafeMoca extends Beverage {
    private String beverage;
    @Override
    public void makeBeverage() {
        System.out.println("주문하신 음료 " + beverage);
    }

    @Override
    public void setOption(String size, String temp) {
        this.beverage = Menu.selectOption("CAFEMOCA", size, temp);
    }
}
