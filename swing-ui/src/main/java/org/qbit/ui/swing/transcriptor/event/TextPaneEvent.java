package org.qbit.ui.swing.transcriptor.event;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.qbit.ui.swing.transcriptor.panel.TranscriptTextPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Benek on 2016-01-15.
 */
@Component
public class TextPaneEvent implements ActionListener {

    @Autowired
    TranscriptTextPane textPane;

    private Logger logger = LogManager.getLogger(ActionListener.class.getName());

    @Override
    public void actionPerformed(ActionEvent e) {
        logger.debug("clear event");
        textPane.clear();
    }


}
