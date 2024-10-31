import java.util.Scanner; 
public class Exercice4CelsiusEnFahrenheit { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Donner la temperature en Celsius : "); 
 
        int celsius = scanner.nextInt(); 
        float fahrenheit = (9f / 5) * celsius + 32; 
 
        System.out.printf("%d degres Celsius equivalent a %.2f degres Fahrenheit", celsius, fahrenheit); 
        scanner.close(); 
    } 
}