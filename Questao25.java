package cap03;
import javax.swing.JOptionPane;
public class Questao25 {
    public static void main (String[] args) {
        //Declaração de variáveis
        double horas, minutosH, minutos, minutosT, segundos;
        //Entrada
        horas = Double.parseDouble(JOptionPane.showInputDialog("Informe a hora: "));
        minutos = Double.parseDouble(JOptionPane.showInputDialog("Informe os minutos: "));
        //Processamentro
        minutosH = horas * 60;
        minutosT = minutosH + minutos;
        segundos = minutosT * 60;
        //Saída
        JOptionPane.showMessageDialog(null, 
                "Convertendo as horas informadas para minutos, obtem-se "+minutosH+" minutos");
        JOptionPane.showMessageDialog(null, 
                "Somando os minutos informados aos minutos convertidos, obtem-se o valor total de "+minutosT+" minutos");
        JOptionPane.showMessageDialog(null, 
                "Convertendo o valor total de minutos para segundos, obtem-se "+segundos+" segundos");
    }
}
        