package cap03;
import javax.swing.JOptionPane;
public class Questao04 {
    public static void main(String[] args) {
        //Declaração de variáveis
        double nota1, nota2, mediaP;
        //Entrada
        nota1 = Double.parseDouble (JOptionPane.showInputDialog("Informe a 1º nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2º nota: "));
        //Processamento
        mediaP = (nota1 * 2 + nota2 * 3)/5;
        //Saída
        JOptionPane.showMessageDialog(null, "A média ponderada entre "+nota1+" e "+nota2+" é "+mediaP);
    }
}
