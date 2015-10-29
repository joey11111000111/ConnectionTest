package test.the.connection;

/**
 * Created by joey on 2015.10.29..
 */
public class NewStuffTest {

    static void test(MyFuncInt myFuncInt) {
        myFuncInt.onlyFunction(30);
        Runnable runnable = () -> System.out.println("Lefutott, ahogy kellett");
        MyFuncInt myFuncInt1 = value -> {
            System.out.println("first stuff happened " + value);
            System.out.println("second stuff happened " + value * 2);
            System.out.println("third stuff happened " + value * 3);
        };
        myFuncInt1.onlyFunction(12);

        Thread thd = new Thread(runnable);
        thd.setDaemon(true);
        System.out.println("Starting thread...");
        thd.start();
    }



}//class
