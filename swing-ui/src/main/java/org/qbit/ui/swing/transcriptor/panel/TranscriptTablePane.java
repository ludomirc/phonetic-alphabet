package org.qbit.ui.swing.transcriptor.panel;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

@Component
//VS4E -- DO NOT REMOVE THIS LINE!
public class TranscriptTablePane extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTable jTable0;
    private JScrollPane jScrollPane0;

    public TranscriptTablePane() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new GroupLayout());
        add(getJScrollPane0(), new Constraints(new Leading(2, 393, 10, 10), new Bilateral(4, 7, 10, 336)));
        setSize(401, 347);
    }

    private JScrollPane getJScrollPane0() {
        if (jScrollPane0 == null) {
            jScrollPane0 = new JScrollPane();
            jScrollPane0.setViewportView(getJTable0());
        }
        return jScrollPane0;
    }

    private JTable getJTable0() {
        if (jTable0 == null) {
            jTable0 = new JTable();
            jTable0.setModel(new DefaultTableModel(new Object[][]{{"0x0", "0x1",}, {"1x0", "1x1",}, {"1x0", "1x1",},}, new String[]{"Character", "English", "Polish"}) {
                private static final long serialVersionUID = 1L;
                Class<?>[] types = new Class<?>[]{Object.class, Object.class, Object.class,};

                public Class<?> getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }
            });
        }
        return jTable0;
    }

}
