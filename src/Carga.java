//Aluno: Thiago Falasca Duarte
//Ra: 2350670
public final class Carga extends Veiculo implements Calc {

    private int tara;
    private int cargaMax;

    // ------------------construtores-----------------

    public Carga(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, int qtdPistoes,
            int potencia, String dataCadastro, int tara, int cargaMax) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, qtdPistoes, potencia, dataCadastro);
        this.tara = tara;
        this.cargaMax = cargaMax;
    }

    // --------------------funcoes--------------------

    @Override
    public final int calcVel() {
        return getVelocMax() * 100000;
    }

    @Override
    public final int calcular() {
        return this.tara + this.cargaMax + this.getQtdRodas() + this.getVelocMax() + this.getMotor().getQtdPistoes()
                + this.getMotor().getPotencia();
    }

    // ---------------getters e setters---------------

    public final int getCargaMax() {
        return cargaMax;
    }

    public final void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public final int getTara() {
        return tara;
    }

    public final void setTara(int tara) {
        this.tara = tara;
    }
}
