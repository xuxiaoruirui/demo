package gpstudy.ObjectToXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="AppAccountList")
public class AppAccountListVO {

    private List<AppAccountEntity> appAccountList;

    public AppAccountListVO() {}

    public AppAccountListVO(List<AppAccountEntity> appAccountList) {
        this.appAccountList = appAccountList;
    }

    public List<AppAccountEntity> getAppAccountList() {
        return appAccountList;
    }

    @XmlElement(name="AppAccount")
    public void setAppAccountList(List<AppAccountEntity> appAccountList) {
        this.appAccountList = appAccountList;
    }
}