import java.util.Scanner;
import src.QuadraticEquation;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Phuong trinh bac 2---");
        System.out.println("Nhap gia tri a :");
        double a = scanner.nextDouble();
        System.out.println("Nhap gia tri b :");
        double b = scanner.nextDouble();
        System.out.println("Nhap gia tri c :");
        double c = scanner.nextDouble();

        QuadraticEquation q = new QuadraticEquation(a, b, c);

        System.out.println(q.getDiscriminant());
    }
}
