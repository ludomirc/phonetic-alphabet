package org.qbit.ui.swing.transcriptor.panel;

import org.springframework.stereotype.Component;
import qbit.org.qbit.phonetic.alphabet.api.Pair;

import javax.annotation.PostConstruct;
import javax.swing.table.AbstractTableModel;
import java.util.List;
import java.util.Vector;

/**
 * Created by Benek on 2016-01-17.
 */
@Component
public class TranscriptionTableModel extends AbstractTableModel {

    String[] columnName;


    Vector<Pair> rowData;

    @PostConstruct
    public void initTableModel() {
        columnName = new String[]{"Character", "English", "PL Transcript"};
        rowData = new Vector<Pair>();
    }

    @Override
    public int getRowCount() {
        return rowData.size();
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return rowData.get(rowIndex).getCharacter();
            case 1:
                return rowData.get(rowIndex).getOrigin();
            case 2:
                return rowData.get(rowIndex).getTranscript();

        }
        return "default";
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    public Vector<Pair> getRowData() {
        return rowData;
    }

    public void setData(List<Pair> date) {
        rowData = new Vector<Pair>(date);
        fireTableDataChanged();
    }

    public void clear() {
        rowData = new Vector<Pair>();
        fireTableDataChanged();
    }

}
