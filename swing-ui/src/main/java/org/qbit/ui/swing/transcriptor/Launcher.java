package org.qbit.ui.swing.transcriptor;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

/**
 * Launcher class is required for run spring container
 * Created by Benek on 2016-01-15.
 */
public class Launcher {

    private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";


    private static void installLnF() {
        try {
            String lnfClassname = PREFERRED_LOOK_AND_FEEL;
            if (lnfClassname == null)
                lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(lnfClassname);
        } catch (Exception e) {
            System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL + " on this platform:" + e.getMessage());
        }
    }

    public void launch() {
        installLnF();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AutowireCapableBeanFactory acbFactory = context.getAutowireCapableBeanFactory();
        acbFactory.autowireBean(this);

    }
}