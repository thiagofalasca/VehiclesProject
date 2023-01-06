//Aluno: Thiago Falasca Duarte
//Ra: 2350670
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura {
    public String entDados(String str) {
        System.out.println(str);
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String s = "";
        try {
            s = cd.readLine();
        } catch (IOException ioe) {
            System.out.println("\n Erro de sistema");
        }
        return s;
    }
}