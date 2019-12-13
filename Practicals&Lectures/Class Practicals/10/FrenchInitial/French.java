/**
  Final version of main class to launch English to French translation.

  <ul>

    <li>Edit: make translation editable</li>

    <li>Reset: reset translation parameters</li>

    <li>Quit: quit application</li>

  </ul>

  @author       Simon Jones (based on original code by Kenneth J. Turner)
  @version      30/11/2015
*/

public class French {

  /**
    Create translation application.

    @param args         command-line arguments (not used)
  */

  public static void main(String[] args) {
    FrenchGUI application = new FrenchGUI("French");    // create French window
    application.setLocation(100,100);                   // place the window
    application.setVisible(true);                       // make window visible
  }

} 
