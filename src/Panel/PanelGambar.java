package Panel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

//เป็น Class ที่ทำการ Set Background ในหน้า GamePanel
public class PanelGambar extends JPanel{
    Image gambar;
    public PanelGambar(){
        gambar = new ImageIcon(getClass().getResource("/projectgame/Background1.png")).getImage();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D)g.create();
        gd.drawImage(gambar,0,0,getWidth(),getHeight(),null);
        gd.dispose();
    }
}
