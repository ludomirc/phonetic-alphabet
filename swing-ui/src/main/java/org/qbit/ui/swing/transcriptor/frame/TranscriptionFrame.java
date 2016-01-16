package org.qbit.ui.swing.transcriptor.frame;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.qbit.ui.swing.transcriptor.panel.TranscriptPane;
import org.qbit.ui.swing.transcriptor.panel.TranscriptionMenuBar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;


//VS4E -- DO NOT REMOVE THIS LINE!
@Component
public class TranscriptionFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    @Autowired
    private TranscriptionMenuBar transcriptionMenuBar;
    @Autowired
    private TranscriptPane transcriptPane;

    @PostConstruct
    private void initComponents() {

        setLayout(new GroupLayout());
        add(transcriptPane, new Constraints(new Bilateral(4, 10, 788), new Bilateral(12, 9, 10, 415)));
        setJMenuBar(transcriptionMenuBar.getMenuBar());
        setSize(802, 452);
        setDefaultCloseOperation(TranscriptionFrame.EXIT_ON_CLOSE);
        setTitle("TranscriptionFrame");
        getContentPane().setPreferredSize(this.getSize());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
