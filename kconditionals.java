package com.company;

import java.util.Scanner;

public class kconditionals {
    public static void main(String[] args) {
        //fibbonachi series
        Scanner nn = new Scanner(System.in);
        int n = nn.nextInt();
        int a = 0;

        int b = 1;
        int c = 2;
        System.out.print(a +" " +b+ " ");
        for(int i=2;i<=n;i++){
            c = a+ b;
            a = b;
            b = c;
            System.out.print(c+ " ");
    }

}
}
