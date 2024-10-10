import javax.swing.JOptionPane;
public class UsandoInputDialog {
    public static void main(String[] args) {
      String resposta =
              JOptionPane.showInputDialog(null,
                      "Digite algo:",
                      "Pergunta",
                      JOptionPane.INFORMATION_MESSAGE);
        System.out.println("O que foi digitado:" + resposta
        + "===");
    }
    
}
