package gpstudy.decorator;

import decorator.Finery;

public class BigTrouser extends Finery {
    @Override
    public void show() {
        System.out.print(" 大垮裤");
        super.show();
    }
}
