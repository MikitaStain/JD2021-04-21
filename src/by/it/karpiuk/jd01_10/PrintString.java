package by.it.karpiuk.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintString {
    public static void main(String[] args) {
        Class<String> allmethods = String.class;
        Method[] methods = allmethods.getDeclaredMethods();
        for (Method method : methods) {
            if((method.getModifiers() & Modifier.STATIC) !=Modifier.STATIC)
                System.out.println(method);
        }
    }

    }

