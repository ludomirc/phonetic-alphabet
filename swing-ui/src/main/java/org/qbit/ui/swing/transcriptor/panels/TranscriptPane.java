package org.qbit.ui.swing.transcriptor.panels;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

//VS4E -- DO NOT REMOVE THIS LINE!
public class TranscriptPane extends JPanel {

    private static final long serialVersionUID = 1L;
    private TranscriptTablePane transcriptTablePane0;
    private TranscriptTextPane transcriptTextPane0;
    private ButtonPane buttonPane0;
    private ButtonPane buttonPane1;

    public TranscriptPane() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new GroupLayout());
        add(getTranscriptTablePane0(), new Constraints(new Leading(4, 401, 10, 10), new Leading(5, 399, 10, 10)));
        add(getTranscriptTextPane0(), new Constraints(new Leading(414, 364, 10, 10), new Leading(5, 288, 12, 12)));
        add(getButtonPane1(), new Constraints(new Bilateral(417, 12, 308), new Leading(311, 84, 10, 10)));
        setSize(788, 411);
    }

    private ButtonPane getButtonPane1() {
        if (buttonPane1 == null) {
            buttonPane1 = new ButtonPane();
            buttonPane1.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED, null, null));
        }
        return buttonPane1;
    }

    private TranscriptTablePane getTranscriptTablePane0() {
        if (transcriptTablePane0 == null) {
            transcriptTablePane0 = new TranscriptTablePane();
            transcriptTablePane0.add(getButtonPane0(), new Constraints(new Leading(88, 320, 10, 10), new Leading(8, 70, 10, 10)));
        }
        return transcriptTablePane0;
    }

    private ButtonPane getButtonPane0() {
        if (buttonPane0 == null) {
            buttonPane0 = new ButtonPane();
        }
        return buttonPane0;
    }

    private TranscriptTextPane getTranscriptTextPane0() {
        if (transcriptTextPane0 == null) {
            transcriptTextPane0 = new TranscriptTextPane();
        }
        return transcriptTextPane0;
    }

}
