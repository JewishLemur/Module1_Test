package com.company;

public class Main {

    public static void main(String[] args) {

    }



    //____________________________________Первое Задание__________________________________________
    static void firstTask() {
        int i = 573, j = -1;
        String myString = "J = ";
        System.out.println(myString + j);
    }



    //_____________________________________Второе Задание________________________________________
    static void secondTask() {
        double pi = 3.14159265358979;
        System.out.println("PI = " + pi);
    }



    //________________________________________Третье Задание____________________________________
    static void thirdTask() {
        int result = math(1346, 36);
        System.out.println(result);
    }

    static int math(int secondInt, int firstInteger) {
        return secondInt + firstInteger;
    }



    //_________________________________________Четвертое Задание_________________________________
    static void fourthTask() {
        boolean result = isDivisibleThree(9);
        System.out.println(result);
    }

    static boolean isDivisibleThree(int num) {
        if (num % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }



    //_____________________________Пятое Задание__________________________________________________
    static boolean fifthTask(int x, int fromA, int toB, int fromSecondA, int toSecondB) {
        if ((x >= fromA && x <= toB) || (x >= fromSecondA && x <= toSecondB)) return true;
        else return false;
    }



    //______________________________Шестое Задание_________________________________________________
    static void sixthTask(int[] someArray, int last) {
        for (int i = 0; i < someArray.length / 2; i++) {
            int tmp = someArray[i];
            someArray[i] = someArray[last];
            someArray[last] = tmp;
        }
    }


    //______________________________Седьмое Задание_________________________________________________
    static void SeventhTask(int [] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++ ){
            max = Math.max(max , array[i]);
        }
        System.out.println(max);
    }
    //______________________________________________________________________________________________

}

