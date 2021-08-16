package gpstudy.strategy.test.factory;

import strategy.test.factory.Computer;
import strategy.test.factory.Table;

public abstract class ProductFactory{
   abstract Computer newComputer();
   abstract Table newTable();
}
