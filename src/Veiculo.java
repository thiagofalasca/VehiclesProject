//Aluno: Thiago Falasca Duarte
//Ra: 2350670
public abstract class Veiculo {

    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int qtdRodas;
    private int velocMax;
    private Motor motor;
    private String dataCadastro;

    // ------------------construtores-----------------

    public Veiculo(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, int qtdPistoes,
            int potencia, String dataCadastro) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.qtdRodas = qtdRodas;
        this.setVelocMax(velocMax);
        this.dataCadastro = dataCadastro;
        motor = new Motor(qtdPistoes, potencia);
    }

    // --------------------funcoes--------------------

    public abstract int calcVel();

    // ---------------getters e setters---------------
    public final String getCor() {
        return cor;
    }

    public final void setCor(String cor) {
        this.cor = cor;
    }

    public final String getDataCadastro() {
        return dataCadastro;
    }

    public final void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public final String getMarca() {
        return marca;
    }

    public final void setMarca(String marca) {
        this.marca = marca;
    }

    public final String getModelo() {
        return modelo;
    }

    public final void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public final Motor getMotor() {
        return motor;
    }

    public final void setMotor(Motor motor) {
        this.motor = motor;
    }

    public final String getPlaca() {
        return placa;
    }

    public final void setPlaca(String placa) {
        this.placa = placa;
    }

    public final int getQtdRodas() {
        return qtdRodas;
    }

    public final void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public final int getVelocMax() {
        return velocMax;
    }

    public final void setVelocMax(int velocMax) {
        if (velocMax < 10 || velocMax > 250) {
            System.out.println("\nA velocidade esta fora dos limites brasileiros!\n");
            velocMax = 100;
        }
        this.velocMax = velocMax;
    }
}
