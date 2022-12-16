package kjellgren.linus.cleancodeprojekt;

public class Calculations {
    
    public static double addition(double num, IFrameComponents ifc){
        double ans = Double.sum(num, Double.parseDouble(ifc.getTextField().getText()));
        ifc.getTextField().setText(Double.toString(ans));
        return ans;
    }
    public static double subtraction(double num, IFrameComponents ifc){
        double ans = num - Double.parseDouble(ifc.getTextField().getText());
        ifc.getTextField().setText(Double.toString(ans));
        return ans;
    }
    public static double multiplication(double num, IFrameComponents ifc){
        double inDouble = Double.parseDouble(ifc.getTextField().getText());
        if (inDouble==0){
            ifc.getTextField().setText("");
            ifc.getLabel().setText("Multiplication by Zero");
            return 0.0;
        }
        double ans = num * inDouble;
        ifc.getTextField().setText(Double.toString(ans));
        return ans;
    }
    public static double division(double num, IFrameComponents ifc){
        double inDouble = Double.parseDouble(ifc.getTextField().getText());
        if (inDouble==0){
            ifc.getTextField().setText("");
            ifc.getLabel().setText("Division by Zero");
            return 0.0;
        }
        double ans = num / inDouble;
        ifc.getTextField().setText(Double.toString(ans));
        return ans;
    }
    
}
