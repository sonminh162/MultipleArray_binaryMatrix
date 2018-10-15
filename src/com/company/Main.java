package com.company;

import java.util.Scanner;


public class Main {
    public static void printMatrix(int n){
        int[][] array;
        int i,j,x;
        array = new int[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++) {
                array[i][j]= (int)(Math.random()*2)+0;
            }
        }
        for(i=0;i<n;i++){
            System.out.print("\n");
            for(j=0;j<n;j++)
                System.out.print(array[i][j]+"\t");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("khai bao kich thuoc ma tran:");
        n = scanner.nextInt();
        printMatrix(n);
    }
}
