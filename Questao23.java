package cap03;
import javax.swing.JOptionPane;
public class Questao23 {
    public static void main (String[] args) {
        //Declaração de variáveis 
        double ang1, ang2, ang3;
        //Entrada
        ang1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1º ângulo: "));
        ang2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2º ângulo: "));
        //Processamento
        ang3 = 180 - ang1 - ang2;
        //Saída
        JOptionPane.showMessageDialog(null, "O 3º ângulo desse triângulo tem valor de "+ang3+" graus");
    }
}
