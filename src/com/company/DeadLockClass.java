package com.company;

/**
 * Created by admin on 07.04.2017.
 */
public class DeadLockClass extends Thread {


    private Object object1;

    private Object object2;


    public DeadLockClass(Object obg1, Object obj2)
    {
        object1 = obg1;
        object2 = obj2;
    }


    @Override
    public void run() {


        synchronized (object1)
        {
            System.out.println("Thread1 entered to synchronized of object1");

            for (int i = 0; i < 1000000000; i++)
            {

            }

            synchronized (object2)
            {
                System.out.println("Thread1 entered to synchronized of object2");
            }

        }


        System.out.println("End deadLockClass1");

    }
}
