//Aluno: Thiago Falasca Duarte
//Ra: 2350670
public class Motor {

    private int qtdPistoes;
    private int potencia;

    // ------------------construtores-----------------

    public Motor(int qtdPistoes, int potencia) {
        this.potencia = potencia;
        this.qtdPistoes = qtdPistoes;
    }

    // ---------------getters e setters---------------

    public final int getPotencia() {
        return potencia;
    }

    public final void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public final int getQtdPistoes() {
        return qtdPistoes;
    }

    public final void setQtdPistoes(int qtdPistoes) {
        this.qtdPistoes = qtdPistoes;
    }
}
