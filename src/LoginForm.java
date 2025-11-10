import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JButton sprawdzButton;
    private JButton wyjdzButton;
    private JPasswordField passwordField1;
    private JTextField txtLogin;
    private JPanel Panel2;
    private JLabel LblOutput;
    String user="admin";
    String password="admin";

    public LoginForm(){
        super("Lab2");
        this.setContentPane(this.Panel2);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        int width = 600, height = 500;
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


        wyjdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        sprawdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = txtLogin.getText();
                String userPassword = new String(passwordField1.getPassword());

                if(userInput.equals(user) && userPassword.equals(password)){
                    LblOutput.setText("Zalogowano..");
                    dispose();
                }else {
                    LblOutput.setText("Podano złe dane");
                    txtLogin.setText("");
                    passwordField1.setText("");
                }
            }
        });
    }
    RadioTask radio = new RadioTask();
}
