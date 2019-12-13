/**
  Final version of main class to support the directory program. Maintain a
  telephone directory with names and numbers.

  <ul>

    <li>Enter: create directory entry from name/phone fields</li>

    <li>Find: search directory for name field, setting name/phone fields</li>

    <li>
      Delete: delete directory entry for name field, setting name/phone fields
    </li>

  </ul>

  @author       Simon Jones (based on original code by Kenneth J. Turner)
  @version      16/11/2015
*/

public class Directory {

  /**
    Create rainfall application.

    @param args         command-line arguments (not used)
  */
  public static void main(String[] args) {
    DirectoryGUI application;
    application = new DirectoryGUI("Directory");// create directory window
    application.setLocation(100,100);           //place the window
    application.setVisible(true);               // make window visible
  }

}
