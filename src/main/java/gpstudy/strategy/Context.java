package gpstudy.strategy;

import lombok.Data;
import strategy.Strategy;
import strategy.StrategyB;

@Data
public class Context {

    public Strategy strategy1;
    public StrategyB strategy2;

    String a;
}
