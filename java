import java.util.Scanner;


public class Main {
 public static void Addition(double a, double b) {
        System.out.println("addition : " + (a + b));
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenue dans la calculatrice !");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Puissance");
            System.out.println("6.Racine carrée");
            System.out.println("7.Factorielle");

            System.out.print("Choisissez une opération: ");
            double num1 = scanner.nextDouble();

            System.out.print("Entrez le premiere nombre: ");
            double num2 = scanner.nextDouble();
            System.out.println("Choisissez Le deuxième :");


