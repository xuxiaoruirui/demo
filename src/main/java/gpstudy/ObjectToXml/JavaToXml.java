package gpstudy.ObjectToXml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.ByteArrayOutputStream;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class JavaToXml {

    public static void main(String[] args) throws Exception{
        //LocalDateTime.parse("1610640475235", DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        System.out.println( LocalDateTime.parse("1610640475", DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
        LocalTime.parse("1610640475");
        List list = new ArrayList();
        AppAccountEntity appAccountEntity = new AppAccountEntity();
        appAccountEntity.setIs_newbuyer("1");
        appAccountEntity.setLastmod("0");
        Product product=new Product();
        List<Product> list1=new ArrayList<>();

        product.setSpuName("xuxu");
        list1.add(product);

        Product product2=new Product();
        product.setSpuName("xuxu1");
        list1.add(product2);
        appAccountEntity.setProduct(list1);

        list.add(appAccountEntity);
        AppAccountListVO authVO = new AppAccountListVO(list);

        JAXBContext context = JAXBContext.newInstance(AppAccountListVO.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        //marshaller.setProperty(Marshaller.J);
        //marshaller.marshal(authVO,System.out);
        // 打印到控制台

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        marshaller.marshal(authVO, baos);

        String xmlObj = new String(baos.toByteArray());
        // 生成XML字符串
        System.out.println(xmlObj);
    }
}
