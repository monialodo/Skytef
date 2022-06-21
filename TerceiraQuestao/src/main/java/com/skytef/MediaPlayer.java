package com.skytef;

import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.player.embedded.fullscreen.adaptive.AdaptiveFullScreenStrategy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;

public class MediaPlayer {

    public static void main(String[] args) throws FileNotFoundException {
        MediaPlayer mediaPlayer = new MediaPlayer();
    }

    private final JFrame frame;

    private final EmbeddedMediaPlayerComponent mediaPlayerComponent;


    public MediaPlayer() throws FileNotFoundException {
        frame = new JFrame("My Media Player");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                mediaPlayerComponent.release();
                System.exit(0);
            }
        });

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        mediaPlayerComponent = new EmbeddedMediaPlayerComponent(
            null,
            null,
            new AdaptiveFullScreenStrategy(frame),
            null,
            null
        );
        contentPane.add(mediaPlayerComponent, BorderLayout.CENTER);
        JPanel controlsPane = new JPanel();
        controlsPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton closeButton = new JButton("Close");
        controlsPane.add(closeButton);
        contentPane.add(controlsPane, BorderLayout.SOUTH);


        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.setContentPane(contentPane);
        frame.setVisible(true);

        String path = "http://llamitaweb.com.br/videoplayback.mp4?raw=true";
        try {
            mediaPlayerComponent.mediaPlayer().fullScreen().set(true);
            mediaPlayerComponent.mediaPlayer().media().play(path);
        } catch (Exception e) {
            e.printStackTrace();
            throw new FileNotFoundException("File not found");
        }
    }
}