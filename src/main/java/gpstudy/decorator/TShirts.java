package gpstudy.decorator;

import decorator.Finery;

public class TShirts extends Finery{
    @Override
    public void show() {
        System.out.print(" 大T恤");
        super.show();
    }
}
