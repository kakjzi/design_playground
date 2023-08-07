package cafeModel;

import static cafeModel.store.Menu.AMERICANO;
import static cafeModel.store.Menu.CAFELATTE;
import static cafeModel.store.Menu.CAFEMOCA;

import cafeModel.store.Beverage;
import cafeModel.store.Store;

public class Demo {
    public static void main(String[] args) {
        Store store = new Store();

        Beverage beverage1 = store.getBeverage(AMERICANO);
        beverage1.setOption("venti", "hot");
        beverage1.makeBeverage();

        Beverage beverage2 = store.getBeverage(CAFELATTE);
        beverage2.setOption("tall", "hot");
        beverage2.makeBeverage();

        Beverage beverage3 = store.getBeverage(CAFEMOCA);
        beverage3.setOption("grande", "cold");
        beverage3.makeBeverage();
    }
}
