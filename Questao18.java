package cap03;
import javax.swing.JOptionPane;
public class Questao18 {
    public static void main (String[] args) {
        //declaração de variáveis
        double celsius, fahrenheit;
        //Entrada
        celsius = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em Celsius: "));
        //Processamento
        fahrenheit = celsius * (9/5) + 32;
        //Saída
        JOptionPane.showMessageDialog(null, 
                "Convertendo a temperatura de Celsius para Fahrenheit, obtem-se "+fahrenheit+"F");
    }    
}
