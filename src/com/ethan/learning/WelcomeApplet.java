package com.ethan.learning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class WelcomeApplet extends JApplet {

    @Override
    public void init() {
        EventQueue.invokeLater(() -> {
            setLayout(new BorderLayout());
            JLabel label = new JLabel(getParameter("greeting"), SwingConstants.CENTER);
            label.setFont(new Font("Serif", Font.BOLD, 18));
            add(label, BorderLayout.CENTER);

            JPanel panel = new JPanel();

            JButton robinButton = new JButton("Robin");
            robinButton.addActionListener(makeAction("https://baidu.com"));
            panel.add(robinButton);

            JButton ethanButton = new JButton("Ethan");
            ethanButton.addActionListener(makeAction("mailto:wei.liu@youhualin.com"));
            panel.add(ethanButton);
            add(panel, BorderLayout.SOUTH);
        });
    }

    private ActionListener makeAction(final String urlString) {
        return event -> {
            try {
                getAppletContext().showDocument(new URL(urlString));
            } catch(MalformedURLException e){
                e.printStackTrace();
            }
        };
    }
}

