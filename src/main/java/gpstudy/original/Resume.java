package gpstudy.original;

public class Resume implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public original.Resume clone() throws CloneNotSupportedException {
        return (original.Resume)super.clone();
    }

    @Override
    public String toString() {
        return "名称 : "+name+"\n 性别 : "+sex+"\n 年龄 : "
                +age+"\n 工作年限 :"+timeArea +"\n 公司 :"+company;
    }
}
