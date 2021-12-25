package clock;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import clock.clock.SimpleDigitalClock;

public class MainPart 
{
	public static void main(String[] args) {  
        JFrame frm = new JFrame();  
        frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
        SimpleDigitalClock clock1 = new SimpleDigitalClock();  
        frm.setTitle("Digital Clock");
        frm.add(clock1);  
        frm.pack();    
        frm.setVisible(true);  
}
}
