package singleton_pattern;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * @author sky-bai
 */
public class MyClass {
    private static MyClass singleton;

    private MyClass() {

    }

    public static MyClass getInstance() {
        if (singleton == null) {
            singleton = new MyClass();
        }
        return singleton;
    }

    public static void main(String[] args) {
        Iterator<Object> iterator = new LinkedHashSet<Object>().iterator();
        Iterator<Object> iterator1 = new LinkedList<Object>().iterator();
        MyClass i1 = MyClass.getInstance();
        MyClass i2 = MyClass.getInstance();

        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        System.out.println(i1.equals(i2));
    }
}
