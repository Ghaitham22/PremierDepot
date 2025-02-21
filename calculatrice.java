import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez le premier nombre : ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Entrez l'opérateur (+, -, *, /) : ");
        char operateur = scanner.next().charAt(0);
        
        System.out.print("Entrez le deuxième nombre : ");
        double num2 = scanner.nextDouble();
        
        double resultat;
        
        switch (operateur) {
            case '+':
                resultat = num1 + num2;
                break;
            case '-':
                resultat = num1 - num2;
                break;
            case '*':
                resultat = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultat = num1 / num2;
                } else {
                    System.out.println("Erreur : Division par zéro !");
                    return;
                }
                break;
            default:
                System.out.println("Opérateur non valide !");
                return;
        }
        
        System.out.println("Résultat : " + resultat);
        scanner.close();
    }
}
