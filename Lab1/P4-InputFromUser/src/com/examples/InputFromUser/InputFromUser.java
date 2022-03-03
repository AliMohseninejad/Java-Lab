package com.examples.InputFromUser;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in) ;
        String MyInput = scanner.nextLine() ;
        System.out.printf("%s received!", MyInput);
    }
}
