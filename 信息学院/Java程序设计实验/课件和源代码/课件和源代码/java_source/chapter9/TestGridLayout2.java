import java.awt.*;
import javax.swing.*;
public class TestGridLayout2 extends JFrame{
  JButton[] button;
  String[] str={"0","1","2","3","4","5","6","7","8","9","+","-","*","/","="};
  JPanel panel1,panel2;
  public TestGridLayout2(String title){
    super(title);
    setBounds(100,100,250,250);
    button=new JButton[15];
    setLayout(new BorderLayout());
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    add(panel1,"North");
    add(panel2,"Center");
    
    JTextField tf=new JTextField(20);
    panel1.add(tf);
    panel2.setLayout(new GridLayout(5,3));
    for(int i=0;i<15;i++){
      button[i]=new JButton(str[i]);
      panel2.add(button[i]);
      }
    setVisible(true);
   }
   public static void main(String[] args){
      String title=new String("GridLayout ���Գ���");
      new TestGridLayout2(title);
      }
 }
    
    