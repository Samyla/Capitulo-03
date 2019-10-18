package cap03;
import javax.swing.JOptionPane;
public class Questao24 {
    public static void main (String[] args) {
        //Declaração de variáveis 
        double real, dolar, marcoA, libraE;
        //Entrada
        real = Double.parseDouble(JOptionPane.showInputDialog(
                "Informe o valor em reais que deseja converter: "));
        //Processamento
        dolar = real * 0.25;
        marcoA = real * 0.44;
        libraE = real * 0.20;
        //Saída 
        JOptionPane.showMessageDialog(null, 
                "Convertendo R$"+real+" para Dólar, obtem-se US$"+dolar);
        JOptionPane.showMessageDialog(null, 
                "Convertendo R$"+real+" para Marco Alemão, obtem-se "+marcoA+" DM");
        JOptionPane.showMessageDialog(null, 
                "Convertendo R$"+real+" para Libra Esterlina, obtem-se £"+libraE);
    }
}
