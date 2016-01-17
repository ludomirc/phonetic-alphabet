package org.qbit.ui.swing.transcriptor;

import javax.swing.*;

/**
 * Entry point to run application
 * Created by Benek on 2016-01-15.
 */
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