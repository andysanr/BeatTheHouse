package main;
import inputs.MouseInputs;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class MenuPanel extends JPanel {

    private MouseInputs mouseInputs;
    private BufferedImage menuImg;

    public MenuPanel () {

        mouseInputs = new MouseInputs(this);

        importImg();

        setPanelsize();
        addMouseListener(mouseInputs);
        addMouseListener(mouseInputs);
    }

    private void importImg() {
        InputStream is = getClass().getResourceAsStream("/Cards.png");

        try {
            menuImg = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();;
            }
        }
    }

    private void setPanelsize() {
        Dimension size = new Dimension(1280, 720);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);

    }

}
