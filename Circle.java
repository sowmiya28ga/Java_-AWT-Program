import java.awt.*;
import java.awt.event.*;

public class Circle extends Frame implements ActionListener
{
    public static void main(String args[])
    {
        Circle f = new Circle();

        f.setTitle("Circle Program");
        f.setSize(500,300);
        f.setVisible(true);
    }

    Label l0, l1, l2;
    TextField t1, t2;
    Button b1, b2, b3;

    Circle()
    {
        
        setBackground(new Color(210, 235, 250));

        l0 = new Label("Circle Program");
        l1 = new Label("Number");
        l2 = new Label("Result");

        Font fo = new Font("Arial", Font.BOLD, 24);
        l0.setFont(fo);
        l0.setForeground(Color.BLUE);

        t1 = new TextField(30);
        t2 = new TextField(30);

        b1 = new Button("Area");
        b2 = new Button("Surface");
        b3 = new Button(" ");

        l0.setBounds(150, 50, 200, 30);

        l1.setBounds(50, 100, 80, 30);

        l2.setBounds(50, 150, 80, 30);

        t1.setBounds(150, 100, 100, 30);

        t2.setBounds(150, 150, 100, 30);

        b1.setBounds(300, 100, 100, 30);

        b2.setBounds(300, 150, 100, 30);

        add(l0);
        add(l1);
        add(l2);

        add(t1);
        add(t2);

        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(null);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            String s1 = t1.getText();

            int r = Integer.parseInt(s1);

            int area = (22 / 7) * r * r;

            t2.setText("" + area);
        }

        if(ae.getSource() == b2)
        {
            String s2 = t1.getText();

            int n = Integer.parseInt(s2);

            int sur = 2 * (22 / 7) * n;

            t2.setText("" + sur);
        }
    }
}