package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        arrayDesign();
        System.out.println("hellow world");
    }

    static int indexOfArray = 10;

    static void arrayDesign () {

        System.out.println("----------");
        for (int i = 0; i < indexOfArray; i++) {

            int randomVal = (int) (Math.random() *5) + 10;

              System.out.println(" | "+i+ " | "+ randomVal + " | ");
        }
        System.out.println("----------");
    }
}




