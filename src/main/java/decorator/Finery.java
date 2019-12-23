package decorator;

public class Finery extends Person {
  private  Person person;

    /**
     * @param person
     * 打扮
     */
   public void decorate(Person person){
        this.person=person;
   }

    @Override
    public void show() {
       if(person!=null)
        person.show();
    }
}
