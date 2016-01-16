package org.qbit.ui.swing.transcriptor.panel;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Benek on 2016-01-13.
 */
@Component
public class TranscriptionMenuBar {

    private JMenuBar jMenuBar;

    private JMenu jMenuFile;
    private JMenuItem jMenuItemOpenFile;
    private JMenuItem jMenuItemExit;
    private JMenuItem jMenuItemSave;

    private JMenuItem jMenuItemAbout;
    private JMenu jMenuHelp;


    public JMenuBar getMenuBar() {
        if (jMenuBar == null) {
            jMenuBar = new JMenuBar();
            jMenuBar.add(getJMenuFile());
            jMenuBar.add(getJMenuHelp());
        }
        return jMenuBar;
    }

    private JMenuItem getJMenuItemSave() {
        if (jMenuItemSave == null) {
            jMenuItemSave = new JMenuItem();
            jMenuItemSave.setText("Save");
        }
        return jMenuItemSave;
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
            jMenuItemExit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    exit();
                }
            });
        }
        return jMenuItemExit;
    }

    private void exit() {
        System.exit(0);
    }

    private JMenu getJMenuFile() {
        if (jMenuFile == null) {
            jMenuFile = new JMenu();
            jMenuFile.setText("File");
            jMenuFile.add(getJMenuItemOpenFile());
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
}
