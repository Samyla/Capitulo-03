package cap03;
import javax.swing.JOptionPane;
public class Questao11 {
    public static void main (String[] args) {
        //Declaração de variáveis
        double dMenor, dMaior, area;
        //Entrada
        dMenor = Double.parseDouble(JOptionPane.showInputDialog("Indique a medida da diagonal menor: "));
        dMaior = Double.parseDouble(JOptionPane.showInputDialog("Indique a medida da diagonal maior: "));
        //Processamento
        area = (dMenor * dMaior)/2;
        //Saída
        JOptionPane.showMessageDialog(null, 
                    "De acordo com os dados informados, a área do losango é de "+area);
    }   
}
