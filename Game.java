import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Game {
    private board layout;

    public static final int WIDTH = 20;
    public static final int HEIGHT = 20;
    public static final int X = 30;
    public static final int Y = 16;
    protected JFrame window;

    public static final int BOMB_COUNT = 50;
    private int score_board_width = 100;
    private boolean end = false;
    private boolean win = false;
    private int flags;

    public Game(){
        window = new JFrame();

        layout = new Board();
        flags = BOMB_COUNT;

        window.setTitle("Minesweeper");
        window.setSize(X * WIDTH, Y * HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static BufferedImage resizeImage(BufferedImage originalImage, int width, int heigth) throws IOException {
        Image resultingImage = originalImage.getScaledInstance(width, heigth, Image.SCALE_DEFAULT);
        BufferedImage outputImage = new BufferedImage(width, heigth BufferedImage.TYPE_INT_RGB);
        outputImage.getGraphics(). drawImage(resultingImage, 0, 0, null);
        return outputImage;
    }

}
