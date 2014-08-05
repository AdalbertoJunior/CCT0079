package aula1;
import javax.swing.*;

// ao extender do jframe a classe se torna uma janela.
public class Frm01 extends JFrame {
  
  public Frm01 (){
    super("Cadastro"); // primeira linha dentro do construtor
    setSize(290,100); // tamanho da janela
    setLocation(10,10);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // o que faz quando fechar
    setVisible(true); // ultimo atributo
  }
  
}
