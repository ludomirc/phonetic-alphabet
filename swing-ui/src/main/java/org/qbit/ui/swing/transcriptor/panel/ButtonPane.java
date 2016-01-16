package org.qbit.ui.swing.transcriptor.panel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.qbit.ui.swing.transcriptor.event.TextPaneEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//VS4E -- DO NOT REMOVE THIS LINE!
@Component
public class ButtonPane extends JPanel {

    private Logger logger = LogManager.getLogger(ButtonPane.class.getName());
    private static final long serialVersionUID = 1L;
    private JButton jButtonTranscript;
    private JButton jButtonClear;

    @Autowired
    TranscriptTextPane transcriptTextPane;
    @Autowired
    TextPaneEvent textPaneEvent;

    @PostConstruct
    private void initComponents() {
        setLayout(new GroupLayout());
        add(getJButton0(), new Constraints(new Leading(26, 10, 10), new Leading(23, 10, 10)));
        add(getJButton1(), new Constraints(new Leading(201, 10, 10), new Leading(23, 12, 12)));
        setSize(320, 70);
    }

    private JButton getJButton1() {
        if (jButtonClear == null) {
            jButtonClear = new JButton();
            jButtonClear.setText("Clear");
            jButtonClear.setPreferredSize(new Dimension(93, 26));
            jButtonClear.setMinimumSize(new Dimension(93, 26));
            jButtonClear.setMaximumSize(new Dimension(93, 26));
            jButtonClear.addActionListener(textPaneEvent);
        }
        return jButtonClear;
    }


    private JButton getJButton0() {
        if (jButtonTranscript == null) {
            jButtonTranscript = new JButton();
            jButtonTranscript.setText("Transcript");
            jButtonTranscript.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    logger.debug("transcript");
                }
            });
        }
        return jButtonTranscript;
    }

}
