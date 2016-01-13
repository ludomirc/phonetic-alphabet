package org.qbit.ui.swing.transcriptor.panels;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import javax.swing.*;
import java.awt.*;

//VS4E -- DO NOT REMOVE THIS LINE!
public class ButtonPane extends JPanel {

    private static final long serialVersionUID = 1L;
    private JButton jButton0;
    private JButton jButton1;

    public ButtonPane() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new GroupLayout());
        add(getJButton0(), new Constraints(new Leading(26, 10, 10), new Leading(23, 10, 10)));
        add(getJButton1(), new Constraints(new Leading(201, 10, 10), new Leading(23, 12, 12)));
        setSize(320, 70);
    }

    private JButton getJButton1() {
        if (jButton1 == null) {
            jButton1 = new JButton();
            jButton1.setText("Clear");
            jButton1.setPreferredSize(new Dimension(93, 26));
            jButton1.setMinimumSize(new Dimension(93, 26));
            jButton1.setMaximumSize(new Dimension(93, 26));
        }
        return jButton1;
    }

    private JButton getJButton0() {
        if (jButton0 == null) {
            jButton0 = new JButton();
            jButton0.setText("Transcript");
        }
        return jButton0;
    }

}
