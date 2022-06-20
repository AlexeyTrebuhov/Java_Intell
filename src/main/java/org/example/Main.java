package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Написать программу вычисления n -ного треугольного числа

                System.out.println("Input member n : ");
                Scanner scanner = new Scanner(System.in);
                int x = scanner.nextInt();
                scanner.close();

                int a  = 0;
                int sum = 0;
                int count = 0;

                while (count <= x) {
                    a = a + 1;
                    sum = sum + a;
                    count = count + 1;
                }

                System.out.println("triangular number " + x + " level = " + sum);
            }
        }


