import java.util.Random;
import java.util.Scanner;

public class Exercicio04{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        int sorteado = r.nextInt(100) + 1;
        //System.out.println(sorteado);
        int tentativa = 0;
        System.out.println("Digite um valor inteiro: ");
        tentativa = teclado.nextInt();
        int tentativas []= new int[100];
        while (tentativa != sorteado) {
            if (tentativas[tentativa] == 0){
                tentativas[tentativa]++;
            }else System.out.println("Você ja escolheu esse número "+ tentativas[tentativa]+" vezes");
            tentativas[tentativa]++;
            tentativa = teclado.nextInt();

        }
        System.out.println("Parabéns, vc acertou!");
	} 
}
