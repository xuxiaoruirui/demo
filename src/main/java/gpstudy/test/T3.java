package gpstudy.test;

public class T3 {
    public static void main(String[] args) {
  /*      String s="5_06399440227976022.jpg";
        StringBuffer stringBuffer = new StringBuffer(null);
        String[] split = s.split(".");
        StringBuffer insert = stringBuffer.insert(s.indexOf("."), "_60");
        System.out.println(1);*/
        String a="Aa";
        String b="BB";
        Long l=120000L;
        Long l2=1300000L;
        String m=l.toString()+l2.toString();
        System.out.println(m);
        System.out.println(Integer.valueOf(m));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

    }
}
