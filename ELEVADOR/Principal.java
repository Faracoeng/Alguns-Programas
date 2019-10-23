import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
    Gerenciador comando = new Gerenciador();
    int opcao = 0;
    Scanner teclado = new Scanner(System.in);

    while(opcao != 6){
    System.out.println("1- Configurar o edifício\n" +
                "2- Solicitar elevador\n" +
                "3- Indicar um andar onde se deseja ir\n" +
                "4- Imprimir estatísticas dos elevadores\n" +
                "5- Listar elevadores revisão\n" +
                "6- Sair do programa\n");
   opcao = teclado.nextInt();
     switch (opcao){
         case 1:
             System.out.println("Digite o número de andares(no máximo 70 e mínimo 4)");
             int qtdAndares = teclado.nextInt();
             comando.andares(qtdAndares);
             System.out.println("Digite o número de elevadores(no máximo 6)");
             int qtdElevadores = teclado.nextInt();
             comando.elevadores(qtdElevadores);

             break;

         case 2:
             System.out.println("Em qual andar você está?");
             int andarAtual = teclado.nextInt();
             comando.solicitar(andarAtual);
             break;
         case 3:
             System.out.println("Para qual andar deseja ir,e em qual elevador você está?");
             int destino = teclado.nextInt();
             int nElev = teclado.nextInt();
             comando.indicar(destino,nElev);
             break;
         case 4:
             comando.estatistica();

             break;

         case 5:comando.revisao();

             break;

             case 6:opcao = 6;
     }
	}
}
}
