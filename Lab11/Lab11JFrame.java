import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;

/**
 * A window with a text area that works as a simple text editor.
 * @author <em>Tyler</em>
 * @author <em>Henry and Steven</em>
 */
public class Lab11JFrame extends JFrame {

  /** Text area, in the center. */
  private JTextArea textArea;

  /**
   * Create a window with a 40x80-character text area in the center.
   */
  public Lab11JFrame() {
    // Create the text area.
    this.textArea  = new JTextArea("An Editor Window", 40, 80); // 40 lines high, 80 chars wide.

    // Add the text area to this window.
    this.getContentPane().add(this.textArea, "Center");
    
    // Set the window size to automatically fit the center text area
    this.pack();
  }
  
  /**
   * Returns the text area of the window
   * @return the text area of the window
   */
  public JTextArea getTextArea() {
    return textArea;
  }
  
  
  //mycode
  public void fileDisplay(String list) throws IOException{
    
    textArea.setText(""); 
    BufferedReader br = new BufferedReader(new FileReader(list));
    String line = br.readLine();
    
    while(!line.equals(null)){
      this.textArea.append(line + '\n'); 
      line = br.readLine();
    }
    
    br.close();
    
    //Set the window size to automatically fit the center text area
    this.pack();
  } 
  
  //tester 
  public static void main (String[] args){
    Lab11JFrame frame = new Lab11JFrame();
    frame.fileDisplay("C:\Users\tyler\OneDrive\Desktop\Summer 2022 Case Western\CSDS 132 Java\Week 7\Lab11\yurr.txt");
  }
}
