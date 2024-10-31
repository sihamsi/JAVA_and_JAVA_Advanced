
import java.util.Scanner; 
public class Exercice2CalculatriceAddition { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Entrer le premier nombre : "); 
        int nombre1 = scanner.nextInt(); 
 
        System.out.println("Entrer le deuxieme nombre : "); 
        int nombre2 = scanner.nextInt(); 
 
        System.out.printf("La somme des deux nombres est : %d   ", nombre1 + nombre2); 
        scanner.close(); 
    } 
} 