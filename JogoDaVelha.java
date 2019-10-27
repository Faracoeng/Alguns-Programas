public class JogoDaVelha {

    private int[][] tabuleiro;
    private int placarJogador1;
    private int placarJogador2;
    /**
     * Quando true, representa jogador 1, que possui o marcador X
     */
    private boolean jogadorDaVez;

    public JogoDaVelha() {
        this.tabuleiro = new int[3][3];
        this.iniciarTabuleiro();
        this.placarJogador1 = 0;
        this.placarJogador2 = 0;
        this.jogadorDaVez = true;
    }

    public JogoDaVelha(int[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    /**
     *
     * @return 0 quando ninguém ganha, 3 quando jogador 1 ganha, -3 quando jogador 2
     */
    public int ganhou(){
        if(ganhouHorizontal()==3 || ganhouVertical()==3 || ganhouDiagonal()==3){
            return 3;
        }
        else if(ganhouHorizontal()==-3 || ganhouVertical()==-3 || ganhouDiagonal()==-3){
            return -3;
        }
        else return 0;
    }

    public int ganhouHorizontal() {
        for (int i = 0; i < 3; i++) {
            int soma = 0;
            for (int j = 0; j < 3; j++) {
                soma = (this.tabuleiro[i][j]) + soma;
            }
            if (soma == 3){
                return soma;
            }
            else if(soma == -3){
                return soma;
            }
        }
        return 0;
    }

    public int ganhouVertical(){
        return 0;
    }

    public int ganhouDiagonal(){
        return 0;
    }

    public boolean jogar(int linha, int coluna){
        if(linha > 2 || linha < 0){
            return false;
        }
        if(coluna > 2 || coluna < 0){
            return false;
        }
        if(this.tabuleiro[linha][coluna] != 0){
            return false;
        }

        if(jogadorDaVez){
            this.tabuleiro[linha][coluna] = 1;
        } else{
            this.tabuleiro[linha][coluna] = -1;
        }
        this.jogadorDaVez = !this.jogadorDaVez;
        return true;
    }

    public boolean tabuleiroCheio(){
        return false;
    }

    public void iniciarTabuleiro(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.tabuleiro[i][j] = 0;
            }
        }
    }

    public int[][] getTabuleiro() {
        return tabuleiro;
    }

    public int getPlacarJogador1() {
        return placarJogador1;
    }

    public int getPlacarJogador2() {
        return placarJogador2;
    }

    public void setTabuleiro(int[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
}
