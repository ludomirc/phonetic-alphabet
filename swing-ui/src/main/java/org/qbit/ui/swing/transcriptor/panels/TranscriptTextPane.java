package org.qbit.ui.swing.transcriptor.panels;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import javax.swing.*;

//VS4E -- DO NOT REMOVE THIS LINE!
public class TranscriptTextPane extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextPane jTextPane0;
    private JScrollPane jScrollPane0;

    public TranscriptTextPane() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new GroupLayout());
        add(getJScrollPane0(), new Constraints(new Leading(3, 357, 10, 10), new Bilateral(4, 2, 10, 234)));
        setSize(362, 240);
    }

    private JScrollPane getJScrollPane0() {
        if (jScrollPane0 == null) {
            jScrollPane0 = new JScrollPane();
            jScrollPane0.setViewportView(getJTextPane0());
        }
        return jScrollPane0;
    }

    private JTextPane getJTextPane0() {
        if (jTextPane0 == null) {
            jTextPane0 = new JTextPane();
            jTextPane0.setText("");
        }
        return jTextPane0;
    }

    public void clear() {
        getJTextPane0().setText("");
    }

    public void setText() {

    }

}
