package org.qbit.ui.swing.transcriptor;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.qbit.ui.swing.transcriptor.panels.TranscriptPane;
import org.qbit.ui.swing.transcriptor.panels.TranscriptionMenuBar;

import javax.swing.*;

//VS4E -- DO NOT REMOVE THIS LINE!
public class TranscriptionFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private TranscriptionMenuBar transcriptionMenuBar;
    private TranscriptPane transcriptPane0;


    private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";

    public TranscriptionFrame() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new GroupLayout());
        add(getTranscriptPane0(), new Constraints(new Bilateral(4, 10, 788), new Bilateral(12, 9, 10, 415)));
        setJMenuBar(getTranscriptionMenuBar().getMenuBar());
        setSize(802, 452);
    }

    private TranscriptPane getTranscriptPane0() {
        if (transcriptPane0 == null) {
            transcriptPane0 = new TranscriptPane();
        }
        return transcriptPane0;
    }

    private static void installLnF() {
        try {
            String lnfClassname = PREFERRED_LOOK_AND_FEEL;
            if (lnfClassname == null)
                lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(lnfClassname);
        } catch (Exception e) {
            System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL + " on this platform:" + e.getMessage());
        }
    }

    /**
     * Main entry of the class.
     * Note: This class is only created so that you can easily preview the result at runtime.
     * It is not expected to be managed by the designer.
     * You can modify it as you like.
     */
    public static void main(String[] args) {
        installLnF();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TranscriptionFrame frame = new TranscriptionFrame();
                frame.setDefaultCloseOperation(TranscriptionFrame.EXIT_ON_CLOSE);
                frame.setTitle("TranscriptionFrame");
                frame.getContentPane().setPreferredSize(frame.getSize());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public TranscriptionMenuBar getTranscriptionMenuBar() {
        if (transcriptionMenuBar == null) {
            transcriptionMenuBar = new TranscriptionMenuBar();
        }
        return transcriptionMenuBar;
    }
}
