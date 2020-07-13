import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngine implements ActionListener {

    private double x1 = 0;
    private double x2 = 0;
    private int choice = 0;

    private Calculator parent;

    public CalculatorEngine(Calculator calculator){
        parent = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton clicked = (JButton) e.getSource();
        //1,2,3,4,5,6,7,8,9,.,0 -> takes the field value and add the digit pressed to it
        switch (clicked.getText()) {
            case ("0"):
            case ("1"):
            case ("2"):
            case ("3"):
            case ("4"):
            case ("5"):
            case ("6"):
            case ("7"):
            case ("8"):
            case ("9"):
            case ("."): {
                parent.setTextField(parent.getTextField() + clicked.getText());
            }
            break;
            //+,-,*,/ -> take the field, save it, clear it ->
            case ("+"):{
                x1 = x2;
                x2 = Double.parseDouble(parent.getTextField());
                parent.setTextField("");
                choice = 0;
            }
            break;

            case ("-"):{
                x1 = x2;
                x2 = Double.parseDouble(parent.getTextField());
                parent.setTextField("");
                choice = 1;
            }
            break;

            case ("*"):{
                x1 = x2;
                x2 = Double.parseDouble(parent.getTextField());
                parent.setTextField("");
                choice = 2;
            }
            break;

            case ("/"): {
                x1 = x2;
                x2 = Double.parseDouble(parent.getTextField());
                parent.setTextField("");
                choice = 3;
            }
            break;
            //clear -> clear the field completely
            case("C"): {
                parent.setTextField("");
                x1 = 0;
                x2 = 0;
                choice = 0;
            }
            break;
            //result -> returns the result to the field
            case("="): {
                if(choice == 0){
                    parent.setTextField(String.valueOf(x2 + Double.parseDouble(parent.getTextField())));
                }else if (choice == 1){
                    parent.setTextField(String.valueOf(x2 -  Double.parseDouble(parent.getTextField())));
                }else if(choice == 2){
                    parent.setTextField(String.valueOf(x2 *  Double.parseDouble(parent.getTextField())));
                }else{
                    parent.setTextField(String.valueOf(x2 /  Double.parseDouble(parent.getTextField())));
                }
            }
            break;

            default: throw new IllegalStateException();
        }
    }
}
