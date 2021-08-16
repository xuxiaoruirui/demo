package gpstudy.test;

import com.alibaba.druid.util.StringUtils;

public class T4 {
    public static void main(String[] args) {
        String mustNotMatchStr=",111=1";

        if ( !StringUtils.isEmpty(mustNotMatchStr)) {
            for (String mustNotStr : mustNotMatchStr.split(",")) {
                String[] keyAndValue = mustNotStr.split("=");
                System.out.println(keyAndValue[1]);
            }
        }
    }

}
