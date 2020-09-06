import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window extends Frame {
    public Window(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge= new Font("sansSerif", Font.BOLD, 20);
        Font sansSerifSmall= new Font("sansSerif", Font.BOLD, 14);
        g.setFont(sansSerifLarge);
        g.drawString("I am Progressing in Java", 80, 70);
        g.setFont(sansSerifSmall);
        g.drawString("by Gafar Olanipekun", 80, 100);

    }
}
