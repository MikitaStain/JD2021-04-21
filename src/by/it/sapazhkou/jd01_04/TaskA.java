package by.it.sapazhkou.jd01_04;

import java.util.Scanner;

public class TaskA {

    public static void main(String[] args) {
        printMulTable();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        buildOneDimArray(line);
    }

    static void printMulTable() {
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%1d*%1d=%-2d ", i, j, i * j);
            }
            System.out.println();
        }
    }

    static void buildOneDimArray(String line) {
        double[] resultArray = InOut.getArray(line);
        double firstElement = resultArray[0];
        double lastElement = resultArray[resultArray.length - 1];
        InOut.printArray(resultArray, "V", 5);
        Helper.sort(resultArray);
        InOut.printArray(resultArray, "V", 4);
        int indexFirstElement = -1;
        int indexLastElement = -1;
        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i] == firstElement) {
                indexFirstElement = i;
            }
            if (resultArray[i] == lastElement) {
                indexLastElement = i;
            }
        }
        System.out.printf("" +
                "Index of first element=%1d" + "%n" +
                "Index of last element=%1d", indexFirstElement, indexLastElement);
        System.out.println();
    }
}
