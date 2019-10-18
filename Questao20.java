package cap03;
import javax.swing.JOptionPane;
public class Questao20 {
    public static void main (String[] args) {
        //Declaração de variáveis
        double co, ca, h, ang, x;
        //Entrada
         ang = Double.parseDouble(JOptionPane.showInputDialog("Informe o angulo: "));
         ca = Double.parseDouble(JOptionPane.showInputDialog("Informe a distancia entre escada e predio: "));
        //Processamento
         co = ca * Math.toRadians(Math.tan(ang));
         //Saída
        JOptionPane.showMessageDialog(null, "O tamanho da escada é: "+Math.hypot(co, ca));
      }    
}
