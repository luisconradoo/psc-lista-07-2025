import java.util.Scanner;
          
        /*Utilizando listas faça um programa que faça 5 perguntas para uma pessoa
        sobre um crime. As perguntas são:
        "Telefonou para a vítima?"
        "Esteve no local do crime?"
        "Mora perto da vítima?"
        "Devia para a vítima?"
        "Já trabalhou com a vítima?"
        O programa deve no final emitir uma classificação sobre a participação da
        pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve
        ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
        "Assassino". Caso contrário, ele será classificado como "Inocente".*/
        
public class InvestigacaoCriminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] perguntas = {
            "Telefonou para a vítima? (S/N)",
            "Esteve no local do crime? (S/N)",
            "Mora perto da vítima? (S/N)",
            "Devia para a vítima? (S/N)",
            "Já trabalhou com a vítima? (S/N)"
        };
        
        int respostasPositivas = 0;
        
        System.out.println("Responda as seguintes perguntas com S (Sim) ou N (Não):\n");
        
        for (String pergunta : perguntas) {
            System.out.print(pergunta + " ");
            String resposta = scanner.next().toUpperCase();
            
            while (!resposta.equals("S") && !resposta.equals("N")) {
                System.out.print("Resposta inválida. Digite S ou N: ");
                resposta = scanner.next().toUpperCase();
            }
            
            if (resposta.equals("S")) {
                respostasPositivas++;
            }
        }
        
        String classificacao;
        if (respostasPositivas == 5) {
            classificacao = "Assassino";
        } else if (respostasPositivas >= 3) {
            classificacao = "Cúmplice";
        } else if (respostasPositivas == 2) {
            classificacao = "Suspeita";
        } else {
            classificacao = "Inocente";
        }
        
        System.out.println("\nClassificação: " + classificacao);
        
        scanner.close();
    }
}