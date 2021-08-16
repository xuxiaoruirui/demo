package gpstudy.original;

import original.Resume;

/**
 * 原件模式
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume=new Resume();
        resume.setName("xr");
        Resume resume2=resume.clone();
        resume.setAge("22");
        resume2.setAge("44");
        System.out.println(resume);
        System.out.println(resume2);
    }
}
