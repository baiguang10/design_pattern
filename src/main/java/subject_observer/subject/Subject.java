package subject_observer.subject;

import subject_observer.observer.Observer;

/**
 * 观察者模式：一对多的依赖
 * 设计原则：
 * 1. 抽离变量
 * 2. 面共接口编程，而不是面向实现编程
 * 3. 多用组合，少用继承。编译时确定与运行时确定的区别
 * 4. 交互对象之间的松耦合。
 * 5. 对修改关闭，对扩展开放。
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
