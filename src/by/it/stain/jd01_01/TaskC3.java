package by.it.stain.jd01_01;
/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1.  Метод getWeight(int weight) должен быть статическим.
2.  Метод getWeight должен возвращать значение типа double.
3.  Метод getWeight должен ОБЯЗАТЕЛЬНО округлять до сотых возвращаемое значение
    типа double внутри самого метода.
4.  Метод getWeight не должен ничего выводить на экран.
5.  Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.
6.  Если получится, то пока не используйте в getWeight методы стандартной библиотеки
    (round, ceil, printf, format, и т.п). Возможностей самого языка вполне достаточно.

Пример:

Ввод:
75

Вывод:
29.51

*/

import java.util.Scanner;

class TaskC3 {
    static final double GRAVITATION_MARS = 3.86;
    static final double GRAVITATION_EARTH = 9.81;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(+getWeight(s.nextInt()));

    }


        public static double getWeight(int weight) {


            double weightOnMars = weight/GRAVITATION_EARTH*GRAVITATION_MARS;
            double result =(int)(weightOnMars*100+0.5);

            return result/100 ;

    }




}