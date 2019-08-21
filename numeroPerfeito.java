import java.util.Scanner;   

public class numeroPerfeito{
 public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int num = teclado.nextInt();
        int metade = num/2, aux = 1, soma = 0;
        while (aux <= metade){
            if(num % aux == 0){
                soma += aux;
            }
            aux++;
        }
        if (soma == num){
            System.out.println("é um número perfeito");
        }else System.out.println("Não é um número perfeito");

    }
}
