package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums = {11, -8, 61 ,94, -7}; //отсчет ячеек начинается с нуля
        System.out.println(nums[1]);
        System.out.println(nums[3]);
        System.out.println(Arrays.toString(nums));
        nums[4] = 3;
        double [] digits = new double[3]; //каждый элемент с одним значаением, пока не задать ей значение
        // цифра это кол-во ячеек
        //если пусто то там 0.0
        digits[1]=2;
        digits = new double[5];
        int [][] array2D = new int[3][4]; //двумерный массив
        //сначало идет строки потом уже столбцы
        array2D [1][2] = 32;
        System.out.println(Arrays.deepToString(array2D));
        String[][] names = {{"ila", "ajck"}, {"svrta", "dj"}};
        System.out.println(Arrays.deepToString(names));


    }
}
