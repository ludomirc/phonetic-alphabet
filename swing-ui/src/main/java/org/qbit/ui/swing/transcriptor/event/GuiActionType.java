package org.qbit.ui.swing.transcriptor.event;

/**
 * Created by Benek on 2016-01-16.
 */
public enum GuiActionType {

    Clear(1, "clear"),
    Transcript(2, "transcript"),
    _NotRecognized(-1, "not recognized");

    private final int id;
    private final String command;

    GuiActionType(int id, String command) {
        this.id = id;
        this.command = command;
    }

    public int getId() {
        return id;
    }

    public String getCommand() {
        return command;
    }

    public static GuiActionType getActionType(String command) {
        GuiActionType actionType = _NotRecognized;

        GuiActionType[] actionTypes = GuiActionType.values();
        for (GuiActionType elType : actionTypes) {
            if (elType.getCommand().equals(command)) {
                actionType = elType;
                break;
            }
        }
        return actionType;
    }
}
