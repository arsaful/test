
package calculator;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.lang.Math;
import java.lang.*;

class Calculator extends JFrame implements ActionListener{

    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,bans, ba, bs, bm, bd, bAC,bdel,bOn,bOff, bsqrt, bsqr,bnsqr,bsin,bcos,btan,bLn, bLog,bsinIn,bcosIn,btanIn,bequal,bmoduler,bdot;
    JTextField screen;
    int k = 1, x = 0, y = 0, z = 0;
    char ch;
    double temp, temp1, result, a;
    int currentLevel = 1;
    Container cont;
    Calculator(){
        //create a frame
        JFrame f= new JFrame("scientific calculator");



        // create a text Field

        screen = new JTextField();
        screen.setBounds(50, 50, 400, 79);
        screen.setBackground(Color.white);
        screen.setEditable(false);




        //create number of buttons
        b0 = new JButton("0");
        b0.setBounds(382,717,60,40);
        b1 = new JButton("1");
        b1.setBounds(92,673,60,40);
        b2 = new JButton("2");
        b2.setBounds(185,676,60,40);
        b3 = new JButton("3");
        b3.setBounds(271,676,60,40);
        b4 = new JButton("4");
        b4.setBounds(92,594,60,40);
        b5 = new JButton("5");
        b5.setBounds(185,594,60,40);
        b6 = new JButton("6");
        b6.setBounds(279,594,60,40);
        b7 = new JButton("7");
        b7.setBounds(92,512,60,40);
        b8 = new JButton("8");
        b8.setBounds(185,512,60,40);
        b9 = new JButton("9");
        b9.setBounds(279,512,60,40);
        bans = new JButton("ans");
        bans.setBounds(271,717,60,40);

        // create operator
        ba = new JButton("+");
        ba.setBounds(456,555,60,40);
        bs = new JButton("-");
        bs.setBounds(382,555,60,40);
        bm = new JButton("*");
        bm.setBounds(456,610,60,40);
        bd = new JButton("/");
        bd.setBounds(382,610,60,40);
        bAC = new JButton("AC");
        bAC.setBounds(456,500,60,40);
        bdel= new JButton("DEL");
        bdel.setBounds(382,500,60,40);
        bmoduler = new JButton("!");
        bmoduler.setBounds(456,665,60,40);
        bequal = new JButton("=");
        bequal.setBounds(456,717,60,40);
        bdot = new JButton(".");
        bdot.setBounds(382,665,60,40);


        //add action listeners
        bans.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        bs.addActionListener(this);
        ba.addActionListener(this);
        b9.addActionListener(this);
        b8.addActionListener(this);
        b7.addActionListener(this);
        b6.addActionListener(this);
        b5.addActionListener(this);
        b4.addActionListener(this);
        b3.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
        b0.addActionListener(this);
        bAC.addActionListener(this);
        bdel.addActionListener(this);
        bmoduler.addActionListener(this);

        bsqrt = new JButton("√");
        bsqrt.setBounds(82,259,60,40);
        bsqr = new JButton("x^y");
        bsqr.setBounds(134,259,60,40);
        bnsqr = new JButton("n√x");
        bnsqr.setBounds(192,259,60,40);
        bsin = new JButton("sin");
        bsin.setBounds(82,333,60,40);
        bcos = new JButton("cos");
        bcos.setBounds(134,333,60,40);
        btan = new JButton("tan");
        btan.setBounds(192,333,60,40);
        bLn = new JButton("ln");
        bLn.setBounds(244,259,60,40);
        bLog = new JButton("log");
        bLog.setBounds(299,259,60,40);
        bOn = new JButton("On");
        bOn.setBounds(398,175,60,40);
        bOff = new JButton("Off");
        bOff.setBounds(97,175,60,40);
        bsinIn = new JButton("sin^-1");
        bsinIn.setBounds(244,333,70,40);
        bcosIn = new JButton("cos^-1");
        bcosIn.setBounds(299,333,75,40);
        btanIn = new JButton("tan^-1");
        btanIn.setBounds(82,400,75,40);

        bsqrt.addActionListener(this);
        bdot.addActionListener(this);
        bnsqr.addActionListener(this);
        bsin.addActionListener(this);
        bcos.addActionListener(this);
        btan.addActionListener(this);

        bLn.addActionListener(this);
        bLog.addActionListener(this);
        bdot.addActionListener(this);
        bequal.addActionListener(this);
        bOn.addActionListener(this);
        bOff.addActionListener(this);
        bsinIn.addActionListener(this);
        bcosIn.addActionListener(this);
        btanIn.addActionListener(this);

        //Define color scheme
        Color darkBackgroundColor = new Color(43, 43, 43);
        Color darkForegroundColor = new Color(197, 200, 198);
        Color lightBackgroundColor = new Color(238, 238, 238);
        Color lightForegroundColor = new Color(66, 66, 66);

        //Set background and foreground colors
        f.getContentPane().setBackground(darkBackgroundColor);
        screen.setBackground(darkBackgroundColor);
        screen.setForeground(darkForegroundColor);





      f.add(bans);  f.add(b0); f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5); f.add(b6); f.add(b7); f.add(b8); f.add(b9); f.add(ba); f.add(bs); f.add(bm); f.add(bd); f.add(screen);  f.add(bAC); f.add(bdel); f.add(bOn); f.add(bOff); f.add(bsqrt); f.add(bsqr); f.add(bnsqr); f.add(bsin); f.add(bcos); f.add(btan); f.add(bLn); f.add(bLog); f.add(bsinIn); f.add(bcosIn); f.add(btanIn); f.add(bequal); f.add(bmoduler); f.add(bdot);
        // set frame properties
        f.setSize(600, 800);
        f.setLayout(null);
        f.setVisible(true);






    }





    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if (button.equals("1")) {
            if (z == 0) {
                screen.setText(screen.getText() + "1");
            } else {
                screen.setText("");
                screen.setText(screen.getText() + "1");
                z = 0;
            }
        }
        if (button.equals("2")) {
            if (z == 0) {
                screen.setText(screen.getText() + "2");
            } else {
                screen.setText("");
                screen.setText(screen.getText() + "2");
                z = 0;
            }
        }
        if (button.equals("3")) {
            if (z == 0) {
                screen.setText(screen.getText() + "3");
            } else {
                screen.setText("");
                screen.setText(screen.getText() + "3");
                z = 0;
            }
        }
        if (button.equals("4")) {
            if (z == 0) {
                screen.setText(screen.getText() + "4");
            } else {
                screen.setText("");
                screen.setText(screen.getText() + "4");
                z = 0;
            }
        }
        if (button.equals("5")) {
            if (z == 0) {
                screen.setText(screen.getText() + "5");
            } else {
                screen.setText("");
                screen.setText(screen.getText() + "5");
                z = 0;
            }
        }
        if (button.equals("6")) {
            if (z == 0) {
                screen.setText(screen.getText() + "6");
            } else {
                screen.setText("");
                screen.setText(screen.getText() + "6");
                z = 0;
            }
        }
        if (button.equals("7")) {
            if (z == 0) {
                screen.setText(screen.getText() + "7");
            } else {
                screen.setText("");
                screen.setText(screen.getText() + "7");
                z = 0;
            }
        }
        if (button.equals("8")) {
            if (z == 0) {
                screen.setText(screen.getText() + "8");
            } else {
                screen.setText("");
                screen.setText(screen.getText() + "8");
                z = 0;
            }
        }
        if (button.equals("9")) {
            if (z == 0) {
                screen.setText(screen.getText() + "9");
            } else {
                screen.setText("");
                screen.setText(screen.getText() + "9");
                z = 0;
            }
        }
        if (button.equals("0")) {
            if (z == 0) {
                screen.setText(screen.getText() + "0");
            } else {
                screen.setText("");
                screen.setText(screen.getText() + "0");
                z = 0;
            }
        }
        if (button.equals("AC")) {
            screen.setText("");
            x = 0;
            y = 0;
            z = 0;
        }
        if (button.equals("log")) {
            if (screen.getText().equals("")) {
                screen.setText("");
            } else {
                a = Math.log(Double.parseDouble(screen.getText()));
                screen.setText("");
                screen.setText(screen.getText() + a);
            }
        }
        if (button.equals("1/x")) {
            if (screen.getText().equals("")) {
                screen.setText("");
            } else {
                a = 1 / Double.parseDouble(screen.getText());
                screen.setText("");
                screen.setText(screen.getText() + a);
            }
        }
        if (button.equals("Exp")) {
            if (screen.getText().equals("")) {
                screen.setText("");
            } else {
                a = Math.exp(Double.parseDouble(screen.getText()));
                screen.setText("");
                screen.setText(screen.getText() + a);
            }
        }
        if (button.equals("x^2")) {
            if (screen.getText().equals("")) {
                screen.setText("");
            } else {
                a = Math.pow(Double.parseDouble(screen.getText()), 2);
                screen.setText("");
                screen.setText(screen.getText() + a);
            }
        }
        if (button.equals("x^3")) {
            if (screen.getText().equals("")) {
                screen.setText("");
            } else {
                a = Math.pow(Double.parseDouble(screen.getText()), 3);
                screen.setText("");
                screen.setText(screen.getText() + a);
            }
        }
        if (button.equals("+/-")) {
            if (x == 0) {
                screen.setText("-" + screen.getText());
                x = 1;
            } else {
                screen.setText(screen.getText());
            }
        }
        if (button.equals(".")) {
            if (y == 0) {
                screen.setText(screen.getText() + ".");
                y = 1;
            } else {
                screen.setText(screen.getText());
            }
        }
        if (button.equals("+")) {
            if (screen.getText().equals("")) {
                screen.setText("");
                temp = 0;
                ch = '+';
            } else {
                temp = Double.parseDouble(screen.getText());
                screen.setText("");
                ch = '+';
                y = 0;
                x = 0;
            }
            screen.requestFocus();
        }
        if (button.equals("-")) {
            if (screen.getText().equals("")) {
                screen.setText("");
                temp = 0;
                ch = '-';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(screen.getText());
                screen.setText("");
                ch = '-';
            }
            screen.requestFocus();
        }
        if (button.equals("/")) {
            if (screen.getText().equals("")) {
                screen.setText("");
                temp = 1;
                ch = '/';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(screen.getText());
                ch = '/';
                screen.setText("");
            }
            screen.requestFocus();
        }

        if (button.equals("DEL")) {
            String text = screen.getText();
            if (text.length() > 0) {
                text = text.substring(0, text.length() - 1);
                screen.setText(text);
            }
        }

        if (button.equals("*")) {
            if (screen.getText().equals("")) {
                screen.setText("");
                temp = 1;
                ch = '*';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(screen.getText());
                ch = '*';
                screen.setText("");
            }
            screen.requestFocus();
        }



        if (button.equals("Sqrt")) {
            if (screen.getText().equals("")) {
                screen.setText("");
            } else {
                a = Math.sqrt(Double.parseDouble(screen.getText()));
                screen.setText("");
                screen.setText(screen.getText() + a);
            }
        }
        if (button.equals("sin")) {
            if (screen.getText().equals("")) {
                screen.setText("");
            } else {
                a = Math.sin(Double.parseDouble(screen.getText()));
                screen.setText("");
                screen.setText(screen.getText() + a);
            }
        }
        if (button.equals("cos")) {
            if (screen.getText().equals("")) {
                screen.setText("");
            } else {
                a = Math.cos(Double.parseDouble(screen.getText()));
                screen.setText("");
                screen.setText(screen.getText() + a);
            }
        }
        if (button.equals("tan")) {
            if (screen.getText().equals("")) {
                screen.setText("");
            } else {
                a = Math.tan(Double.parseDouble(screen.getText()));
                screen.setText("");
                screen.setText(screen.getText() + a);
            }
        }
        if (button.equals("=")) {
            if (screen.getText().equals("")) {
                screen.setText("");
            } else {
                temp1 = Double.parseDouble(screen.getText());
                switch (ch) {
                    case '+':
                        result = temp + temp1;
                        break;
                    case '-':
                        result = temp - temp1;
                        break;
                    case '/':
                        result = temp / temp1;
                        break;
                    case '*':
                        result = temp * temp1;
                        break;
                }
                screen.setText("");
                screen.setText(screen.getText() + result);
                z = 1;
            }
        }
        if (button.equals("n!")) {
            if (screen.getText().equals("")) {
                screen.setText("");
            } else {
                a = fact(Double.parseDouble(screen.getText()));
                screen.setText("");
                screen.setText(screen.getText() + a);
            }
        }
        screen.requestFocus();
    }

    double fact(double x) {
        if (x < 0) {
            return 0;
        }
        double i, s = 1;
        for (i = 2; i <= x; i += 1.0)
            s *= i;
        return s;
    }


    public static void main(String[] args) {

        Calculator f = new Calculator();
        f.setTitle("ScientificCalculator");
        f.pack();
        f.setVisible(true);

    }


}


