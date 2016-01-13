package org.qbit.ui.swing.transcriptor;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.qbit.ui.swing.transcriptor.panels.TranscriptPane;

import javax.swing.*;

//VS4E -- DO NOT REMOVE THIS LINE!
public class TranscriptorFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private TranscriptPane transcriptPane0;
    private JMenuItem jMenuItem0;
    private JMenu jMenu0;
    private JMenuBar jMenuBar0;
    private JMenuItem jMenuItem2;
    private JMenuItem jMenuItem3;
    private JMenu jMenu2;
    private JSeparator jSeparator0;
    private JMenuItem jMenuItem1;
    private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";

    public TranscriptorFrame() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new GroupLayout());
        add(getTranscriptPane0(), new Constraints(new Bilateral(4, 10, 788), new Bilateral(12, 9, 10, 415)));
        setJMenuBar(getJMenuBar0());
        setSize(802, 452);
    }

    private JMenuItem getJMenuItem1() {
        if (jMenuItem1 == null) {
            jMenuItem1 = new JMenuItem();
            jMenuItem1.setText("Save");
        }
        return jMenuItem1;
    }

    private JSeparator getJSeparator0() {
        if (jSeparator0 == null) {
            jSeparator0 = new JSeparator();
        }
        return jSeparator0;
    }

    private JMenu getJMenu2() {
        if (jMenu2 == null) {
            jMenu2 = new JMenu();
            jMenu2.setText("Help");
            jMenu2.add(getJMenuItem3());
        }
        return jMenu2;
    }

    private JMenuItem getJMenuItem3() {
        if (jMenuItem3 == null) {
            jMenuItem3 = new JMenuItem();
            jMenuItem3.setText("About");
        }
        return jMenuItem3;
    }

    private JMenuItem getJMenuItem2() {
        if (jMenuItem2 == null) {
            jMenuItem2 = new JMenuItem();
            jMenuItem2.setText("Exit");
        }
        return jMenuItem2;
    }

    private JMenuBar getJMenuBar0() {
        if (jMenuBar0 == null) {
            jMenuBar0 = new JMenuBar();
            jMenuBar0.add(getJMenu0());
            jMenuBar0.add(getJMenu2());
        }
        return jMenuBar0;
    }

    private JMenu getJMenu0() {
        if (jMenu0 == null) {
            jMenu0 = new JMenu();
            jMenu0.setText("File");
            jMenu0.add(getJMenuItem0());
            jMenu0.add(getJSeparator0());
            jMenu0.add(getJMenuItem1());
            jMenu0.add(getJMenuItem2());
        }
        return jMenu0;
    }

    private JMenuItem getJMenuItem0() {
        if (jMenuItem0 == null) {
            jMenuItem0 = new JMenuItem();
            jMenuItem0.setText("Open");
        }
        return jMenuItem0;
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
                TranscriptorFrame frame = new TranscriptorFrame();
                frame.setDefaultCloseOperation(TranscriptorFrame.EXIT_ON_CLOSE);
                frame.setTitle("TranscriptorFrame");
                frame.getContentPane().setPreferredSize(frame.getSize());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

}
