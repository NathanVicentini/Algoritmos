import java.awt.Color;
//import javax.swing.JFrame;
import javax.swing.*;
import java.awt.BorderLayout;
public class UsandoJFrame {
    public static void main(String[] args) {
        
        JFrame minhaJanela = new JFrame("Nova Janela");
        minhaJanela.setSize(300, 300);
        minhaJanela.setVisible(true);
        minhaJanela.getContentPane().setBackground(Color.blue);
        minhaJanela.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        minhaJanela.setLayout(null);
        JPanel janela = new JPanel();
        janela.setSize(150, 150);
        Color cor = new Color(220, 42, 42);
        janela.setBackground(cor);
        minhaJanela.add(janela);
        
        
        
      
    }
    
}
