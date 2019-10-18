package cap03;
import javax.swing.JOptionPane;
public class Questao22 {
    public static void main (String[] args) {
        //Declaração de variáveis 
        double nL, nD;
        //Entrada
        nL = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de lados do polígono: "));
        //Processamento
        nD = nL * (nL - 3)/2;
        JOptionPane.showMessageDialog(null, 
                "De acordo com o número de lados informados, o polígono convexo tem "+nD+" diagonais");
    }
}