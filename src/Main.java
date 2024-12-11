import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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


            int choix = scanner.nextInt();


            double resultat = 0;
            switch (choix) {
                case 1:
                    Addition(num1, num2);
                    break;
                case 2:
                    Soustraction(num1,num2);
                    break;
                case 3:
                    Multiplication(num1,num2);
                    break;
                case 4:
                    Division((int)num1,(int)num2);
                    break;
                case 5:
                    Puissance(num1,num2);
                    break;
                case 6:
                    RacineCarrée(num1);
                    break;
            }

        }
    }

    public static void Addition(double a, double b) {
        System.out.println("addition : " + (a + b));
    }
    public static void Soustraction(double a,double b){
        System.out.println("soustraction : " + (a-b));
    }
    public static void Multiplication(double a,double b){
        System.out.println("Multiplication  : " + (a*b));
    }
    public static void Division(int a,int b){
        System.out.println("Division  : " + (a/b));
    }
    public static void Puissance(double a, double b){
        System.out.println("Puissance : " + Math.pow(a,b));
    }
    public static void RacineCarrée(double a){
        System.out.println("RacineCarrée : " + Math.sqrt(a));
}}