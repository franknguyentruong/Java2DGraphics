
import javax.swing.JFrame;

public class ChessPawnDriver extends JFrame {
    
    public ChessPawnDriver() {

        //setBackground(Color.YELLOW);
		// Construct Class with Graphics Component
		ChessPawn pawn = new ChessPawn();
		// Add to JFrame
		add(pawn);
		// Set the Default Size and title
        setSize(400, 400);
        
        setTitle("Java 2D Chess Pawn");
        
        // Frame Default to be able to closd
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Center the Frame
        setLocationRelativeTo(null);		       
    }

    
    public static void main(String[] args) {   	
    	
        ChessPawnDriver myDriver = new ChessPawnDriver();
        myDriver.setVisible(true);
                 
    }
}