package gpstudy.strategy;

import org.jsoup.Jsoup;

import java.util.Arrays;
import java.util.stream.Collectors;

public class T2 {
    public static void main(String[] args) {
        String html="<form id=\"payFormAutoSubmit\" name=\"payFormAutoSubmit\" action=\"https://mapi.alipaydev.com/gateway.do?_input_charset=UTF-8\" method=\"POST\">\n" +
                "<input type=\"hidden\" name=\"_input_charset\" value=\"UTF-8\"/>\n" +
                "<input type=\"hidden\" name=\"body\" value=\"test\"/>\n" +
                "<input type=\"hidden\" name=\"currency\" value=\"USD\"/>\n" +
                "<input type=\"hidden\" name=\"notify_url\" value=\"https://capi-stage.gshopper.com\"/>\n" +
                "<input type=\"hidden\" name=\"out_trade_no\" value=\"Qasascz00011120\"/>\n" +
                "<input type=\"hidden\" name=\"partner\" value=\"2088621915819390\"/>\n" +
                "<input type=\"hidden\" name=\"product_code\" value=\"NEW_OVERSEAS_SELLER\"/>\n" +
                "<input type=\"hidden\" name=\"return_url\" value=\"http://www.baidu.com\"/>\n" +
                "<input type=\"hidden\" name=\"rmb_fee\" value=\"0\"/>\n" +
                "<input type=\"hidden\" name=\"service\" value=\"create_forex_trade\"/>\n" +
                "<input type=\"hidden\" name=\"sign\" value=\"bCYIuLYLFLfMqCauFM+WuJAc/0Lz7QB/PtOuXmIxQYIACgD9BYac3cV/0GeCMcYC3Sgq0fL4A2yWCSEdmrB93vAnvfhrfvrpQ1zBVmsg22VpZ8+X/FZYaDdNnOiz+QTQUTMDrn/9pKUoPj2XAzbJoVfj/cLtFiVP7qJYaskFVyfz+5zfvvtkEnyz8uAQ0fvvDqG6sfHcsPSlTU8NjNpJvf6VmDCrfOCzWrIG0GVdkAIMFcutq4D0fOOSfjoXB7C9N112Hmlo9Of3iiu0EIkYEqGkQJn1BJFHwGxOZprrYAzNomUOiZNL0hx3pnnMCOwhNIGxYfHWgU3WLRP/ncrWYw==\"/>\n" +
                "<input type=\"hidden\" name=\"sign_type\" value=\"RSA\"/>\n" +
                "<input type=\"hidden\" name=\"subject\" value=\"test12a3\"/>\n" +
                "<input type=\"hidden\" name=\"timeout_rule\" value=\"12h\"/>\n" +
                "<input type=\"submit\" value=\"payFormAutoSubmit\" style=\"display:none;\">\n" +
                "</form><script>document.forms['payFormAutoSubmit'].submit();</script>";

        String s="partner=\"2088621915819390\"&seller_id=\"2088621915819390\"&out_trade_no=\"Qasascz00011120\"&subject=\"test12a3\"&body=\"test\"&rmb_fee=\"1.20\"&currency=\"USD\"&forex_biz=\"FP\"&notify_url=\"https://capi-stage.gshopper.com\"&service=\"mobile.securitypay.pay\"&payment_type=\"1\"&_input_charset=\"UTF-8\"&it_b_pay=\"12h\"&product_code=\"NEW_WAP_OVERSEAS_SELLER\"&refer_url=\"null\"&trade_information=\"null\"&sign=\"hPPV44DJEELXxutoRIFV%2BBoSuw9Ueyml8FhorYie%2B3qJjcCQLphdeM%2FdpauXwe2Yq5108bC4V7uypt%2Bg%2FJgmOHYT2ZX42l5p6kMRIPEtcP78LZAFMjNpwBLoKUsnuolpchVYMufSGzpZLw9uOmXK2H6q6dDfEdpLQ4hVCyhOTn5tr2gFvUlcktZIcANQuqt%2FemOSTWRsrJulXs2uS%2F%2BG%2BxL7V4SSauPaynTj%2FTerUwO522kis9ccDz9nNY3yZo2jjEJF1xsJVI%2Fr9wR27%2FYqCT0BMFY0wHvI7qLfZCNdvS%2FhC5L1HMbFmALyorfeug%2FENqgxbMu0k0oKSK7vFpOqEQ%3D%3D\"&sign_type=\"RSA\"";
        String collect = Arrays.asList(s.split("&"))
                .stream()
                .filter(m -> m.contains("sign="))
                .collect(Collectors.joining());

        String attr = Jsoup.parse(html).getElementsByAttributeValue("name", "sign").get(0).attr("value");
        System.out.println(collect);
    }
}
