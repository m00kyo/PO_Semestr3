import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApp extends JFrame{
    private JPanel App;
    private JTextField textField1;
    private JTextField textField2;
    private JButton przeliczButton;

    public SwingApp() {
        super("xxx");
        this.setContentPane(this.App);
        this.pack();
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        przeliczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double stopnieC = Double.parseDouble(textField2.getText());

                double Farenheit = stopnieC * 1.8 + 32;

                textField1.setText(String.valueOf(Farenheit));
            }
        });
    }


}
