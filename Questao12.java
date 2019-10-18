package cap03;
import javax.swing.JOptionPane;
public class Questao12 {
    public static void main (String[] args) {
        //Declaração de variáveis
        double sm, s, d;
        //Entrada
        sm = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salário mínimo: "));
        s = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do seu salário: "));
        //Processamento
        d = s/sm;
        //Saída
        if (d<=1)
        {JOptionPane.showMessageDialog(null, "Você recebe cerca de "+d+" salário mínimo");}
        else
        {JOptionPane.showMessageDialog(null, "Você recebe cerca de "+d+" salários mínimos");}
    }
}
