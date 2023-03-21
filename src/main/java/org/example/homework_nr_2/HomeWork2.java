package org.example.homework_nr_2;

public class HomeWork2 {
    public static void main(String[] args){
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
       for(int counter = 100; counter <=1000; counter ++) {
           if(counter % 5 != 0)
               continue;
           System.out.println(counter);
       }

        int number = 3; // Возводимое в степень число
        int result = 1; // Результат возведения в степень
        int power = 1; // Начальный показатель степени
        while(power <= 10) { // условие входа в цикл
            result = result * number;
            System.out.println(number + " в степени " + power + " = " + result);
            power++;
        }
    }
       }








