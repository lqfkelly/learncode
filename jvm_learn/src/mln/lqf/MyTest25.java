package mln.lqf;

/**
 * 当前线程加载器为当前类加载器（系统类加载器）
 * 父类为扩展类加载器
 */
public class MyTest25 implements Runnable {
    private Thread thread;

    public MyTest25(){
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        ClassLoader classLoader = this.thread.getContextClassLoader();
        this.thread.setContextClassLoader(classLoader);

        System.out.println("Class:" + classLoader.getClass());
        System.out.println("Parent:" + classLoader.getParent().getClass());
    }

    public static void main(String[] args) {
        new MyTest25();
    }
}
