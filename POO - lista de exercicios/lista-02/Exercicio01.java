public class Exercicio01 {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Entrada incorreta");
        } else {

            switch (args[1].hashCode()) {
                case '+':
                    System.out.println(Double.parseDouble(args[0]) + Double.parseDouble(args[2]));
                    break;
                case '-':
                    System.out.println(Double.parseDouble(args[0]) - Double.parseDouble(args[2]));
                    break;
                case '/':
                    System.out.println(Double.parseDouble(args[0]) / Double.parseDouble(args[2]));
                    break;
                case 'x':
                    System.out.println(Double.parseDouble(args[0]) * Double.parseDouble(args[2]));
                    break;
            }
        }
   }
}
