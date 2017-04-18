package net.goit.homework2;

import java.util.Scanner;

/**
 * Created by asus on 18.04.17.
 */
public class HomeWork2 {

    public static void main(String[] args) {

        System.out.print("Ведите количество элементов массива: ");
        Scanner col = new Scanner(System.in);
        String Col = col.next();

        int[] mArr = new int[Integer.parseInt(Col)];

        System.out.println("Выберите метод заполнения массива: ");
        System.out.println();
        System.out.print("1 - автоматически, или 2 - вручную : ");

        Scanner autoMas = new Scanner(System.in);
        String AutoMas = autoMas.next();

        switch (Integer.parseInt(AutoMas)) {

            case 1: {
                //Автоматическое заполнение массива
                    for (int i = 0; i < Integer.parseInt(Col); i++) {
                    int rCount = -30 + (int) (Math.random() * 90);
                    mArr[i] = rCount;
                }
            }
            break;

            case 2: {
                //Ручное заполние массива
                for (int i = 0; i < Integer.parseInt(Col); i++) {
                    System.out.print("Ведите " + i + " элемен массива: ");
                    Scanner mas = new Scanner(System.in);
                    String Mas = col.next();
                    mArr[i] = Integer.parseInt(Mas);
                }
                break;
            }
             default:
                    break;

       }
        System.out.println();
        System.out.println("Ваш массив");

        for (int i = 0; i < mArr.length; i++) {
            System.out.print(mArr[i] + " ");
        }

        /**
        * Сортировка масива
        */

        for (int i = mArr.length - 1; i >= 2; i--) {

        boolean sort = true;

        for (int j = 0; j < i; j++) {
                if (mArr[j] > mArr[j+1]) {
                    int temp = mArr[j];
                    mArr[j] = mArr[j+1];
                    mArr[j+1] = temp;
                    sort = false;
                }
            }
            if(sort) {
                break;
            }
        }
        System.out.println();

        System.out.println("Отсортированный масив");

        for (int i = 0; i < mArr.length; i++) {
            System.out.print(mArr[i] + " ");
        }

    }
}

