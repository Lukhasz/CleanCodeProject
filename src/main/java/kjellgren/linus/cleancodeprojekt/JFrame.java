package kjellgren.linus.cleancodeprojekt;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import java.awt.Font;

public class JFrame extends javax.swing.JFrame {

    private final IFrameComponents ifc;

    public JFrame() {
        ifc = new IFrameComponents();
        initializeComponents();
        Press ac = new Press(ifc);
        ac.connectButtons();
        ifc.getPowerOn().setEnabled(false);
    }
    
    

//<editor-fold defaultState="collapsed" desc="initComponents()">
    protected void initializeComponents() {
        /* 
            This is Auto-Generated code from a netbeans 
            JFrame Form that I, Linus has then changed names in
            and moved some code elsewhere.
        */
        ifc.setOne(new JButton());
        ifc.setTwo(new JButton());
        ifc.setThree(new JButton());
        ifc.setFour(new JButton());
        ifc.setFive(new JButton());
        ifc.setSix(new JButton());
        ifc.setSeven(new JButton());
        ifc.setEight(new JButton());
        ifc.setNine(new JButton());
        ifc.setZero(new JButton());
        ifc.setPlus(new JButton());
        ifc.setMinus(new JButton());
        ifc.setMultiplication(new JButton());
        ifc.setDivision(new JButton());
        ifc.setEqualSign(new JButton());
        ifc.setDot(new JButton());
        ifc.setBack(new JButton());
        ifc.setClear(new JButton());
        ifc.setPowerOn(new JRadioButton());
        ifc.setPowerOff(new JRadioButton());
        ifc.setButtonGroup1(new ButtonGroup());
        ifc.setLabel(new JLabel());
        ifc.setTextField(new JTextField());


        
        //Set program to end on closing window
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Sets iframe above everything
        setAlwaysOnTop(true);

        //Sets name on window
        setTitle("projectJFrame");
        setLocation(new java.awt.Point(500, 250));

        //Sets window to not resizeable
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        
        //Sets numbers test frame to not editable
        ifc.getTextField().setEditable(false);

        //Set Font
        ifc.getTextField().setFont(new Font("Tahoma", 1, 23)); // NOI18N
        ifc.getTextField().setHorizontalAlignment(JTextField.RIGHT);

        ifc.getButtonGroup1().add(ifc.getPowerOn());
        //Set Font
        ifc.getPowerOn().setFont(new Font("Tahoma", 1, 11)); // NOI18N
        ifc.getPowerOn().setText("On");

        ifc.getButtonGroup1().add(ifc.getPowerOff());
        //Set Font
        ifc.getPowerOff().setFont(new Font("Tahoma", 1, 11)); // NOI18N
        ifc.getPowerOff().setText("Off");

        //Set Font
        ifc.getOne().setFont(new Font("Tahoma", 1, 20)); // NOI18N
        ifc.getOne().setText("1");

        //Set Font
        ifc.getTwo().setFont(new Font("Tahoma", 1, 20)); // NOI18N
        ifc.getTwo().setText("2");

        //Set Font
        ifc.getThree().setFont(new Font("Tahoma", 1, 20)); // NOI18N
        ifc.getThree().setText("3");

        //Set Font
        ifc.getFour().setFont(new Font("Tahoma", 1, 20)); // NOI18N
        ifc.getFour().setText("4");

        //Set Font
        ifc.getFive().setFont(new Font("Tahoma", 1, 20)); // NOI18N
        ifc.getFive().setText("5");

        //Set Font
        ifc.getSix().setFont(new Font("Tahoma", 1, 20)); // NOI18N
        ifc.getSix().setText("6");

        //Set Font
        ifc.getSeven().setFont(new Font("Tahoma", 1, 20)); // NOI18N
        ifc.getSeven().setText("7");

        //Set Font
        ifc.getEight().setFont(new Font("Tahoma", 1, 20)); // NOI18N
        ifc.getEight().setText("8");

        //Set Font
        ifc.getNine().setFont(new Font("Tahoma", 1, 20)); // NOI18N
        ifc.getNine().setText("9");

        //Set Font
        ifc.getZero().setFont(new Font("Tahoma", 1, 20)); // NOI18N
        ifc.getZero().setText("0");

        //Set Font
        ifc.getBack().setFont(new Font("Tahoma", 1, 14)); // NOI18N
        ifc.getBack().setText("<--");

        //Set Font
        ifc.getClear().setFont(new Font("Tahoma", 1, 20)); // NOI18N
        ifc.getClear().setText("C");

        //Set Font
        ifc.getPlus().setFont(new Font("Tahoma", 1, 20)); // NOI18N
        ifc.getPlus().setText("+");

        //Set Font
        ifc.getMinus().setFont(new Font("Tahoma", 1, 20)); // NOI18N
        ifc.getMinus().setText("-");

        //Set Font
        ifc.getMultiplication().setFont(new Font("Tahoma", 1, 20)); // NOI18N
        ifc.getMultiplication().setText("*");

        //Set Font
        ifc.getDivision().setFont(new Font("Tahoma", 1, 20)); // NOI18N
        ifc.getDivision().setText("/");

        //Set Font
        ifc.getDot().setFont(new Font("Tahoma", 1, 20)); // NOI18N
        ifc.getDot().setText(".");

        //Set Font
        ifc.getEquals().setFont(new Font("Tahoma", 1, 20)); // NOI18N
        ifc.getEquals().setText("=");

        //Set Font
        ifc.getLabel().setFont(new Font("Tahoma", 0, 11)); // NOI18N

        //Set Font Color
        ifc.getLabel().setForeground(new java.awt.Color(255, 51, 51));
        ifc.getLabel().setHorizontalAlignment(SwingConstants.RIGHT);

        // Set Empty text
        ifc.getLabel().setText(" ");

        
        //This sets upp the layout for the JFrame. Its autogenerated in the JFrame Form.
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(ifc.getTextField())
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(ifc.getPowerOn())
                                                                .addComponent(ifc.getPowerOff()))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(ifc.getBack(), javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(ifc.getClear(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ifc.getPlus(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(ifc.getDot(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ifc.getZero(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ifc.getEquals(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(ifc.getSeven(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getEight(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getNine(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(ifc.getFour(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getFive(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getSix(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(ifc.getOne(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getTwo(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getThree(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(ifc.getMinus(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(ifc.getMultiplication(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(ifc.getDivision(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ifc.getLabel(), javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ifc.getLabel())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ifc.getTextField(), javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(ifc.getPowerOn())
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ifc.getPowerOff()))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(ifc.getClear(), javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ifc.getPlus(), javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ifc.getBack(), javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ifc.getSeven(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ifc.getEight(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ifc.getNine(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ifc.getFour(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ifc.getFive(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ifc.getSix(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(ifc.getMinus(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ifc.getMultiplication(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(ifc.getOne(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ifc.getTwo(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ifc.getThree(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(ifc.getDivision(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ifc.getDot(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ifc.getZero(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ifc.getEquals(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        pack();
    }
//</editor-fold>

}
