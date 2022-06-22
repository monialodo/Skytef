package com.skytef;

import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.player.embedded.fullscreen.adaptive.AdaptiveFullScreenStrategy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.HttpURLConnection;
import java.net.URL;

public class MediaPlayer {

    public static void main(String[] args)  {
        MediaPlayer mediaPlayer = new MediaPlayer();
    }

    private final JFrame frame;

    private final EmbeddedMediaPlayerComponent mediaPlayerComponent;


    public MediaPlayer()  {
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


        closeButton.addActionListener(e -> frame.dispose());

        frame.setContentPane(contentPane);
        frame.setVisible(true);


        String path = "https://github.com/monialodo/TesteJava/blob/main/TerceiraQuestao/videoplayback.mp4?raw=true";
        try {
            final URL url = new URL(path);
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();
            int responseCode = huc.getResponseCode();
            if (responseCode == 200) {
                mediaPlayerComponent.mediaPlayer().fullScreen().set(true);
                mediaPlayerComponent.mediaPlayer().media().play(path);

            } else {
                throw new Exception("");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Arquivo não encontrado");
        }
    }

}