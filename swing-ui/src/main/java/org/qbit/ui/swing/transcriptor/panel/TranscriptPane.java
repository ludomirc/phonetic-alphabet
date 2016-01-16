package org.qbit.ui.swing.transcriptor.panel;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

@Component
//VS4E -- DO NOT REMOVE THIS LINE!
public class TranscriptPane extends JPanel {

    private static final long serialVersionUID = 1L;

    @Autowired
    private TranscriptTablePane transcriptTablePane;
    @Autowired
    private TranscriptTextPane transcriptTextPane;
    @Autowired
    private ButtonPane buttonPane;

    @PostConstruct
    private void initComponents() {
        setLayout(new GroupLayout());
        add(transcriptTablePane, new Constraints(new Leading(4, 401, 10, 10), new Leading(5, 399, 10, 10)));
        add(transcriptTextPane, new Constraints(new Leading(414, 364, 10, 10), new Leading(5, 288, 12, 12)));
        add(getButtonPane(), new Constraints(new Bilateral(417, 12, 308), new Leading(311, 84, 10, 10)));
        setSize(788, 411);
    }

    private ButtonPane getButtonPane() {
        buttonPane.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED, null, null));
        return buttonPane;
    }
}
