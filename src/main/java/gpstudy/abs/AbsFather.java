package gpstudy.abs;

public abstract class AbsFather {
     void t1(){
         System.out.println(0);
     }
    void t2(){
       this.t1();
    }
}
