package org.qbit.ui.swing.transcriptor.event;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.qbit.ui.swing.transcriptor.panel.TranscriptTextPane;
import org.qbit.ui.swing.transcriptor.panel.TranscriptionTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import qbit.org.qbit.phonetic.alphabet.api.Alphabet;
import qbit.org.qbit.phonetic.alphabet.api.imp.PhoneticAlphabetPolishImp;

import javax.annotation.PostConstruct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Benek on 2016-01-15.
 */
@Component
public class TextPaneListener implements ActionListener {

    private Logger logger = LogManager.getLogger(ActionListener.class.getName());

    @Autowired
    TranscriptTextPane textPane;
    @Autowired
    TranscriptionTableModel tableModel;

    protected Alphabet alphabet;

    @PostConstruct
    void initListener() {
        alphabet = new PhoneticAlphabetPolishImp();
        ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (GuiActionType.getActionType(e.getActionCommand())) {
            case Clear:
                clear();
                break;
            case Transcript:
                transcript();
                break;
            default:
                String message = "unknown action command: " + e.getActionCommand();
                logger.error(message);
                throw new RuntimeException(message);
        }
    }

    private void transcript() {
        logger.debug("transcript");
        tableModel.setData(alphabet.transcriptWord(textPane.getText()));
    }

    private void clear() {
        logger.debug("clear");
        textPane.clear();
        tableModel.clear();
    }


}
