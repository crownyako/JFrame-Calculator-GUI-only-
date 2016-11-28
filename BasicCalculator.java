package basiccalculator;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author EMPHRAIM
 */
public class BasicCalculator extends JFrame {
 
   
     
    public static void main(String[] args) {//The Main Method
        //calling Constructor in the Main Method through instantiated object
    SubCalculator SubCalcObject =new SubCalculator();
    SubCalcObject.setSize(250, 350);
    SubCalcObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    SubCalcObject.setVisible(true);
    SubCalcObject.setResizable(false);
    }
   
}
