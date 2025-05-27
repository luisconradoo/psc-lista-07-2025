import java.util.ArrayList;
import java.util.Scanner;

public class AnaliseNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        
        System.out.println("Digite as notas (digite -1 para encerrar):");
        
        
        double valor;
        do {
            System.out.print("Nota " + (notas.size() + 1) + ": ");
            valor = scanner.nextDouble();
            
            if (valor != -1) {
                notas.add(valor);
            }
        } while (valor != -1);
        
        
        if (notas.isEmpty()) {
            System.out.println("\nNenhuma nota foi informada.");
        } else {
            // 1- Mostra a quantidade de valores lidos
            System.out.println("\nQuantidade de valores lidos: " + notas.size());
            
            // 2- Exibe todos os valores na ordem original
            System.out.print("Valores na ordem original: ");
            for (double nota : notas) {
                System.out.print(nota + " ");
            }
            
            // 3- Exibe todos os valores na ordem inversa
            System.out.println("\n\nValores na ordem inversa:");
            for (int i = notas.size() - 1; i >= 0; i--) {
                System.out.println(notas.get(i));
            }
            
            // 4- Calcula e mostra a soma dos valores
            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }
            System.out.printf("\nSoma dos valores: %.2f", soma);
            
            // 5- Calcula e mostra a média dos valores
            double media = soma / notas.size();
            System.out.printf("\nMédia dos valores: %.2f", media);
            
            // 6- Calcula e mostra valores acima da média
            int acimaMedia = 0;
            for (double nota : notas) {
                if (nota > media) {
                    acimaMedia++;
                }
            }
            System.out.println("\nQuantidade de valores acima da média: " + acimaMedia);
            
            // 7- Calcula e mostra valores abaixo de sete
            int abaixoSete = 0;
            for (double nota : notas) {
                if (nota < 7) {
                    abaixoSete++;
                }
            }
            System.out.println("Quantidade de valores abaixo de sete: " + abaixoSete);
        }
        
            System.out.println("\nPrograma encerrado. Obrigado por utilizar nosso sistema!");
            scanner.close();
    }
}