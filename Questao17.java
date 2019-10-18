package cap03;
import javax.swing.JOptionPane;
public class Questao17 {
    public static void main (String[] args) {
        //Declaração de  variáveis
        double raio, comp, area, vol, pi = 3.14159265359;
        //Entrada
        raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do raio: "));
        //Processamento
        comp = 2 * pi * raio;
        area = 4 * pi * (raio * raio);
        vol = (4 * pi * (raio*raio*raio))/3;
        //Saída
        JOptionPane.showMessageDialog(null, "O comprimento da esfera vale: "+comp);
        JOptionPane.showMessageDialog(null, "A área da esfera vale: "+area);
        JOptionPane.showMessageDialog(null, "O volume da esfera vale: "+vol);
     }
}