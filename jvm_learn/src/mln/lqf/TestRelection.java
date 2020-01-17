package mln.lqf;

import sun.reflect.Reflection;

public class TestRelection {
    public static void main(String[] args) {
        Class<?> classLoader = Reflection.getCallerClass();
        System.out.println(classLoader);
        //System.out.println(classLoader.getClasses());
        //System.out.println(classLoader.getSuperclass());
    }
}
