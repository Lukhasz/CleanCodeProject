package kjellgren.linus.cleancodeprojekt;

import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class Press {

    double x, y;
    int c;
    boolean clear = true;
    IFrameComponents ifc;

    public Press(IFrameComponents ifc) {
        this.ifc = ifc;
        disableMathButtons();
    }

    public void connectButtons() {
        ifc.getOne().addActionListener(this::pressOne);
        ifc.getTwo().addActionListener(this::pressTwo);
        ifc.getThree().addActionListener(this::pressThree);
        ifc.getFour().addActionListener(this::pressFour);
        ifc.getFive().addActionListener(this::pressFive);
        ifc.getSix().addActionListener(this::pressSix);
        ifc.getSeven().addActionListener(this::pressSeven);
        ifc.getEight().addActionListener(this::pressEight);
        ifc.getNine().addActionListener(this::pressNine);
        ifc.getZero().addActionListener(this::pressZero);
        ifc.getPlus().addActionListener(this::pressPlus);
        ifc.getMinus().addActionListener(this::pressMinus);
        ifc.getMultiplication().addActionListener(this::pressMultiplication);
        ifc.getDivision().addActionListener(this::pressDivision);
        ifc.getEquals().addActionListener(this::pressEquals);
        ifc.getDot().addActionListener(this::pressDot);
        ifc.getBack().addActionListener(this::pressBack);
        ifc.getClear().addActionListener(this::pressClear);
        ifc.getPowerOn().addActionListener(this::pressPowerOn);
        ifc.getPowerOff().addActionListener(this::pressPowerOff);
    }

    public void math() {
        System.out.println(ifc.getTextField().getText());
        if (c == 1) {
            y = Calculations.addition(x, ifc);
        }
        if (c == 2) {
            y = Calculations.subtraction(x, ifc);
        }
        if (c == 3) {
            y = Calculations.multiplication(x, ifc);
        }
        if (c == 4) {
            y = Calculations.division(x, ifc);
        }

        System.out.println("=");
        System.out.println(y);
        System.out.println();
    }

    protected void uTF(JButton button) {
        ifc.getTextField().setText(ifc.getTextField().getText() + button.getText());
        enableMathButtons();
    }

    public void enableAllButtons() {
        ifc.getOne().setEnabled(true);
        ifc.getTwo().setEnabled(true);
        ifc.getThree().setEnabled(true);
        ifc.getFour().setEnabled(true);
        ifc.getFive().setEnabled(true);
        ifc.getSix().setEnabled(true);
        ifc.getSeven().setEnabled(true);
        ifc.getEight().setEnabled(true);
        ifc.getNine().setEnabled(true);
        ifc.getZero().setEnabled(true);
        ifc.getPlus().setEnabled(true);
        ifc.getMinus().setEnabled(true);
        ifc.getMultiplication().setEnabled(true);
        ifc.getDivision().setEnabled(true);
        ifc.getEquals().setEnabled(true);
        ifc.getDot().setEnabled(true);
        ifc.getBack().setEnabled(true);
        ifc.getClear().setEnabled(true);
        ifc.getPowerOn().setEnabled(false);
        ifc.getPowerOff().setEnabled(true);
        ifc.getTextField().setEnabled(true);
    }

    public void disableAllButtons() {
        ifc.getOne().setEnabled(false);
        ifc.getTwo().setEnabled(false);
        ifc.getThree().setEnabled(false);
        ifc.getFour().setEnabled(false);
        ifc.getFive().setEnabled(false);
        ifc.getSix().setEnabled(false);
        ifc.getSeven().setEnabled(false);
        ifc.getEight().setEnabled(false);
        ifc.getNine().setEnabled(false);
        ifc.getZero().setEnabled(false);
        ifc.getPlus().setEnabled(false);
        ifc.getMinus().setEnabled(false);
        ifc.getMultiplication().setEnabled(false);
        ifc.getDivision().setEnabled(false);
        ifc.getEquals().setEnabled(false);
        ifc.getDot().setEnabled(false);
        ifc.getBack().setEnabled(false);
        ifc.getClear().setEnabled(false);
        ifc.getPowerOn().setEnabled(true);
        ifc.getPowerOff().setEnabled(false);
        ifc.getTextField().setEnabled(false);
    }

    public void disableMathButtons() {
        ifc.getPlus().setEnabled(false);
        ifc.getMinus().setEnabled(false);
        ifc.getMultiplication().setEnabled(false);
        ifc.getDivision().setEnabled(false);
        ifc.getEquals().setEnabled(false);
        ifc.getDot().setEnabled(false);
        ifc.getBack().setEnabled(false);
    }

    public void enableMathButtons() {
        ifc.getPlus().setEnabled(true);
        ifc.getMinus().setEnabled(true);
        ifc.getMultiplication().setEnabled(true);
        ifc.getDivision().setEnabled(true);
        ifc.getEquals().setEnabled(true);
        ifc.getDot().setEnabled(true);
        ifc.getBack().setEnabled(true);
    }



    protected void pressOne(ActionEvent evt) {
        uTF(ifc.getOne());
    }

    protected void pressTwo(ActionEvent evt) {
        uTF(ifc.getTwo());
    }

    protected void pressThree(ActionEvent evt) {
        uTF(ifc.getThree());
    }

    protected void pressFour(ActionEvent evt) {
        uTF(ifc.getFour());
    }

    protected void pressFive(ActionEvent evt) {
        uTF(ifc.getFive());
    }

    protected void pressSix(ActionEvent evt) {
        uTF(ifc.getSix());
    }

    protected void pressSeven(ActionEvent evt) {
        uTF(ifc.getSeven());
    }

    protected void pressEight(ActionEvent evt) {
        uTF(ifc.getEight());
    }

    protected void pressNine(ActionEvent evt) {
        uTF(ifc.getNine());
    }

    protected void pressZero(ActionEvent evt) {
        uTF(ifc.getZero());
    }

    protected void pressPlus(ActionEvent evt) {

        if (!clear) {
            math();
        }
        System.out.println(ifc.getTextField().getText());
        System.out.println("+");
        clear = false;
        x = Double.parseDouble(ifc.getTextField().getText());
        c = 1;
        ifc.getTextField().setText("");
        ifc.getLabel().setText(x + "+");
    }

    protected void pressMinus(ActionEvent evt) {
        if (!clear) {
            math();
        }
        System.out.println(ifc.getTextField().getText());
        System.out.println("-");
        clear = false;
        x = Double.parseDouble(ifc.getTextField().getText());
        c = 2;
        ifc.getTextField().setText("");
        ifc.getLabel().setText(x + "-");
    }

    protected void pressMultiplication(ActionEvent evt) {
        if (Double.parseDouble(ifc.getTextField().getText()) == 0.0) {
            System.out.println("Multiplication By Zero");
            ifc.getTextField().setText("");
            ifc.getLabel().setText("Multiplication By Zero");
            disableMathButtons();
            clear = true;
        } else {
            if (!clear) {
                math();
            }
            System.out.println(ifc.getTextField().getText());
            System.out.println("*");
            clear = false;
            x = Double.parseDouble(ifc.getTextField().getText());
            c = 3;
            ifc.getTextField().setText("");
            ifc.getLabel().setText(x + "*");
        }
    }

    protected void pressDivision(ActionEvent evt) {
        if (Double.parseDouble(ifc.getTextField().getText()) == 0.0) {
            System.out.println("Division By Zero");
            ifc.getTextField().setText("");
            ifc.getLabel().setText("Division By Zero");
            disableMathButtons();
            clear = true;
        } else {
            if (!clear) {
                math();
            }
            System.out.println(ifc.getTextField().getText());
            System.out.println("/");
            clear = false;
            x = Double.parseDouble(ifc.getTextField().getText());
            c = 4;
            ifc.getTextField().setText("");
            ifc.getLabel().setText(x + "/");

        }

    }

    protected void pressEquals(ActionEvent evt) {
        math();
        clear = true;
        ifc.getLabel().setText("");
    }

    protected void pressDot(ActionEvent evt) {
        uTF(ifc.getDot());
    }

    protected void pressBack(ActionEvent evt) {
        int length = ifc.getTextField().getText().length();
        int number = ifc.getTextField().getText().length() - 1;
        String store;
        if (length > 0) {
            StringBuilder back = new StringBuilder(ifc.getTextField().getText());
            back.deleteCharAt(number);
            store = back.toString();
            ifc.getTextField().setText(store);
        }
        if (ifc.getTextField().getText().length() <= 0) {
            disableMathButtons();
        }
    }

    protected void pressClear(ActionEvent evt) {
        ifc.getTextField().setText("");
        disableMathButtons();
    }

    protected void pressPowerOn(ActionEvent evt) {
        enableAllButtons();
    }

    protected void pressPowerOff(ActionEvent evt) {
        disableAllButtons();
    }

}
