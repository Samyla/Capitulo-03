package cap03;
import javax.swing.JOptionPane;
public class Questao02 {
    public static void main(String[] args) {
        //Declaração de variáveis
        double num1, num2, num3, res;
        //Entrada
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1º número: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2º número: "));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 3º número: "));
        //Processamento
        res = num1 * num2 * num3;
        //Saída
        JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: "+res);
    }
}

