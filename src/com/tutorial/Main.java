package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("====G A N J I L - G E N A P====");
        System.out.println("===============================");

        Scanner input = new Scanner(System.in);
        System.out.print("Inputan Nilai = ");
        int value = input.nextInt();


        if (value % 2 > 0){
            System.out.println(value + " merupakan bilangan ganjil");
        }else {
            System.out.println(value + " merupakan bilangan genap");
        }
        main(args);
    }
}
