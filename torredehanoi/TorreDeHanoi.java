package torredehanoi;
/**
 *
 * @author 03779206064
 */
/*Deve ser programado um algoritmo em Java da Torre de Hanói, com um número de 
discos informado pelo usuário. O programa deve informar qual o número mínimo de 
movimentos necessários e listar os movimentos necessários para resolver a Torre
com o número informado.
*/
import java.util.Scanner;
public class TorreDeHanoi {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos discos possui a torre: ");
        int discos = leitor.nextInt();
        
        int MinMove = (int) Math.pow(2, discos) - 1;
        
        System.out.println("O minimo de movimentos para resolver a torre e: " + MinMove);
        String Origem = "A";
        String Auxilio = "B";
        String Destino = "C";
        
        System.out.println("Os movimentos para resolver a torre devem ser: ");
        Torre(discos,Origem,Auxilio,Destino);     
    }
    
    public static void Torre(int discos, String Origem, String Auxilio , String Destino){
         if(discos == 1){
            System.out.println("Mova o disco do pino "+ Origem + " para o pino " + Destino);   
            return;
        }
        Torre(discos-1, Origem, Destino, Auxilio);
        System.out.println("Mova o disco do pino " + Origem + " para o pino " + Destino);
        Torre(discos-1, Auxilio, Destino, Origem);
    }    
}