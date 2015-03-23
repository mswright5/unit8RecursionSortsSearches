import java.awt.*;
import javax.swing.JPanel;

public class TreePanel extends JPanel
{
    private final int PANEL_WIDTH = 600;
    private final int PANEL_HEIGHT = 600;

    private final int TOPX = 200, TOPY = 20;
    private final int LEFTX = 60, LEFTY = 300;
    private final int RIGHTX = 340, RIGHTY = 300;

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
    public void drawFractal (int order, int x1, int y1, int x3, int y3,
    Graphics page)
    {
        int deltaX, deltaY, x2, y2;

        if (order == 1)
            page.drawLine (x1, y1, x3, y3);
        else
        {
            x2 = int(Math.

            drawFractal (order-1, x1, y1, x2, y2, page);
            drawFractal (order-1, x2, y2, x3, y3, page);
        }
    }

    //-----------------------------------------------------------------
    //  Performs the initial calls to the drawFractal method.
    //-----------------------------------------------------------------
    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);

        page.setColor (Color.green);

        drawFractal (current, TOPX, TOPY, LEFTX, LEFTY, page);
        drawFractal (current, LEFTX, LEFTY, RIGHTX, RIGHTY, page);
        drawFractal (current, RIGHTX, RIGHTY, TOPX, TOPY, page);
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
