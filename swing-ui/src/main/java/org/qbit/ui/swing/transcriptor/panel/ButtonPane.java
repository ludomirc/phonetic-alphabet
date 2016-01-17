package org.qbit.ui.swing.transcriptor.panel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.qbit.ui.swing.transcriptor.event.GuiActionType;
import org.qbit.ui.swing.transcriptor.event.TextPaneListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

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
    TextPaneListener textPaneEvent;

    @PostConstruct
    private void initComponents() {
        setLayout(new GroupLayout());
        add(getJButtonTranscript(), new Constraints(new Leading(26, 10, 10), new Leading(23, 10, 10)));
        add(getJButtonClear(), new Constraints(new Leading(201, 10, 10), new Leading(23, 12, 12)));
        setSize(320, 70);
    }

    private JButton getJButtonClear() {
        if (jButtonClear == null) {
            jButtonClear = new JButton();
            jButtonClear.setText("Clear");
            jButtonClear.setActionCommand(GuiActionType.Clear.name());
            jButtonClear.setPreferredSize(new Dimension(93, 26));
            jButtonClear.setMinimumSize(new Dimension(93, 26));
            jButtonClear.setMaximumSize(new Dimension(93, 26));
            jButtonClear.addActionListener(textPaneEvent);
            jButtonClear.setActionCommand(GuiActionType.Clear.getCommand());
        }
        return jButtonClear;
    }

    private JButton getJButtonTranscript() {
        if (jButtonTranscript == null) {
            jButtonTranscript = new JButton();
            jButtonTranscript.setText("Transcript");
            jButtonTranscript.addActionListener(textPaneEvent);
            jButtonTranscript.setActionCommand(GuiActionType.Transcript.getCommand());
        }
        return jButtonTranscript;
    }

}
