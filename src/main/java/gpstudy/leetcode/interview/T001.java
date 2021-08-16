package gpstudy.leetcode.interview;

import java.util.HashMap;
import java.util.Map;

public class T001 {

    public boolean isUnique(String astr) {
        Map<Character,Character> map=new HashMap();
        for (int i=0;i<astr.length();i++){
            Character c = astr.charAt(i);
            Object put = map.put(c, c);
            if (c.equals(put)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
