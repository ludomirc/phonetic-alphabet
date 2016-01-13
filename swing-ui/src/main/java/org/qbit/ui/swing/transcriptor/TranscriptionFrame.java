package org.qbit.ui.swing.transcriptor;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.qbit.ui.swing.transcriptor.panels.TranscriptPane;

import javax.swing.*;

//VS4E -- DO NOT REMOVE THIS LINE!
public class TranscriptionFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private TranscriptPane transcriptPane0;
    private JMenuItem jMenuItemOpenFile;
    private JMenu jMenuFile;
    private JMenuBar jMenuBar0;
    private JMenuItem jMenuItemExit;
    private JMenuItem jMenuItemAbout;
    private JMenu jMenuHelp;
    private JSeparator jSeparator0;
    private JMenuItem jMenuItemSave;
    private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";

    public TranscriptionFrame() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new GroupLayout());
        add(getTranscriptPane0(), new Constraints(new Bilateral(4, 10, 788), new Bilateral(12, 9, 10, 415)));
        setJMenuBar(getJMenuBar0());
        setSize(802, 452);
    }

    private JMenuItem getJMenuItemSave() {
        if (jMenuItemSave == null) {
            jMenuItemSave = new JMenuItem();
            jMenuItemSave.setText("Save");
        }
        return jMenuItemSave;
    }

    private JSeparator getJSeparator0() {
        if (jSeparator0 == null) {
            jSeparator0 = new JSeparator();
        }
        return jSeparator0;
    }

    private JMenu getJMenuHelp() {
        if (jMenuHelp == null) {
            jMenuHelp = new JMenu();
            jMenuHelp.setText("Help");
            jMenuHelp.add(getJMenuItem3());
        }
        return jMenuHelp;
    }

    private JMenuItem getJMenuItem3() {
        if (jMenuItemAbout == null) {
            jMenuItemAbout = new JMenuItem();
            jMenuItemAbout.setText("About");
        }
        return jMenuItemAbout;
    }

    private JMenuItem getJMenuItemExit() {
        if (jMenuItemExit == null) {
            jMenuItemExit = new JMenuItem();
            jMenuItemExit.setText("Exit");
        }
        return jMenuItemExit;
    }

    private JMenuBar getJMenuBar0() {
        if (jMenuBar0 == null) {
            jMenuBar0 = new JMenuBar();
            jMenuBar0.add(getJMenuFile());
            jMenuBar0.add(getJMenuHelp());
        }
        return jMenuBar0;
    }

    private JMenu getJMenuFile() {
        if (jMenuFile == null) {
            jMenuFile = new JMenu();
            jMenuFile.setText("File");
            jMenuFile.add(getJMenuItemOpenFile());
            jMenuFile.add(getJSeparator0());
            jMenuFile.add(getJMenuItemSave());
            jMenuFile.add(getJMenuItemExit());
        }
        return jMenuFile;
    }

    private JMenuItem getJMenuItemOpenFile() {
        if (jMenuItemOpenFile == null) {
            jMenuItemOpenFile = new JMenuItem();
            jMenuItemOpenFile.setText("Open");
        }
        return jMenuItemOpenFile;
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

}
