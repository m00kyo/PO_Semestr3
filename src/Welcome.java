import javax.swing.*;

public class Welcome extends JFrame{
    private JPanel Panel1;
    private JProgressBar progressBar1;
    private JLabel lblCzekac;


    public Welcome(){
        setContentPane(Panel1);
        setTitle("lab2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);

        progression();
    }
    private void progression(){
        int counter = 0;
        while (counter<=100){
            lblCzekac.setText("Proszę czekać...");
            progressBar1.setValue(counter);
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            counter+=5;

        }
        dispose();
        LoginForm loginForm=new LoginForm();
    }
}

