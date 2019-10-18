package cap03;
import javax.swing.JOptionPane;
public class Questao14 {
    public static void main (String[] args) {
    //Declaração de variaveis
    int anoN, anoA, idade, meses, semanas, dias;
    //Entrada
    anoN = Integer.parseInt(JOptionPane.showInputDialog("Informe seu ano de nascimento: "));
    anoA = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "));
    //Processamento
    idade = anoA - anoN;
    meses = idade * 12;
    semanas = meses * 4;
    dias = idade * 365;
    //Saída
    JOptionPane.showMessageDialog(null, "Sua idade é: "+idade+" anos");
    JOptionPane.showMessageDialog(null, "Sua idade em meses é em cerca de: "+meses+" meses");
    JOptionPane.showMessageDialog(null, "Sua idade em semanas é em cerca de: "+semanas+" semanas");
    JOptionPane.showMessageDialog(null, "Sua idade em dias é em cerca de: "+dias+" dias");
    }
}
