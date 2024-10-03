package arquivos;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try (FileWriter arqLeitura = new FileWriter("produtos.txt");
             PrintWriter arqPrint = new PrintWriter(arqLeitura)) {

            int Unidades = 0;
            double valorTotal = 0.0;

            while (true) {
                System.out.println("Digite o nome do produto e quando terminar digite 'fim':");
                String Nome = leitor.nextLine();
               
                if (Nome.equalsIgnoreCase("fim")) {
                    break;
                }

                System.out.println("Digite a quantidade do produto:");
                int quantidade = Integer.parseInt(leitor.nextLine());

                System.out.println("Digite o valor unitário do produto:");
                double Valor = Double.parseDouble(leitor.nextLine());

                double valorTotalProduto = quantidade * Valor;

                
                arqPrint.printf("%s, %d, %.2f%n", 
                        Nome, 
                        quantidade, 
                        Valor);
               
                
                Unidades += quantidade;
                valorTotal += valorTotalProduto;
            }

            
            arqPrint.printf("Total de produtos: %d%n", Unidades);
            arqPrint.printf("Valor total: %.2f%n", valorTotal);

            
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao gravar o arquivo: " + e.getMessage());
        }

        leitor.close();
    }
}
/*"Nicolas, olha para trás que eu vou pesquisar no chatgpt"*/