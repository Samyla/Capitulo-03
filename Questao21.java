package cap03;
import javax.swing.JOptionPane;
public class Questao21 {
    public static void main (String[] args) {
        //Declaração de variáveis
        double horasT, salarioM, horasE, salarioB, salarioE, salarioF;
        //Entrada
        salarioM = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário mínimo atual: "));
        horasT = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de horas trabalhadas: "));
        horasE = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de horas extras trabalhadas: "));
        //Processamento
        salarioB = horasT * (salarioM * 1/8);
        salarioE = horasE * (salarioM * 1/4);
        salarioF = salarioB + salarioE;
        //Saída
        JOptionPane.showMessageDialog(null, "O salário que deverá ser recebido é de R$"+salarioF);
    }
}
