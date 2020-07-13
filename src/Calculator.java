import javax.swing.*;
import java.awt.*;

public class Calculator {

    private JPanel windowPane;
    private JTextField textField;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton clear;
    private JButton decimal;
    private JButton zero;
    private JButton plus;
    private JButton result;
    private JButton minus;
    private JButton multiply;
    private JButton divide;
    private BorderLayout borderLayout;
    private JPanel secondary;
    private JFrame frame;

    public Calculator() {

        windowPane = new JPanel();
        borderLayout = new BorderLayout();

        windowPane.setLayout(borderLayout);

        JPanel p1 = new JPanel();

        textField = new JTextField(40);

        textField.setPreferredSize(new Dimension(420, 40));

        plus = new JButton("+");

        plus.setPreferredSize(new Dimension(60, 40));
        p1.add(textField);
        p1.add(plus);

        windowPane.add("North", p1);

        one = new JButton("1");
        one.setPreferredSize(new Dimension(100, 60));
        two = new JButton("2");
        two.setPreferredSize(new Dimension(100, 60));
        three = new JButton("3");
        three.setPreferredSize(new Dimension(100, 60));
        clear = new JButton("C");
        clear.setPreferredSize(new Dimension(100, 60));
        minus = new JButton("-");
        minus.setPreferredSize(new Dimension(100, 60));
        four = new JButton("4");
        four.setPreferredSize(new Dimension(100, 60));
        five = new JButton("5");
        five.setPreferredSize(new Dimension(100, 60));
        six = new JButton("6");
        six.setPreferredSize(new Dimension(100, 60));
        decimal = new JButton(".");
        decimal.setPreferredSize(new Dimension(100, 60));
        multiply = new JButton("*");
        multiply.setPreferredSize(new Dimension(100, 60));
        seven = new JButton("7");
        seven.setPreferredSize(new Dimension(100, 60));
        eight = new JButton("8");
        eight.setPreferredSize(new Dimension(100, 60));
        nine = new JButton("9");
        nine.setPreferredSize(new Dimension(100, 60));
        zero = new JButton("0");
        zero.setPreferredSize(new Dimension(100, 60));
        divide = new JButton("/");
        divide.setPreferredSize(new Dimension(100, 60));

        result = new JButton("=");



        secondary = new JPanel();

        GridLayout gl = new GridLayout(3,5);
        secondary.setLayout(gl);

        secondary.add(one);
        secondary.add(two);
        secondary.add(three);
        secondary.add(clear);
        secondary.add(minus);

        secondary.add(four);
        secondary.add(five);
        secondary.add(six);
        secondary.add(decimal);
        secondary.add(multiply);

        secondary.add(seven);
        secondary.add(eight);
        secondary.add(nine);
        secondary.add(zero);
        secondary.add(divide);

        windowPane.add("Center", secondary);

        result.setPreferredSize(new Dimension(510, 40));

        JPanel p2 = new JPanel();
        p2.add(result);

        windowPane.add("South", p2);

        frame = new JFrame("Calculator");
        frame.setContentPane(windowPane);
        frame.pack();

        frame.setVisible(true);

        CalculatorEngine engine = new CalculatorEngine(this);

          one.addActionListener(engine);
          two.addActionListener(engine);
          three.addActionListener(engine);
          four.addActionListener(engine);
          five.addActionListener(engine);
          six.addActionListener(engine);
          seven.addActionListener(engine);
          eight.addActionListener(engine);
          nine.addActionListener(engine);
          clear.addActionListener(engine);
          decimal.addActionListener(engine);
          zero.addActionListener(engine);
          plus.addActionListener(engine);
          result.addActionListener(engine);
          minus.addActionListener(engine);
          multiply.addActionListener(engine);
          divide.addActionListener(engine);

    }

    public void setTextField(String _text) {
        textField.setText(_text);
    }

    public String getTextField() {
        return textField.getText();
    }
}
