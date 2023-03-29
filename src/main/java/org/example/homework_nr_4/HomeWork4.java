package org.example.homework_nr_4;

public class HomeWork4 {

    public static void main(String[] args) {
        int[] array1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Вывод элементов массива:");
        for(int index = 0; index != 10; index++){
        System.out.println(array1[index]);
        }



        int[] array2 = new int[]{23, 497, 55, 63, 8};
        int sum = 0;
        for(int index2 = 0; index2 != array2.length; index2++ ){
            sum += array2[index2];
        }
        double average = sum / array2.length;

        System.out.println("Сумма значений элементов одномерного массива:");
        System.out.println(sum);

        System.out.println("Среднее значение элементов одномерного массива:");
        System.out.println(average);


        int[][] array3 = new int[][]{
                {21, 54, 163, 13, 456},
                {987, 406, 1, 23, 88 },
                {46, 129, 543, 85, 3 }
        };
        for(int i = 0; i <=1000; counter ++) {
            if (counter % 5 != 0)
        }

    }
}
