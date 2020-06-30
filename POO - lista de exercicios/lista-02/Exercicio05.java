public class Exercicio05{   
	 public static void main(String[] args) {
        int[][] Matriz = new int[10][10];
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    Matriz[i][j] = 1;
                } else Matriz[i][j] = 0;
            }
        }
        for (int l = 0; l < Matriz.length; l++) {
            for (int c = 0; c < Matriz[0].length; c++) {
                System.out.print(Matriz[l][c] + " ");
            }
            System.out.println(" ");
        }
    }
}
