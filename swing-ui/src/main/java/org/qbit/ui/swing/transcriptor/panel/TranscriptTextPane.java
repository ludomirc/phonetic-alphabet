package org.qbit.ui.swing.transcriptor.panel;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

@Component
//VS4E -- DO NOT REMOVE THIS LINE!
public class TranscriptTextPane extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextPane jTextPane;
    private JScrollPane jScrollPane;

    @PostConstruct
    private void initComponents() {
        setLayout(new GroupLayout());
        add(getJScrollPane(), new Constraints(new Leading(3, 357, 10, 10), new Bilateral(4, 2, 10, 234)));
        setSize(362, 240);
    }

    private JScrollPane getJScrollPane() {
        if (jScrollPane == null) {
            jScrollPane = new JScrollPane();
            jScrollPane.setViewportView(getJTextPane());
        }
        return jScrollPane;
    }

    private JTextPane getJTextPane() {
        if (jTextPane == null) {
            jTextPane = new JTextPane();
            jTextPane.setText("input text to transcript");
        }
        return jTextPane;
    }

    public String getText() {
        return jTextPane.getText();
    }

    public void clear() {
        getJTextPane().setText("");
    }
}
