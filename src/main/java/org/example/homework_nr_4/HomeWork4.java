package org.example.homework_nr_4;

public class HomeWork4 {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Вывод элементов массива:");
        for(int index = 0; index != 10; index++){
        System.out.println(array[index]);
        }



        int[] numbers = new int[]{23, 497, 55, 63, 8};
        int sum = 0;
        for(int index2 = 0; index2 != numbers.length; index2++ ){
            sum += numbers[index2];
        }
        double average = sum / numbers.length;

        System.out.println("Сумма значений элементов одномерного массива:");
        System.out.println(sum);

        System.out.println("Среднее значение элементов одномерного массива:");
        System.out.println(average);


        int[][] dimentionaArray = new int[][]{
                {21, 54, 163, 13, 456},
                {987, 406, 1, 23, 88 },
                {46, 129, 543, 85, 3 }
        };
        int even = 0;
        int notEven = 0;
        for(int i = 0; i != dimentionaArray.length; i++) {
            for (int g = 0; g != dimentionaArray[i].length; g++)
                if (dimentionaArray[i][g] % 2 == 0){
                    even++;
                }else{
                    notEven++;
                }


        }
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + notEven);

    String[] names = new String[]{"Alex", "Nikita", "Pavel", "Victor", "Danil"};
    String[] cnames = new String[names.length];



    }
}
