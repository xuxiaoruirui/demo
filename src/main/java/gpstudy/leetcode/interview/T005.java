package gpstudy.leetcode.interview;

import cn.hutool.Hutool;
import cn.hutool.core.util.IdcardUtil;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class T005 {

    public boolean oneEditAway(String first, String second) {
        //IdcardUtil.isValidCard();
        int fLen = first.length();
        int sLen = second.length();
        Map map=new ConcurrentHashMap();
        Map map1=new Hashtable();
        Map map2=new Hashtable();
        /*map.put();
        map1.put();
        map1.get();*/
        boolean flg = fLen > sLen;

        int len=fLen;
        int value = fLen-sLen;
        if (flg) {
            len=sLen;
            value = sLen - fLen;
        }
        if(value==2){
            return false;
        }
        if(value==1){
            for (int i = 0,j=0; i <len ; i++) {


            }
        }

        return false;
    }
}
