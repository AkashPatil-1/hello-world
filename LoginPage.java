import javax.swing.*;
import java.awt.*;
public class LoginPage extends JFrame{
    private JTextField userText;
    private JPanel panel1;
    private JPasswordField password;
    private JButton loginButton;
    private JLabel UserName;
    private JLabel Password;
    private JFrame frame;
    public LoginPage(){
        frame=new JFrame("Login Frame");
        frame.setPreferredSize(new Dimension(300,250));
        frame.setVisible(true);
        frame.add(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


}
