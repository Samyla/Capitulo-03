package cap03;
import javax.swing.JOptionPane;
public class Questao03 {
    public static void main(String[] args) {
        //Declaração de variáveis
        double num1, num2, res;
        //Entrada
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1º número: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2º número: "));
        //Processamento
        res = num1/num2;
        //Saída
        if (num2==0)
            {JOptionPane.showMessageDialog(null, "Comando inválido, atribua outro valor ao 2º número");}
        else
            {JOptionPane.showMessageDialog(null, "O resultado da divisão é: "+res);}
    }
}
