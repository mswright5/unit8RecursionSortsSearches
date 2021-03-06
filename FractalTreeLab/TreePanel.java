import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.Line2D;
import javax.swing.*;

public class TreePanel extends JPanel
{
    private final int PANEL_WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() - 200;
    private final int PANEL_HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 200;

    private final int BOTTOMX = PANEL_WIDTH / 2, BOTTOMY = PANEL_HEIGHT/2;

    private final int ANGLE = 30;

    private int current; //current order

    //-----------------------------------------------------------------
    //  Sets the initial fractal order to the value specified.
    //-----------------------------------------------------------------
    public TreePanel (int currentOrder)
    {
        current = currentOrder;
        setBackground (Color.black);
        setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }

    //-----------------------------------------------------------------
    //  Draws the fractal recursively. Base case is an order of 1 for
    //  which a simple straight line is drawn. Otherwise three
    //  intermediate points are computed, and each line segment is
    //  drawn as a fractal.
    //-----------------------------------------------------------------
    public void drawFractal (int order, int x1, int y1, int angleDegree,
    Graphics page)
    {
        int x2 = x1 - (int)(Math.sin(Math.toRadians(angleDegree))*order*10);
        int y2 = y1 - (int)(Math.cos(Math.toRadians(angleDegree))*order*10);

        Graphics2D page2 = (Graphics2D) page;
        page2.setStroke(new BasicStroke(order));
        if (order == 1)
            page.drawLine (x1, y1, x2, y2);
        else
        {
            page.drawLine (x1, y1, x2, y2);
            drawFractal(order-1, x2, y2, angleDegree + ANGLE, page);
            drawFractal(order-1, x2, y2, angleDegree - ANGLE, page);
        }
    }

    //-----------------------------------------------------------------
    //  Performs the initial calls to the drawFractal method.
    //-----------------------------------------------------------------
    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);

        page.setColor (Color.RED);
        drawFractal (current, BOTTOMX, BOTTOMY, 0, page);

        page.setColor (Color.BLUE);
        drawFractal (current, BOTTOMX, BOTTOMY, 90, page);

        page.setColor (Color.GREEN);
        drawFractal (current, BOTTOMX, BOTTOMY, 180, page);

        page.setColor (Color.YELLOW);
        drawFractal (current, BOTTOMX, BOTTOMY, 270, page);
    }

    //-----------------------------------------------------------------
    //  Sets the fractal order to the value specified.
    //-----------------------------------------------------------------
    public void setOrder (int order)
    {
        current = order;
    }

    //-----------------------------------------------------------------
    //  Returns the current order.
    //-----------------------------------------------------------------
    public int getOrder ()
    {
        return current;
    }
}
