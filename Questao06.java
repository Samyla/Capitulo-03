package cap03;
import javax.swing.JOptionPane;
public class Questao06 {
    public static void main (String[] args) {
        //Declaração de variáveis
        double vendas, comissao, salario, salarioF;
        //Entrada
        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário: "));
        vendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de suas vendas: "));
        //Processamento
        comissao = (vendas * 4)/100;
        salarioF = comissao + salario;
        //Saída
        JOptionPane.showMessageDialog(null, 
                        "Você obteve R$"+comissao+" de comissão, seu salário final é de R$"+salarioF);
    }
}
