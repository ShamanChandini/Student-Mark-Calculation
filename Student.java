import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private static JTextField txtmts;
    private JTextField txtscience;
    private JTextField txtsocial;
    private JTextField txtavg;
    private JTextField txtgrade;
    private JButton calculateButton;
    private JTextField txtStdName;
    private JTextField txtmaths;
    private JPanel main;
    private JTextField txtTotal;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student(txtmts).main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student(JTextField txtmts) {
        this.txtmts = txtmts;
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int m1,m2,m3,tot;
                double avg;
                m1 = Integer.parseInt(txtmaths.getText());
                m2 = Integer.parseInt(txtscience.getText());
                m3 = Integer.parseInt(txtsocial.getText());
                tot = m1 + m2 + m3;
                txtTotal.setText(String.valueOf(tot));
avg=tot/3;
txtavg.setText(String.valueOf(avg));
if(avg>50)
{txtgrade.setText("PASS");}
else{
    txtgrade.setText("FAIL");
}



        };
    });
}}
