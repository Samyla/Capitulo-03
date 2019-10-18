package cap03;
import javax.swing.JOptionPane;
public class Questao19 {
    public static void main (String[] args) {
        //Declaração de variáveis
         double ladoA, ladoB, area, w, potencia = 18;
         //Entrada
         ladoA = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do 1º lado: "));
         ladoB = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do 2º lado: "));
         //Processamento
         area = ladoA * ladoB;
         w = area * potencia;
         //Saída
         JOptionPane.showMessageDialog(null, "A área do local é de "+area+" metros");
         JOptionPane.showMessageDialog(null, "A voltagem necessaria para ilumina-lo é de "+w+" W");
    }
}
