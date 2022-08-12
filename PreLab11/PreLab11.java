/** Tyler Youk Pre-Lab 11 */

/** Lab 11 will introduce you to reading input from a file and writing data to a file. 
  * As a warmup, we are going to read input from a String. Look up the StringReader class in the API. 
  * Create a StringReader object using the string "CSDS132". 
  * Then, use the read method to read each character, one at a time, from the string. 
  * Finally, state how you can tell when the last character of the String is read.
  * You may give an English description or you can enter Java code that does the test. */

import java.io.*;
import java.io.StringReader;

public class PreLab11 {

  
  /** Testing in main method since easy test */
  public static void main (String[] args){
    String data = "CSDS132";
    StringReader CSDS132 = new StringReader(data); //creating new StringReader
    System.out.println("StringReader: " + CSDS132);  //Testing to see what StringReader looks like
    char[] CSDSArray = new char[10]; //Creating new Array, will read StringReader and copy characters into Array
    char[] CSDSArray3 = new char[10]; //new Array for testing
    char[] CSDSArray6 = new char[10]; //new Array for testing

     
    try {
    /** read() will simply read character, read(char[] array) will read character and put into array
      * StringReader seems to work best with try / catch block due to possible exceptions */
      CSDS132.read(CSDSArray);  //reading CSDS132 and copying characters to CSDSArray
      System.out.print("Data read from the string:"); 
      System.out.println(CSDSArray); //SHOULD print all characters
      CSDS132.reset();
      CSDS132.skip(3);
      CSDS132.read(CSDSArray3);  //reading CSDS132 from position 3 and copying characters to a new Array
      System.out.print("Data read from the string:"); 
      System.out.println(CSDSArray3);  //SHOULD only print S132
      

      System.out.println(CSDS132.markSupported()); //seeing if mark is supported
      CSDS132.mark(2); //marks method at end of String, so that when reset is called it starts at the end; The 2 is the amount characters that can be read after the mark
      System.out.println(CSDS132.ready()); //seeing if StringReader is ready from mark
      CSDS132.reset();
      CSDS132.read(CSDSArray6);  //reading CSDS132 from position 6 and copying characters to a new Array
      System.out.print("Data read from the string:"); 
      System.out.println(CSDSArray6);  //SHOULD print nothing since we are starting at the end of the String

      
      
      
      //we know that the last character is read since the output shows that every character intended was read

      CSDS132.close(); //closes stream
    }
    catch(Exception e) {
      e.getStackTrace();
    } //must throw this exception or will run error*/

    
    
    
  }
  
}