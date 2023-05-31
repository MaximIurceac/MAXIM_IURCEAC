package org.example.homework_nr_15;

public class Main {


    public static void main(String[] args) throws InterruptedException {

//        1.Напишите короткую программу, которая печатает «Hello world» из потока.
        Thread task1 = new Thread(() -> System.out.println("Hello world!"));
        task1.start();
        task1.join();

//        2.Теперь измените программу так, чтобы она печатала «Hello world» пять раз, по одному разу из каждого из пяти разных тем.
        for (int i = 1; i <= 5; i++) {
            Thread task2 = new Thread(() -> System.out.print(ThreadColor.ANSI_BLUE + "Hello world! "));
            task2.start();
            task2.join();
//        3.Теперь измените напечатанную строку, включив в нее номер потока; Убедитесь что все потоки имеют уникальный номер потока.
            System.out.println(ThreadColor.ANSI_BLACK + task2 + Thread.currentThread().getName());
        }
//        4.Напишите короткую программу, в которой два потока увеличивают общее целое число повторно, без надлежащей синхронизации, 1 000 000 раз, вывезти в консоль результат в конце программы.
        CountToMill count = new CountToMill();
        Thread t1 = new Thread(new CounterToMill(count));
        Thread t2 = new Thread(new CounterToMill(count));

        t1.setName("Thread1");
        t2.setName("Thread2");

        t1.start();
        t2.start();

//        5.Теперь измените программу для использования синхронизации, чтобы гарантировать, что приращение в общей переменной является синхронизированным.
        SynCountToMill count2 = new SynCountToMill();
        Thread t3 = new Thread(new SynCounterToMill(count2));
        Thread t4 = new Thread(new SynCounterToMill(count2));

        t3.setName("Thread3");
        t4.setName("Thread4");

        t3.start();
        t4.start();
    }

}


