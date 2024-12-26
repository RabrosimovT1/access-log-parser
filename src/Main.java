import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите число b: ");
        int b = new Scanner(System.in).nextInt();
        //Сумма чисел
        int s = a+b;
        System.out.println("a+b= " + s);
        //Разность чисел
        int r = a-b;
        System.out.println("a-b= " + r);
        //Произведение чисел
        int p = a*b;
        System.out.println("a*b =" + p);
        //Деление чисел
        double q = (double) a/b;
        System.out.println("a/b =" +  q);
    }
}