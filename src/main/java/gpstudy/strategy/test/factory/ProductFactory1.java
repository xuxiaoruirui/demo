package gpstudy.strategy.test.factory;

import strategy.test.factory.Computer;
import strategy.test.factory.DIYComputer;
import strategy.test.factory.ESportsTable;
import strategy.test.factory.ProductFactory;
import strategy.test.factory.Table;

public class ProductFactory1 extends ProductFactory {
    @Override
    Computer newComputer() {
        return new DIYComputer();
    }

    @Override
    Table newTable() {
        return new ESportsTable();
    }
}
