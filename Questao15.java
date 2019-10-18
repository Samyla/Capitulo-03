package cap03;
import javax.swing.JOptionPane;
public class Questao15 {
    public static void main (String[] args) {
        //Declaração de variáveis
        double s, r, c1, cF1, c2, cF2;
        //Entrada
        s = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário: "));
        c1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da 1º conta: "));
        c2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da 2º conta: "));
        //Processamento
        cF1 = c1 + (c1 * 2)/100;
        cF2 = c2 + (c2 * 2)/100;
        r = s - cF1 - cF2;
        //Saída
        JOptionPane.showMessageDialog(null, 
                "Descontando o valor das duas contas pendentes e 2% de multa por atraso das mesmas,"
                        + " restará do seu salário R$"+r);
    }
}
