package org.example.homework_nr_15;
//        6.Напишите короткую программу, в которой один поток увеличивает целое число 1 000 000 раз, а второй поток печатает целое число без ожидая его окончания.
//        7.Теперь измените программу, чтобы она использовала условную переменную для сигнала о завершении задачи добавления первым потоком до того, как второй поток напечатает значение. (Hint: wait() and notifyAll() или используйте любой другой вариант)

public class ConsAndProd {
    public static void main(String[] args){
        Numbers numbers = new Numbers();
        new Thread(new Inscriber(numbers)).start();
        new Thread(new Reader(numbers)).start();
    }

    static class Numbers {

        private int number;
        private boolean empty = true;

        public synchronized int read() {
            while (empty) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            empty = true;
            notifyAll();
            return number;
        }

        public synchronized void inscribe(int number) {
            while (!empty) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            empty = false;
            this.number = number;

            notifyAll();
        }
    }
}

class Inscriber implements Runnable {

    private ConsAndProd.Numbers number;

    public Inscriber(ConsAndProd.Numbers number) {
        this.number = number;
    }

    @Override
    public void run() {
        int[] array = new int[1000001];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int element :
                array) {
            number.inscribe(element);
        }
    }
}

class Reader implements Runnable {

    private ConsAndProd.Numbers number;

    public Reader(ConsAndProd.Numbers number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int tempNumber = number.read(); tempNumber < 1000001; tempNumber = number.read()) {
            System.out.println(tempNumber);
        }
    }
}

