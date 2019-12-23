package original;

public class Realizetype implements Cloneable {
    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        return (Realizetype)super.clone();
    }
}
