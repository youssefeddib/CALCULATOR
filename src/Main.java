import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;

        while (true) {
            System.out.println("Bienvenue dans la calculatrice !");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Puissance");
            System.out.println("6. Racine carrée");
            System.out.println("7. Factorielle");
            System.out.println("8. Quiter");

            System.out.print("Choisissez une opération: ");
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.print("Entrez le premiere nombre: ");
                    num1 = scanner.nextDouble();

                    System.out.println("Choisissez Le deuxième :");
                    num2 = scanner.nextDouble();
                    Addition(num1,num2);
                    break;
                case 2:
                    System.out.print("Entrez le premiere nombre: ");
                    num1 = scanner.nextDouble();

                    System.out.println("Choisissez Le deuxième :");
                    num2 = scanner.nextDouble();
                    Soustraction(num1,num2);
                    break;
                case 3:
                    System.out.print("Entrez le premiere nombre: ");
                    num1 = scanner.nextDouble();

                    System.out.println("Choisissez Le deuxième :");
                    num2 = scanner.nextDouble();
                    Multiplication(num1,num2);
                    break;
                case 4:
                    System.out.print("Entrez le premiere nombre: ");
                    num1 = scanner.nextDouble();

                    System.out.println("Choisissez Le deuxième :");
                    num2 = scanner.nextDouble();
                    Division((int)num1,(int)num2);
                    break;
                case 5:
                    System.out.print("Entrez le premiere nombre: ");
                    num1 = scanner.nextDouble();

                    System.out.println("Choisissez Le deuxième :");
                    num2 = scanner.nextDouble();
                    Puissance(num1,num2);
                    break;
                case 6:
                    System.out.print("Entrez le premiere nombre: ");
                    num1 = scanner.nextDouble();
                    RacineCarre(num1);
                    break;
                case 7 :
                    System.out.print("Entrez le premiere nombre: ");
                    num1 = scanner.nextDouble();
                    Factorielle(num1);
                    break;
                case 8 :
                    System.out.print("au revoir !!!: ");
                default:
                    System.out.println("Choix invalide !!");
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
    public static void RacineCarre(double a){
        System.out.println("RacineCarrée : " + Math.sqrt(a));
}
    public static void Factorielle(double a){
        int res,i;

        res=1;
        for(i=1;i<=a;i++){
            res = res * i ;
        }
        System.out.println("Factorielle est : "+res);


    }

}