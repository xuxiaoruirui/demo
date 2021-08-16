package gpstudy.strategy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class HtmlUtil {
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

        Document parse = Jsoup.parse(html);

    }
}
