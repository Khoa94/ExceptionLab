package taojava.labs.exceptions;

import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 * A simple set of utilities for dealing with input and output.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class IOUtils
{
  /**
   * Prompt for and read an integer.
   */
  public static int readInt(PrintWriter pw, BufferedReader br, String prompt)
    throws Exception
  {
    if (!prompt.equals(""))
      {
        pw.print(prompt);
        pw.flush();
      } // if there is a prompt
    String response = br.readLine();
    return Integer.parseInt(response);
  } // readInt
} // class IOUtils
