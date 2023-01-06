//Aluno: Thiago Falasca Duarte
//Ra: 2350670
public final class Passeio extends Veiculo implements Calc {

    private int qtdePassageiros;

    // ------------------construtores-----------------

    public Passeio(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, int qtdPistoes,
            int potencia, String dataCadastro, int qtdePassageiros) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, qtdPistoes, potencia, dataCadastro);
        this.qtdePassageiros = qtdePassageiros;
    }

    // --------------------funcoes--------------------

    @Override
    public final int calcVel() {
        return getVelocMax() * 1000;
    }

    @Override
    public final int calcular() {
        return this.getPlaca().length() + this.getMarca().length() + this.getModelo().length() + this.getCor().length()
                + this.getDataCadastro().length();
    }

    // ---------------getters e setters---------------

    public final int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public final void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

}
