import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
        System.out.println("Bienvenue dans la calculatrice !");
        System.out.println("Choisissez une opération:");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Puissance");
        System.out.println("6.Racine carrée");
        System.out.println("7.Factorielle");

        System.out.print("Entrez le premier nombre: ");
        double num1  = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre: ");
        double num2 = scanner.nextDouble();


        int choix = scanner.nextInt();

        double resultat = 0;

    }
}}