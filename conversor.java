//versão com Scanner.
import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-Vindo ao conversor de temperatura");

        while (true) {
            
            System.out.println("\n Escolha uma opção:");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.println("3 - Sair");

            int opção = scanner.nextInt();

            if (opção == 1) {
               System.out.println("Digite a temperatura em celsius:");
               double celsius = scanner.nextDouble();
               double fahrenheit = celsiusParaFahrenheit(celsius);
               System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
            } else if (opção == 2) {
                System.out.println("Digite a temperatura em fahrenheit:");
                double fahrenheit = scanner.nextDouble();
                double celsius = fahrenheitParaCelsius(fahrenheit);
                System.out.println("A temperatura em celsius é: " + celsius);
            } else if (opção == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
    
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }
    
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    
}
