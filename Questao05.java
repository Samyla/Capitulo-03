package cap03;
import javax.swing.JOptionPane;
public class Questao05 {
    public static void main(String[] args) {
        //Declaração de variáveis
        double preço, res;
        //Entrada
        preço = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto: "));
        //Processamento
        res = (preço * 90)/100;
        //Saída
        JOptionPane.showMessageDialog(null, "Descontando 10% de R$"+preço+", obtem-se o valor de R$"+res);
    }
}
