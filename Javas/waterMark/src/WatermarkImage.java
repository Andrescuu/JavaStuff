import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class WatermarkImage {

    public static void main(String[] args) {

        File origFile = new File("C:/Users/Drescu/Desktop/Javas/test.jpg");
        ImageIcon icon = new ImageIcon(origFile.getPath());

        // create BufferedImage object of same width and height as of original image
        BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth() + 200,
                icon.getIconHeight() + 200, BufferedImage.TYPE_INT_RGB);

        // create graphics object and add original image to it
        Graphics graphics = bufferedImage.getGraphics();
        graphics.drawImage(icon.getImage(), 300, 300, null);

        // set font for the watermark text
        graphics.setFont(new Font("Arial", Font.BOLD, 30));

        //unicode characters for (c) is \u00a9
        String watermark = "\u00a9 JavaXp.com";

        // add the watermark text
        graphics.drawString(watermark, 0, icon.getIconHeight() / 2);
        graphics.dispose();

        File newFile = new File("C:/Users/Drescu/Desktop/Javas/WatermarkedImage.jpg");
        try {
            ImageIO.write(bufferedImage, "jpg", newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(newFile.getPath() + " created successfully!");

    }
}
