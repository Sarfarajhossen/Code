
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
//import java.awt.EventQueue
        
public class Mainframe extends JFrame {
    public void initialize (){
        setTitle("Welcome");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color. pink);
        setVisible(true);
    }
    public static void main(String args[]){
        System.out.println("First frame app");
        Mainframe Myframe = new Mainframe();
        Myframe . initialize();
    }
}
