package cap03;
import javax.swing.JOptionPane;
public class Questao07 {
    public static void main (String[] args) {
    //Declaração de variáveis
    double peso, engordar, emagrecer, engordarF, emagrecerF;
    //Entrada
    peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso em kg: "));
    //Processamento
    engordar = (peso * 15)/100;
    emagrecer = (peso * 20)/100;
    engordarF = peso + engordar;
    emagrecerF = peso - emagrecer;
    //Saída
    JOptionPane.showMessageDialog(null, "Caso engorde 15% de seu peso atual, terá: "+engordarF+"kg");
    JOptionPane.showMessageDialog(null, "Caso emagreça 20% de seu peso atual, terá: "+emagrecerF+"kg");
    }
}
