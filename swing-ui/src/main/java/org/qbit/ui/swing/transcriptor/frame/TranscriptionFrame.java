package org.qbit.ui.swing.transcriptor.frame;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.qbit.ui.swing.transcriptor.panel.TranscriptPane;
import org.qbit.ui.swing.transcriptor.panel.TranscriptionMenuBar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


//VS4E -- DO NOT REMOVE THIS LINE!
@Component
public class TranscriptionFrame extends JFrame {

    private Logger logger = LogManager.getLogger(ActionListener.class.getName());

    private static final long serialVersionUID = 1L;
    @Autowired
    private TranscriptionMenuBar transcriptionMenuBar;
    @Autowired
    private TranscriptPane transcriptPane;

    protected static final int WIDTH = 802;
    private static final int HEIGHT = 490;

    @PostConstruct
    private void initComponents() {

        setMinimumSize(new Dimension(WIDTH, HEIGHT));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setMaximumSize(new Dimension(WIDTH, HEIGHT));

        setLayout(new GroupLayout());
        add(transcriptPane, new Constraints(new Bilateral(4, 10, 788), new Bilateral(12, 9, 10, 415)));
        setJMenuBar(transcriptionMenuBar.getMenuBar());
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(TranscriptionFrame.EXIT_ON_CLOSE);
        setTitle("Transkryptor");
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource("/transkryptor-icon.png"));
        } catch (Exception e) {
            logger.error("cant load transkryptor-icon.  reason: " + e.getMessage());
        }
        setIconImage(img);
        getContentPane().setPreferredSize(this.getSize());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
