package org.example.homework_nr_2;

public class HomeWork2 {
    public static void main(String[] args){

        System.out.println("В зависимости от числа отображается месяц");

        int months = 4;

       switch (months){
           case 1:
               System.out.println("Январь");
               break;
           case 2:
               System.out.println("Февраль");
               break;
           case 3:
               System.out.println("Март");
               break;
           case 4:
               System.out.println("Апрель");
               break;
           case 5:
               System.out.println("Май");
               break;
           case 6:
               System.out.println("Июнь");
               break;
           case 7:
               System.out.println("Июль");
               break;
           case 8:
               System.out.println("Август");
               break;
           case 9:
               System.out.println("Сентябрь");
               break;
           case 10:
               System.out.println("Октябрь");
               break;
           case 11:
               System.out.println("Ноябрь");
               break;
           case 12:
               System.out.println("Декабрь");
               break;

           default:
               System.out.println("Такого месяца нет");

       }
           System.out.println("Все числа от 100 до 1000 которые делятся на 5");


       for(int counter = 100; counter <=1000; counter ++) {
           if(counter % 5 != 0)
               continue;

           System.out.println(counter);
       }

        double sum = 0;
        for (double n = 1; n <= 97; n += 2) {
            sum += n / (n + 2);
        }
        System.out.println("Сумма следующей серии: 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99");

        System.out.println(sum);


        int rows = 9;

        System.out.println("Пирамида");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }

}










