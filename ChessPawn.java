import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.*;
import javax.swing.JPanel;

public class ChessPawn extends JPanel {
	

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Call methods to draw

        setBackground(Color.YELLOW);
           
        drawCircle1(g);     //1
        drawEllipse1(g);    //2
        drawRoundRect1(g);  //3
        drawEllipse2(g);    //4
        drawRect1(g);       //5
        drawEllipse3(g);    //6
        drawRoundRect2(g);  //7
        drawRoundRect3(g);  //8
        drawRect2(g);       //9
        drawEllipse4(g);    //10

    }
       
    // Method to draw a Circle
    private void drawCircle1(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;   
        Ellipse2D myCircle = new Ellipse2D.Double(103,85,75,75);    
        g2d.setColor(Color.black);
        g2d.setPaint(Color.GRAY);
        g2d.fill(myCircle);
        g2d.draw(myCircle);     
    }// end drawcircle1

    // Method to draw an Ellipse
    private void drawEllipse1(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;       
        Ellipse2D e = new Ellipse2D.Double(120, 155, 40, 15);    
        g2d.setColor(Color.red);
        g2d.setPaint(Color.GRAY);
        g2d.fill(e);
        g2d.draw(e);      
    }

    // Method to draw a Rectangle
    private void drawRoundRect1(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;    
        RoundRectangle2D myRR = new RoundRectangle2D.Double(115, 165, 50, 5, 10, 10);
        
        g2d.setColor(Color.BLACK);
        g2d.setPaint(Color.GRAY);
        g2d.fill(myRR);
        g2d.draw(myRR);     
    }// end drawroundrect1

    // Method to draw an Ellipse
    private void drawEllipse2(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;       
        Ellipse2D e = new Ellipse2D.Double(100, 170, 80, 15);    
        g2d.setColor(Color.red);
        g2d.setPaint(Color.GRAY);
        g2d.fill(e);
        g2d.draw(e);      
    }
    
    // Method to draw a Rectangle
    private void drawRect1(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;   
        Rectangle2D myRect = new Rectangle2D.Double(115,175,50,100);  
             
        g2d.setColor(Color.blue);
        g2d.setPaint(Color.GRAY);
        g2d.fill(myRect);
        g2d.draw(myRect);     
    }

    // Method to draw an Ellipse
    private void drawEllipse3(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;       
        Ellipse2D e = new Ellipse2D.Double(110, 255, 60, 30);    
        g2d.setColor(Color.red);
        g2d.setPaint(Color.GRAY);
        g2d.fill(e);
        g2d.draw(e);      
    }

    // Method to draw a Rectangle
    private void drawRoundRect2(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;    
        RoundRectangle2D myRR = new RoundRectangle2D.Double(100, 270, 80, 5, 10, 10);
        
        g2d.setColor(Color.BLACK);
        g2d.setPaint(Color.GRAY);
        g2d.fill(myRR);
        g2d.draw(myRR);     
    }

    // Method to draw a Rectangle
    private void drawRoundRect3(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;    
        RoundRectangle2D myRR = new RoundRectangle2D.Double(97, 275, 85, 10, 10, 10);
        
        g2d.setColor(Color.BLACK);
        g2d.setPaint(Color.GRAY);
        g2d.fill(myRR);
        g2d.draw(myRR);     
    }

    // Method to draw a Rectangle
    private void drawRect2(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;   
        Rectangle2D myRect = new Rectangle2D.Double(90,280,100,30);  
             
        g2d.setColor(Color.blue);
        g2d.setPaint(Color.GRAY);
        g2d.fill(myRect);
        g2d.draw(myRect);     
    }// end drawrect2    
    
    // Method to draw an Ellipse
    private void drawEllipse4(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;       
        Ellipse2D e = new Ellipse2D.Double(80, 290, 120, 30);    
        g2d.setColor(Color.red);
        g2d.setPaint(Color.GRAY);
        g2d.fill(e);
        g2d.draw(e);      
    }


}
