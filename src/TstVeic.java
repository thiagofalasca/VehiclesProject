//Aluno: Thiago Falasca Duarte
//Ra: 2350670
public class TstVeic {
    public static void main(String[] args) {
        Leitura ent = new Leitura();

        System.out.println("\nDigite os dados do veiculo de passeio\n");

        Passeio veiculo1 = new Passeio(
                ent.entDados("Digite a placa do veiculo"),
                ent.entDados("Digite a marca do veiculo"),
                ent.entDados("Digite o modelo do veiculo"),
                ent.entDados("Digite a cor do veiculo"),
                Integer.parseInt(ent.entDados("Digite a quantidade de rodas do veiculo")),
                Integer.parseInt(ent.entDados("Digite a velocidade maxima do veiculo")),
                Integer.parseInt(ent.entDados("Digite a quantidade de pistoes")),
                Integer.parseInt(ent.entDados("Digite a potencia do veiculo")),
                ent.entDados("Digite a data de cadastro do veiculo"),
                Integer.parseInt(ent.entDados("Digite a quantidade de passageiros")));

        System.out.println("\nDigite os dados do veiculo de carga\n");

        Carga veiculo2 = new Carga(
                ent.entDados("Digite a placa do veiculo"),
                ent.entDados("Digite a marca do veiculo"),
                ent.entDados("Digite o modelo do veiculo"),
                ent.entDados("Digite a cor do veiculo"),
                Integer.parseInt(ent.entDados("Digite a quantidade de rodas do veiculo")),
                Integer.parseInt(ent.entDados("Digite a velocidade maxima do veiculo")),
                Integer.parseInt(ent.entDados("Digite a quantidade de pistoes")),
                Integer.parseInt(ent.entDados("Digite a potencia do veiculo")),
                ent.entDados("Digite a data de cadastro do veiculo"),
                Integer.parseInt(ent.entDados("Digite a carga maxima")),
                Integer.parseInt(ent.entDados("Digite tara")));

        System.out.println("\nDados do veiculo de passeio\n");
        System.out.println(veiculo1.getPlaca());
        System.out.println(veiculo1.getMarca());
        System.out.println(veiculo1.getModelo());
        System.out.println(veiculo1.getCor());
        System.out.println(veiculo1.getQtdRodas());
        System.out.println("A velocidade em m/h e: " + veiculo1.calcVel());
        System.out.println(veiculo1.getMotor().getQtdPistoes());
        System.out.println(veiculo1.getMotor().getPotencia());
        System.out.println(veiculo1.getDataCadastro());
        System.out.println(veiculo1.getQtdePassageiros());
        System.out.println("O metodo calcular() da interface Calc vale: " + veiculo1.calcular());

        System.out.println("\nDados do veiculo de carga\n");
        System.out.println(veiculo2.getPlaca());
        System.out.println(veiculo2.getMarca());
        System.out.println(veiculo2.getModelo());
        System.out.println(veiculo2.getCor());
        System.out.println(veiculo2.getQtdRodas());
        System.out.println("A velocidade em cm/h e: " + veiculo2.calcVel());
        System.out.println(veiculo2.getMotor().getQtdPistoes());
        System.out.println(veiculo2.getMotor().getPotencia());
        System.out.println(veiculo2.getDataCadastro());
        System.out.println(veiculo2.getCargaMax());
        System.out.println(veiculo2.getTara());
        System.out.println("O metodo calcular() da interface Calc vale: " + veiculo2.calcular());
    }
}
