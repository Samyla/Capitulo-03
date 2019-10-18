package cap03;
import javax.swing.JOptionPane;
public class Questao10 {
     public static void main (String[] args) {
        //Declaração de variáveis
        double lado, area;
        //Entrada
        lado = Double.parseDouble(JOptionPane.showInputDialog("Indique a medida do lado de um quadrado: "));
        //Processamento
        area = lado * lado;
        //Saída
        JOptionPane.showMessageDialog(null, "A área do quadrado é de "+area);
    }
}