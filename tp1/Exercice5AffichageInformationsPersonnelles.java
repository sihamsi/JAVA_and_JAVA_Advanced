import java.util.Scanner;
public class Exercice5AffichageInformationsPersonnelles { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Veuillez entrer votre nom : "); 
        String nom = scanner.nextLine(); 

        System.out.print("Veuillez entrer votre age : "); 
        int age = scanner.nextInt(); 

        Personne personne = new Personne(nom, age); 

        personne.afficherInfos(); 

        scanner.close(); 
    } 
    static class Personne { 
        private String nom; 
        private int age; 

        public Personne(String nom, int age) { 
            this.nom = nom; 
            this.age = age; 
        } 

        public void afficherInfos() { 
            System.out.println("Nom : " + nom); 
            System.out.println("Age : " + age); 
        } 
    }
}
