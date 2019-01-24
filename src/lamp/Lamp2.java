/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamp;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Lamp2 extends Applet implements Runnable {
Color y =Color.YELLOW;
Color b =Color.BLUE;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        Thread th = new Thread(this);
        th.start();
        // TODO start asynchronous download of heavy resources
    }

    public void paint(Graphics g) {
        
        g.setColor(y);
        g.fillRect(0, 250, 290, 80);
        g.setColor(Color.BLACK);
  
        g.drawLine(125, 250, 125, 160);
        g.drawLine(175, 250, 175, 160);

       
        g.drawArc(85, 157, 130, 50, -65, 312);
        g.drawArc(85, 87, 130, 50, 62, 58);

        
        g.drawLine(85, 177, 119, 89);
        g.drawLine(215, 177, 181, 89);

        g.setColor(y);
        g.fillArc(78, 120, 40, 40, 63, -174);
        g.fillOval(120, 96, 40, 40);
        g.fillArc(173, 100, 40, 40, 110, 180);
    }
    public void update ()
    {
        
        if(y==Color.YELLOW)
        {
            y=b;
        }
        else
        {
            y=Color.YELLOW;
        }
        
        
    }
    public void run ()
    {
        while(true)
        {
            repaint();
            update();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Lamp2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
   
}
