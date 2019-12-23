package decorator;

public class Client {
    public static void main(String[] args) {
        Person person=new Person("小菜");
        TShirts t=new TShirts();
        BigTrouser b=new BigTrouser();

        t.decorate(person);
        b.decorate(t);
        b.show();
    }
}
