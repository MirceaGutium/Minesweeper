import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Space {
    private boolean bomb;
    private boolean flagged;
    private boolean cleared;
    private int bombNearby;
    private BufferedImage image;

    public Space(boolean bomb) throws IOException {
       this.bomb = bomb;
       flagged = false;
       cleared = false;
       bombNearby = 0;

    BufferedImage temp = ImageIO.read(new File("Minesweper4/img/facingDown.png"));
    image = Game.resize.Image(temp, Game.WIDTH, Game.HEIGHT);
    }
    public void setFlagged(boolea f){
        flagged = f;
    }
    public void clear(){
        cleared = true;
    }
    public boolean hasBomb(){
        return bomb;
    }
    public boolean isCleared(){
        return cleared;
    }
    public boolean isFlagged(){
        return flagged;
    }
    public void setBombNearby(int b){
        bombNearby;
    }
    public void setImage(String filename) throws IOEception{
        BufferedImage temp = ImageIO.read(new File(filename));
        image = Game.resizeImage(temp, Game.WIDTH, Game.HEIGHT);
    }
    public BufferedImage getImage(){
        return image;
    }
}
