import java.util.Scanner;
        
        /*4. Utilize uma lista para resolver o problema a seguir. Uma empresa paga seus
        vendedores com base em comissões. O vendedor recebe $200 por semana
        mais 9 por cento de suas vendas brutas daquela semana.
        Por exemplo, um vendedor que teve vendas brutas de $3000 em uma semana
        recebe $200 mais 9 por cento de $3000, ou seja, um total de $470.
        Escreva um programa (usando um array de contadores) que determine
        quantos vendedores receberam salários nos seguintes intervalos de valores:
        $200 - $299
        $300 - $399
        $400 - $499
        $500 - $599
        $600 - $699
        $700 - $799
        $800 - $899
        $900 - $999
        $1000 em diante*/
        
public class CalculoComissaoVendedores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] contadores = new int[9];
        
        System.out.println("Digite as vendas brutas de cada vendedor (digite -1 para encerrar):");
        
        double vendas;
        int vendedor = 1;
        
        while (true) {
            System.out.print("Vendas brutas do vendedor " + vendedor + ": $");
            vendas = scanner.nextDouble();
            
            if (vendas == -1) {
                break;
            }
            
            double salario = 200 + (0.09 * vendas);
            
            int faixa;
            if (salario < 300) {
                faixa = 0; // $200-$299
            } else if (salario < 400) {
                faixa = 1; // $300-$399
            } else if (salario < 500) {
                faixa = 2; // $400-$499
            } else if (salario < 600) {
                faixa = 3; // $500-$599
            } else if (salario < 700) {
                faixa = 4; // $600-$699
            } else if (salario < 800) {
                faixa = 5; // $700-$799
            } else if (salario < 900) {
                faixa = 6; // $800-$899
            } else if (salario < 1000) {
                faixa = 7; // $900-$999
            } else {
                faixa = 8; // $1000 em diante
            }
            
            contadores[faixa]++;
            vendedor++;
        }
        
        System.out.println("\nResumo de salários dos vendedores:");
        System.out.println("$200-$299   : " + contadores[0]);
        System.out.println("$300-$399   : " + contadores[1]);
        System.out.println("$400-$499   : " + contadores[2]);
        System.out.println("$500-$599   : " + contadores[3]);
        System.out.println("$600-$699   : " + contadores[4]);
        System.out.println("$700-$799   : " + contadores[5]);
        System.out.println("$800-$899   : " + contadores[6]);
        System.out.println("$900-$999   : " + contadores[7]);
        System.out.println("$1000 em diante: " + contadores[8]);
        
        scanner.close();
    }
}