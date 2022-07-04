import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class MyPanel extends JPanel {
    public Player player;

    public MyPanel(Player player){
        setBounds(Constants.FRAME_BOUNDS);
        this.player = player;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;

        drawBackground(g2d);

        g2d.setColor(Constants.PLAYER);
        Rectangle bounds = Constants.MOVE_BOUNDS;
        g2d.drawRect(bounds.x, bounds.y, bounds.width, bounds.height);

        System.out.println(bounds);
    }

    public void drawBackground(Graphics2D g2d){
        g2d.setColor(Constants.GRASS);
        g2d.fillRect(0, 0, Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);
    }
}