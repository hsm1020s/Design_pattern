package org.example;

import java.io.File;

public class newmain {
    public static void main(String[] args) {
        System.out.println(new File("abc.txt").equals(new File("ABC.txt")));
    }
}
