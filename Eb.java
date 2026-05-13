import java.awt.*;
import java.awt.event.*;

public class ebill extends Frame implements ActionListener
{
    public static void main(String args[])
    {
        ebill f = new ebill();
        f.setTitle("EB-BILL");
        f.setSize(500, 500);
        f.setVisible(true);
    }

    Label l0,l1,l2,l3,l4,l5,l6,l7,l8;
    TextField t1,t2,t3,t4,t5,t6;
    Button b1,b2;

    ebill()
    {setBackground(new Color(220, 245, 220));

        l0 = new Label("GOVERNMENT OF TAMILNADU");

        Font fo = new Font("Arial", Font.BOLD, 28);
        l0.setFont(fo);
        l0.setForeground(Color.BLUE);

        l1 = new Label("Electricity Board");

        Font f1 = new Font("Arial", Font.BOLD, 24);
        l1.setFont(f1);
        l1.setForeground(Color.DARK_GRAY);

        l2 = new Label("BILL RECEIPT");
        l3 = new Label("Enter the EB NO:");
        l4 = new Label("Enter the Customer name:");
        l5 = new Label("Enter the Previous Unit:");
        l6 = new Label("Enter the Current Unit:");
        l7 = new Label("Unit consumed this month:");
        l8 = new Label("Amount to be paid:");

        t1 = new TextField(30);
        t2 = new TextField(30);
        t3 = new TextField(30);
        t4 = new TextField(30);
        t5 = new TextField(30);
        t6 = new TextField(30);

        b1 = new Button("PAY");
        b2 = new Button("");

        add(l0);
        l0.setBounds(50, 50, 450, 50);

        add(l1);
        l1.setBounds(150, 100, 250, 30);

        add(l2);
        l2.setBounds(200, 140, 100, 30);

        add(l3);
        l3.setBounds(50, 180, 150, 30);

        add(t1);
        t1.setBounds(220, 180, 150, 30);

        add(l4);
        l4.setBounds(50, 220, 170, 30);

        add(t2);
        t2.setBounds(220, 220, 150, 30);

        add(l5);
        l5.setBounds(50, 260, 150, 30);

        add(t3);
        t3.setBounds(220, 260, 150, 30);

        add(l6);
        l6.setBounds(50, 300, 150, 30);

        add(t4);
        t4.setBounds(220, 300, 150, 30);

        add(l7);
        l7.setBounds(50, 340, 170, 30);

        add(t5);
        t5.setBounds(220, 340, 150, 30);

        add(l8);
        l8.setBounds(50, 380, 150, 30);

        add(t6);
        t6.setBounds(220, 380, 150, 30);

        b1.setBounds(200, 420, 60, 30);
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

            int a = Integer.parseInt(s3);
            int b = Integer.parseInt(s4);

            int uc = b - a;
            int amt = uc * 5;

            t5.setText("" + uc);
            t6.setText("" + amt);
        }
    }
}