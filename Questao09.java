package cap03;
import javax.swing.JOptionPane;
public class Questao09 {
    public static void main (String[] args) {
        //Declaração de variáveis
        double bMaior, bMenor, altura, area;
        //Entrada
        bMenor = Double.parseDouble(JOptionPane.showInputDialog("Indique a medida da base menor: "));
        bMaior = Double.parseDouble(JOptionPane.showInputDialog("Indique a medida da base maior: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Indique a medida da altura: "));
        //Processamento
        area = ((bMenor + bMaior) * altura)/2;
        //Saída
        JOptionPane.showMessageDialog(null, 
                    "De acordo com os dados informados, a área do trapézio é de "+area);
    }  
}
