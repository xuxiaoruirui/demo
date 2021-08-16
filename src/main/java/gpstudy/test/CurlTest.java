package gpstudy.test;

import com.alibaba.fastjson.JSON;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.xml.bind.DatatypeConverter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class CurlTest {
    public static String execCurl(List<String> list) {
        ProcessBuilder process = new ProcessBuilder(list);
        Process p;
        try {
            p = process.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }
            return builder.toString();

        } catch (IOException e) {
            System.out.print("error");
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        post();
      /*  List<String> list=new ArrayList<>();
        list.add("curl");
        list.add("-v");
        list.add("https://api-m.sandbox.paypal.com/v1/oauth2/token");
        list.add("-H");
        list.add("Accept: application/json");
        list.add("-H");
        list.add("Accept-Language: en_US");
        list.add("-u");
        list.add("AXgXpV6jxajyfTb4ptHUT3StpQKDf79ee904hmkaDCm5XWmScTgIKW2wvwdZ5xbS6092_xl8Nm82DU4N:EAsrmfnuijD1sVuWqb719rQNXBxxqVDgNELr9UWPewS2is9nDIhztAw3-sAV570i9ZOWdHtmXH62AyZU");
        list.add("-d");
        list.add("grant_type=client_credentials");
        System.out.println(execCurl(list));*/
        List<String> list1 = new ArrayList<>();
        list1.add("curl");
        list1.add("--location");
        list1.add("--request");
        list1.add("POST");
        list1.add("https://api.sandbox.paypal.com/v1/shipping/trackers-batch");
        list1.add("--header");
        list1.add("Content-Type: application/json");
        list1.add("--header");
        list1.add("Authorization: Bearer A21AALZHEqSuBDVH437au7hEL6KBK6ppBRqnzmxYxlTbzBjHGNt7Tgjq6F4WyCGSLokHBnxYISAceW78ExHc-QYW1uYM1NtuA");
        list1.add("--data-raw");
        list1.add("{\"trackers\":[{\"carrier\":\"OTHER\",\"status\":\"SHIPPED\",\"tracking_number\":\"4\",\"transaction_id\":\"7DT904049S0942252\"}]}");
        //System.out.println(execCurl(list1));
        List<String> list2 = new ArrayList<>();
        list2.add("curl");
        list2.add("-v");
        list2.add("-X");
        list2.add("GET");
        list2.add("https://api.sandbox.paypal.com/v1/shipping/trackers/93166681FW5249918-443844607821");
        list2.add("-H");
        list2.add("Content-Type: application/json");
        list2.add("-H");
        list2.add("Authorization: Bearer A21AALZHEqSuBDVH437au7hEL6KBK6ppBRqnzmxYxlTbzBjHGNt7Tgjq6F4WyCGSLokHBnxYISAceW78ExHc-QYW1uYM1NtuA");
       /* list2.add("-d");
        list2.add("{\"trackers\":[{\"carrier\":\"OTHER\",\"status\":\"SHIPPED\",\"tracking_number\":\"4\",\"transaction_id\":\"7DT904049S0942252\"},{\"carrier\":\"OTHER\",\"status\":\"SHIPPED\",\"tracking_number\":\"7\",\"transaction_id\":\"7DT904049S0942252\"},{\"carrier\":\"OTHER\",\"status\":\"SHIPPED\",\"tracking_number\":\"2\",\"transaction_id\":\"7DT904049S0942252\"},{\"carrier\":\"OTHER\",\"status\":\"SHIPPED\",\"tracking_number\":\"5\",\"transaction_id\":\"7DT904049S0942252\"},{\"carrier\":\"OTHER\",\"status\":\"SHIPPED\",\"tracking_number\":\"1\",\"transaction_id\":\"7DT904049S0942252\"},{\"carrier\":\"OTHER\",\"status\":\"SHIPPED\",\"tracking_number\":\"6\",\"transaction_id\":\"7DT904049S0942252\"},{\"carrier\":\"OTHER\",\"status\":\"SHIPPED\",\"tracking_number\":\"3\",\"transaction_id\":\"7DT904049S0942252\"}]}");
        *///System.out.println(execCurl(list2));
        postTack();
    }
    public static void postTack() {
        List<Integer> palTrackList=new ArrayList<>();
        for (int i=0;i<43;i++){
            palTrackList.add(i);
        }
        int size = palTrackList.size();
        String string ="";
        for (int i = 0; i <= size; i = i + 20) {
            try {
                string = JSON.toJSONString(palTrackList.subList(i, i + 20 > size ? size : i + 20));
                System.out.println(string);
            } catch (Exception e) {
            }
        }
    }
    public static void post(){
        CloseableHttpResponse response = null;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("https://api-m.sandbox.paypal.com/v1/oauth2/token");
        RequestConfig httpConfig = RequestConfig.custom()
                .setConnectTimeout(15000)
                .setConnectionRequestTimeout(15000)
                .setSocketTimeout(15000*10).build();
        httpPost.setConfig(httpConfig);
        String encoding = null;
        try {
            encoding = DatatypeConverter.printBase64Binary("AXgXpV6jxajyfTb4ptHUT3StpQKDf79ee904hmkaDCm5XWmScTgIKW2wvwdZ5xbS6092_xl8Nm82DU4N:EAsrmfnuijD1sVuWqb719rQNXBxxqVDgNELr9UWPewS2is9nDIhztAw3-sAV570i9ZOWdHtmXH62AyZU".getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
                StringEntity stringEntity = new StringEntity("grant_type=client_credentials",
                        ContentType.APPLICATION_FORM_URLENCODED);
                httpPost.setEntity(stringEntity);
            httpPost.setHeader("Content-Type","application/x-www-form-urlencoded");
            httpPost.setHeader("Authorization","Basic "+encoding);
            response = httpClient.execute(httpPost);
            System.out.println(EntityUtils.toString(response.getEntity(), "UTF-8"));
    } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
