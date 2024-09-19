import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tet extends JFrame  {
    private JLabel jsFirstName;
    private JTextField textField1;
    private JButton clickMeButton;
    private JPanel TetPannel;

    public Tet(){
        setContentPane(TetPannel);
        setTitle("Simple GUI App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setVisible(true);

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = textField1.getText();
                JOptionPane.showMessageDialog(Tet.this , "Welcome " + firstName  );
            }
        });
    }

    public static void main(String[] args) {
        new Tet();
    }

}
