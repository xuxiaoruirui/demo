package gpstudy.ObjectToXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Product")
public class Product {


    private String spuName;


    public String getSpuName() {
        return spuName;
    }
    @XmlElement(name="spuName")
    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

}
