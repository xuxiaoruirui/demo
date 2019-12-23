package strategy;

/**
 * 策略模式：
 * 1.策略模式中，定义算法族（策略组），分别封装起来，让他们直接可以相互替换
 * 此模式让算法的变化独立于使用算法的客户
 * 2.中算法体现了几个设计原则，第一，把变化的代码从
 * 不变的代码分离出来；第二，针对接口编程而不是具体类（
 * 定义了策略接口）；第三，多用组合/聚合，少用继承
 * （客户通过使用组合方式使用策略）
 */
public interface Strategy {
    void operation1();
    void operation2();
}
