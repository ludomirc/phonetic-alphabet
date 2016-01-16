package org.qbit.ui.swing.transcriptor;

import javax.swing.*;

public class RunApp {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Launcher launcher = new Launcher();
                launcher.launch();
            }
        });

    }
}