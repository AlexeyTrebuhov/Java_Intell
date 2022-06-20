// Написать программу вычисления n -ного  треугольного числа

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
    
        System.out.println("Введите число n : ");
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
        
        System.out.println("Треугольное число " + x + " порядка = " + sum);
   }
}
