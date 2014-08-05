package aula1;
import javax.swing.*;

// ao extender do jframe a classe se torna uma janela.
public class Frm01 extends JFrame {
  
  public Frm01 (){
    JFrame f= new JFrame();
    f.setSize(290,100); // tamanho da janela
    f.setTitle("Cadastro");
    f.setLocation(10,10);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // o que faz quando fechar
    f.setVisible(true); // ultimo atributo
  }
  
}
