import java.awt.*;
import java.awt.event.*;

public class mark extends Frame implements ActionListener
{
    public static void main(String args[])
    {
        mark f = new mark();
        f.setTitle("STUDENT MARKLIST");
        f.setSize(500, 600);
        f.setVisible(true);
    }

    Label l0,l1,l2,l3,l4,l5,l6,l7,l8;
    TextField t1,t2,t3,t4,t5,t6,t7,t8;
    Button b1,b2;

    mark()
    {
        setBackground(new Color(255, 228, 225));

        l0 = new Label("STUDENT MARKLIST");

        Font fo = new Font("Arial", Font.BOLD, 28);
        l0.setFont(fo);
        l0.setForeground(Color.BLUE);

        l1 = new Label("Enter Enrollment no:");
        l2 = new Label("Enter The Name:");
        l3 = new Label("Enter the Java mark:");
        l4 = new Label("Enter the OS mark:");
        l5 = new Label("Enter the CWS mark:");
        l6 = new Label("Enter the DBE mark:");
        l7 = new Label("Total:");
        l8 = new Label("Average:");

        t1 = new TextField(30);
        t2 = new TextField(30);
        t3 = new TextField(30);
        t4 = new TextField(30);
        t5 = new TextField(30);
        t6 = new TextField(30);
        t7 = new TextField(30);
        t8 = new TextField(30);

        b1 = new Button("Get Result");
        b2 = new Button("");

        add(l0);
        l0.setBounds(100, 50, 350, 30);

        add(l1);
        l1.setBounds(50, 100, 150, 30);

        add(t1);
        t1.setBounds(220, 100, 150, 30);

        add(l2);
        l2.setBounds(50, 140, 150, 30);

        add(t2);
        t2.setBounds(220, 140, 150, 30);

        add(l3);
        l3.setBounds(50, 180, 150, 30);

        add(t3);
        t3.setBounds(220, 180, 150, 30);

        add(l4);
        l4.setBounds(50, 220, 150, 30);

        add(t4);
        t4.setBounds(220, 220, 150, 30);

        add(l5);
        l5.setBounds(50, 260, 150, 30);

        add(t5);
        t5.setBounds(220, 260, 150, 30);

        add(l6);
        l6.setBounds(50, 300, 150, 30);

        add(t6);
        t6.setBounds(220, 300, 150, 30);

        add(l7);
        l7.setBounds(50, 340, 150, 30);

        add(t7);
        t7.setBounds(220, 340, 150, 30);

        add(l8);
        l8.setBounds(50, 380, 150, 30);

        add(t8);
        t8.setBounds(220, 380, 150, 30);

        b1.setBounds(140, 420, 100, 30);
        b1.addActionListener(this);
        add(b1);

        add(b2);

        setLayout(null);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            String s3 = t3.getText();
            String s4 = t4.getText();
            String s5 = t5.getText();
            String s6 = t6.getText();

            int a = Integer.parseInt(s3);
            int b = Integer.parseInt(s4);
            int c = Integer.parseInt(s5);
            int d = Integer.parseInt(s6);

            int tot = a + b + c + d;
            int avg = tot / 4;

            t7.setText("" + tot);
            t8.setText("" + avg);
        }
    }
}