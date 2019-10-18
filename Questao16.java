package cap03;
import javax.swing.JOptionPane;
public class Questao16 {
    public static void main (String[] args) {
        //Declaração de  variáveis
        double c1, c2, h;
        //Entrada
        c1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1º cateto: "));
        c2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2º cateto: "));
        //Processamento
        h = (c1 * c1) + (c2 * c2);
        //Saída
        JOptionPane.showMessageDialog(null, 
                "De acordo com os catetos informados, a hipotenusa do triângulo é: "+h);        
    }
}
