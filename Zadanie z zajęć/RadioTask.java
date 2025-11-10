import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioTask extends JFrame {
    private JRadioButton kotRadioButton;
    private JRadioButton chomikRadioButton;
    private JRadioButton piesRadioButton;
    private JButton wsteczButton;
    private JButton zamknijButton;
    private JPanel Panel3;
    private JLabel Ikonka;
    private JLabel lblSystemCheck;
    private ImageIcon IconKot = new ImageIcon(getClass().getResource("icons8-cat-100.png"));
    private ImageIcon IconPies = new ImageIcon(getClass().getResource("icons8-dog-140.png"));
    private ImageIcon IconChomik = new ImageIcon(getClass().getResource("icons8-hamster-64.png"));

    public RadioTask() {
        super("Lab2");
        this.setContentPane(this.Panel3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        int width = 600, height = 500;
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        kotRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(kotRadioButton.isSelected())
                    Ikonka.setIcon(IconKot);
                lblSystemCheck.setText("Wybrano: Kotka");
            }
        });
        zamknijButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        piesRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(piesRadioButton.isSelected())
                    Ikonka.setIcon(IconPies);
                lblSystemCheck.setText("Wybrano: Pieska");
            }
        });
        chomikRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chomikRadioButton.isSelected())
                    Ikonka.setIcon(IconChomik);
                lblSystemCheck.setText("Wybrano: Chomiczka");
            }
        });
        wsteczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginForm loginForm=new LoginForm();
            }
        });
    }
}
