import java.util.Scanner;  
public class Exercicio02{ 
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a = 1, b = 0, c, i = 1, n;
        System.out.println("insira um valor:");
        n = teclado.nextInt();
        System.out.println("0");
        while (i <= n) {
            i = i + 1;
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
