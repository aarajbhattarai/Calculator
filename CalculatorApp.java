package calculator;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import CalculatorLogic.*;


class CalculatorApp extends JFrame implements ActionListener {
    JFrame frame;
    JPanel panel;
    JTextField jtInput;
    int num1,num2;
    Font serifFont= new Font(Font.SERIF,Font.BOLD,20);

    public CalculatorApp()
    {
        frame= new JFrame("Calculator");
        frame.setLayout(new BorderLayout());
        panel= new JPanel();
        panel.setLayout(new GridLayout(3,4));

        JButton b1= new JButton("1");
        JButton b2= new JButton("2");
        JButton b3= new JButton("3");
        JButton btnsum= new JButton("+");

        JButton b4= new JButton("4");
        JButton b5= new JButton("5");
        JButton b6= new JButton("6");
        JButton btnsub= new JButton("-");

        JButton b7= new JButton("7");
        JButton b8= new JButton("8");
        JButton b9= new JButton("9");
        JButton btnequal = new JButton("=");

        jtInput= new JTextField();


        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(btnsum);
        btnsum.setBackground(Color.BLUE);
        btnsum.setForeground(Color.GREEN);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(btnsub);
        btnsub.setBackground(Color.BLUE);
        btnsub.setForeground(Color.GREEN);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(btnequal);
        btnequal.setBackground(Color.MAGENTA);
        btnequal.setForeground(Color.WHITE);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        btnequal.addActionListener(this);
        btnsub.addActionListener(this);
        btnsum.addActionListener(this);

        frame.add(jtInput, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e){
        CalculatorLogic CalcLogic = new CalculatorLogic();
        if (flag == 3){
            txtfield.setText("");
            flag = 0;
        }
        if(e.getSource() == b1){
            txtfield.setText(txtfield.getText() + "1");
        }else if(e.getSource() == b2){
            txtfield.setText(txtfield.getText() + "2");
        }else if(e.getSource() == b3){
            txtfield.setText(txtfield.getText() + "3");
        }else if(e.getSource() == b4){
            txtfield.setText(txtfield.getText() + "4");
        }else if(e.getSource() == b5){
            txtfield.setText(txtfield.getText() + "5");
        }else if(e.getSource() == b6){
            txtfield.setText(txtfield.getText() + "6");
        }else if(e.getSource() == b7){
            txtfield.setText(txtfield.getText() + "7");
        }else if(e.getSource() == b8){
            txtfield.setText(txtfield.getText() + "8");
        }else if(e.getSource() == b9){
            txtfield.setText(txtfield.getText() + "9");
        }else if(e.getSource() == btnsum){
            this.num1 = Integer.parseInt(txtfield.getText());
            flag = 1;
            txtfield.setText("");
        }else if(e.getSource() == btnsub){
            this.num1 = Integer.parseInt(txtfield.getText());
            flag = 2;
            txtfield.setText("");
        } else if(e.getSource() == btnequal){
            this.num2 = Integer.parseInt(txtfield.getText());

            CalcLogic.setNum1(this.num1);
            CalcLogic.setNum2(this.num2);

            if(flag == 1){
                txtfield.setText(Integer.toString(CalcLogic.add()));

            }else if(flag == 2){
                txtfield.setText(Integer.toString(CalcLogic.sub()));
            }
            flag = 3;
        }

    }

    public static void main(String[] args) {
        new CalculatorApp();
    }

}