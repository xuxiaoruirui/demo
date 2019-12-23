package strategy.test.factory;

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
