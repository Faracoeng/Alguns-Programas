public class Principal{

    public static void main(String[] args) {
        System.out.println("Ola Mundo");

        Carro fusca = new Carro();
        Carro  ferrari = new Carro();
        fusca.setVelocidade(80);
        fusca.setVelocidade(100);

        System.out.println("Velocidade fusca : "+ fusca.getVelocidade());
        System.out.println("Velocidade ferrari : "+ ferrari.getVelocidade());
    }
}
