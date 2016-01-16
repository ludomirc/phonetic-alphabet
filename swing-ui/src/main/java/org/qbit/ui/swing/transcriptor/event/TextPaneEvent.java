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

        String command = e.getActionCommand();
        GuiActionType actionType = GuiActionType.getActionType(e.getActionCommand());

        switch (actionType) {
            case Clear:
                clear();
                break;
            case Transcript:
                transcript();
                break;
            default:
                break;
        }
    }

    private void transcript() {
        logger.debug("transcript");
    }

    private void clear() {
        logger.debug("clear");
        textPane.clear();
    }


}
