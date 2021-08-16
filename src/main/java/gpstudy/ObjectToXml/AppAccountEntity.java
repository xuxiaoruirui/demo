package gpstudy.ObjectToXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="orders version=4.0" )
public class AppAccountEntity {

    private String s_id;

    private String order_id_parent;

    private String order_id;

    private String order_time;

    private String uid;

    private String uname;

    private String tc;

    private String pay_time;

    private String status;

    private String locked;

    private String lastmod;

    private String is_newbuyer;

    private String platform;

    private List<Product> product;

    @XmlElement(name = "ProductList")
    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getOrder_id_parent() {
        return order_id_parent;
    }

    public void setOrder_id_parent(String order_id_parent) {
        this.order_id_parent = order_id_parent;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getPay_time() {
        return pay_time;
    }

    public void setPay_time(String pay_time) {
        this.pay_time = pay_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    public String getLastmod() {
        return lastmod;
    }

    public void setLastmod(String lastmod) {
        this.lastmod = lastmod;
    }

    public String getIs_newbuyer() {
        return is_newbuyer;
    }

    public void setIs_newbuyer(String is_newbuyer) {
        this.is_newbuyer = is_newbuyer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
