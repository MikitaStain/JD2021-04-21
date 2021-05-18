package by.it.voronko.jd01_02;

import java.util.Scanner;

public class TaskA {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]array=new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=scanner.nextInt();
        }
        step1(array);
        step2(array);
        step3(array);
        
    }

    private static void step3(int[] array) {
        int min=array[0];

        for (int element:array){
            if (min<element) {
                min=element;
            }
            for (int i = array.length-1; i >=0 ; i--) {
                if (array[i]==min)
                    System.out.print(i +" ");
            }
                
            }
          
    }

    private static void step2(int[] array) {
        double s=0;
        for (int element : array) {
            s=s+element;
        }
s=s/array.length;
        for (int element : array){
            if (element<s)
                System.out.println(element+" ");
                    }
    }

    private static void step1(int[] array) {
        int min=array[0];
        int max=array[0];
        for (int element = 0; element < array.length ; element++) {
            if (min<array[element]) {
                min=element;
            }
            if (min>array[element]){
                max=element;
            }
        }
        System.out.print(min+" "+max);
    }

}
