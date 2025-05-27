import java.util.Scanner;

    /* Faça um programa que receba a temperatura média de cada mês do ano e
    armazene-as em uma lista. Após isto, calcule a média anual das temperaturas e
    mostre todas as temperaturas acima da média anual, e em que mês elas
    ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ). */

public class TemperaturasMensais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        
        double[] temperaturas = new double[12];
        double soma = 0;
        
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }
        
        double mediaAnual = soma / 12;
        System.out.printf("\nMédia anual de temperatura: %.2f°C\n", mediaAnual);
        
        System.out.println("\nMeses com temperatura acima da média anual:");
        for (int i = 0; i < 12; i++) {
            if (temperaturas[i] > mediaAnual) {
                System.out.printf("%d - %s: %.2f°C\n", (i+1), meses[i], temperaturas[i]);
            }
        }
        
        scanner.close();
    }
}