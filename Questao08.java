package cap03;
import javax.swing.JOptionPane;
public class Questao08 {  
    public static void main (String[] args) {
    //Declaração de variáveis
    double quilos, gramas;
    //Entrada
    quilos = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso em kg: "));
    //Processamento
    gramas = quilos * 1000;
    //Saída
    JOptionPane.showMessageDialog(null, 
            "Seu peso é de "+quilos+"kg, fazendo a conversão para gramas, obtem-se "+gramas+"g");
        }
}
