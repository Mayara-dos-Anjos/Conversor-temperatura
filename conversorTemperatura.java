//versão com JOpitionPane.
import javax.swing.JOptionPane;

public class conversorTemperatura {

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }
    
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        

        JOptionPane.showMessageDialog(null, "Bem-vindo ao Conversor de Temperatura!");


        while (true) {
            
            String opcaoString = JOptionPane.showInputDialog(
                "Escolha a opção desejada:\n"
                + "1 - Celsius para Fahrenheit\n"
                + "2 - Fahrenheit para Celsius\n"
                + "3 - Sair\n"
            );
            

            int opcao;
            try {
                opcao = Integer.parseInt(opcaoString);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opção inválida! Por favor, escolha novamente.");
                continue;
            }

            if (opcao == 1) {
               String celsiusString = JOptionPane.showInputDialog("Digite a temperatura em celsius:");
                double celsius = Double.parseDouble(celsiusString);
                double fahrenheit = celsiusParaFahrenheit(celsius);
                JOptionPane.showMessageDialog(null, "Temperatura em fahrenheit: "+ fahrenheit);
            } else if (opcao == 2) {
                String fahrenheitString = JOptionPane.showInputDialog("Digite a temperatura em fahrenheit:");
                double fahrenheit = Double.parseDouble(fahrenheitString);
                double celsius = fahrenheitParaCelsius(fahrenheit);
                JOptionPane.showMessageDialog(null, "Temperatura em celsius: "+ celsius);
            } else if (opcao == 3){
                JOptionPane.showMessageDialog(null, "Saindo...");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida! Por favor, escolha novamente.");
            }
                
        }
        
    }
    
    

    
}


