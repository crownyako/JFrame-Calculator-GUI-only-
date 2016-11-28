
package basiccalculator;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author EMPHRAIM
 */

public class SubCalculator extends JFrame {//subClass
    //Now creating the variable
    private JTextField JTF;
    private JButton one, two, three, four, five, six, seven, eight, nine, zero, add, sub, div, mult, equals, btnColor;
    private String varInput1, varInput2, varAns;//temporal string variable 
    private double answer=0.0;
    private JPanel contentPanel;    
    private JLabel Jlab;
   public SubCalculator(){//Constructor!
   super("Nyako Calculator");
   //JTextField
   JTF=new JTextField(null, 20);
   JTF.setEditable(false);
   //JLabel
   Jlab=new JLabel("CrownsTech v 0.0.1");
   //JButtons
   one=new JButton("1");
   two=new JButton("2");
   three=new JButton("3");
   four=new JButton("4");
   five=new JButton("5");
   six=new JButton("6");
   seven=new JButton("7");
   eight=new JButton("8");
   nine=new JButton("9");
   zero=new JButton("0");
   add=new JButton("+");
   sub=new JButton("-");
   mult=new JButton("*");
   div=new JButton("÷");//alt+0247
   equals=new JButton("=");
  
   
   
   //JPanel
    contentPanel = new JPanel();//the panel holding all contnts
    contentPanel.setBackground(Color.white);
    contentPanel.setLayout(new FlowLayout());
   equals.setBackground(Color.yellow);//coloring btn
   div.setBackground(Color.gray);//coloring btn
   mult.setBackground(Color.gray);//coloring btn
   add.setBackground(Color.gray);//coloring btn
   sub.setBackground(Color.gray);//coloring btn
    //adding JButtons to JPanel
    contentPanel.add(JTF, BorderLayout.NORTH);
    contentPanel.add(one);
    contentPanel.add(two);
    contentPanel.add(three);
    contentPanel.add(four);
    contentPanel.add(five);
    contentPanel.add(six);
    contentPanel.add(seven);
    contentPanel.add(eight);
    contentPanel.add(nine);
    contentPanel.add(zero);
    contentPanel.add(add);
    contentPanel.add(sub);
    contentPanel.add(mult);
    contentPanel.add(div);
    contentPanel.add(equals);
    contentPanel.add(Jlab);
    //resizing the buttons 
    Dimension dim=new Dimension(75,30);
    Dimension dim2=new Dimension(225,45);//for the textfield
     JTF.setPreferredSize(new Dimension(dim2));
    one.setPreferredSize(dim);
    two.setPreferredSize(dim);
    three.setPreferredSize(dim);
    four.setPreferredSize(dim);
    five.setPreferredSize(dim);
    six.setPreferredSize(dim);
    seven.setPreferredSize(dim);
    eight.setPreferredSize(dim);
    nine.setPreferredSize(dim);
    zero.setPreferredSize(new Dimension(225,30) );
    add.setPreferredSize(new Dimension(113,30));
    sub.setPreferredSize(new Dimension(113,30));
    mult.setPreferredSize(new Dimension(113,30));
    div.setPreferredSize(new Dimension(113,30));
    equals.setPreferredSize(new Dimension(225,30));//time 21:00 setting action listeners     
  
       this.setContentPane (contentPanel);//pionts to the object nd is positioned last
       
   }
}
