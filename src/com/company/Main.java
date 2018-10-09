package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);
	System.out.println("What's your name?");
	String name = input.nextLine();
	System.out.println("Hello " + name + ", nice to meet you");
	System.out.println("How old are you " + name + "?");
	String age = input2.nextLine();
	System.out.println("wow, you're " + age);
    }
}
