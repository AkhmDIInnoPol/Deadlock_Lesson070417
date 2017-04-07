package com.company;

public class Main {


    private static Object object1 = new Object();

    private static Object object2 = new Object();

    public static void main(String[] args) {
	// write your code here


            DeadLockClass deadLockClass = new DeadLockClass(object1, object2);
            DeadLockClass2 deadLockClass2 = new DeadLockClass2(object1, object2);

            deadLockClass.start();
            deadLockClass2.start();

    }
}
